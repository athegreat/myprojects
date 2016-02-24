
package cripto;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import sun.misc.*;
import javax.crypto.spec.DESedeKeySpec;


/**
 *
 * @author Alexander
 */
public class TripleDES 
{
    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    private KeySpec myKeySpec;
    private SecretKeyFactory mySecretKeyFactory;
    private Cipher cipher;
    byte[] keyAsBytes;
    private String myEncryptionKey;
    private String myEncryptionScheme;
    SecretKey key;

    public TripleDES() 
    {
        myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
    }
    
    public String getMyEncryptionKey() 
    {
        return myEncryptionKey;
    }

    public void setMyEncryptionKey(String myEncryptionKey) 
    {
        this.myEncryptionKey = myEncryptionKey;
    }
    
    public void stablishKey()
    {
        try
        {
            myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
            keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
            myKeySpec = new DESedeKeySpec(keyAsBytes);
            mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
            cipher = Cipher.getInstance(myEncryptionScheme);
            key = mySecretKeyFactory.generateSecret(myKeySpec);
        }
        catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeySpecException ex)
        {
            System.out.println(ex);
        }
    }
    
    
    public String encrypt(String unencryptedString)
    {
        String encryptedString = null;
        try
        {
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
            BASE64Encoder base64encoder = new BASE64Encoder();
            encryptedString = base64encoder.encode(encryptedText);
        }
        catch (InvalidKeyException | UnsupportedEncodingException | IllegalBlockSizeException | BadPaddingException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            return  encryptedString;
        }
    }
    
    public String decrypt(String encryptedString)
    {
        String decryptedText=null;
        try
        {
            cipher.init(Cipher.DECRYPT_MODE, key);
            BASE64Decoder base64decoder = new BASE64Decoder();
            byte[] encryptedText = base64decoder.decodeBuffer(encryptedString);
            byte[] plainText = cipher.doFinal(encryptedText);
            decryptedText= bytes2String(plainText);
        }
        catch (InvalidKeyException | IOException | IllegalBlockSizeException | BadPaddingException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            return decryptedText;
        }
    }
    
    private static String bytes2String(byte[] bytes)
    {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < bytes.length; i++)
        {
            stringBuffer.append((char) bytes[i]);
        }
        return stringBuffer.toString();
    }
}
