package cripto;

import Global.VariableGlobal;

/******************************************************************************
* The DES class below implements an encryptor/decryptor for the DES Algorithm *
******************************************************************************/
public class DES
{
/************************************************************************
* Some handy constants: masks for the high and low words of a long type *
************************************************************************/
	public static long HighWordMask =  Key.HighWordMask;
	public static long  LowWordMask =   Key.LowWordMask;
/************************************************************************
* private data for this class (there is no public/state data needed)    *
************************************************************************/
	protected Key key;
	protected int rounds = 16;
	private static SBox sboxes[]= {	new SBox(0), new SBox(1), new SBox(2), new SBox(3), new SBox(4), new SBox(5), new SBox(6), new SBox(7)};
/**************************
* Permutation tables      *
**************************/
	private static byte expansion[] = {	32,  1,  2,  3,  4,  5,
										 4, 5,  6,  7,  8,  9,
										 8,  9, 10, 11, 12, 13,
										12, 13, 14, 15, 16, 17,
										16, 17, 18, 19, 20, 21,
										20, 21, 22, 23, 24, 25,
										24, 25, 26, 27, 28, 29,
										28, 29, 30, 31, 32,  1};
	private static int cipherPermutation[] = {16,  7, 20, 21,
											  29, 12, 28, 17,
											   1, 15, 23, 26,
											   5, 18, 31, 10,
											   2,  8, 24, 14,
											  32, 27,  3,  9,
											  19, 13, 30,  6,
											  22, 11,  4, 25};
	private static int initialPermutation[] = {                                             58, 50, 42, 34, 26, 18, 10,  2,
												60, 52, 44, 36, 28, 20, 12,  4,
												62, 54, 46, 38, 30, 22, 14,  6,
												64, 56, 48, 40, 32, 24, 16,  8,
												57, 49, 41, 33, 25, 17,  9,  1,
												59, 51, 43, 35, 27, 19, 11,  3,
												61, 53, 45, 37, 29, 21, 13,  5,
												63, 55, 47, 39, 31, 23, 15,  7};

    /*****************
     *  Constructors  *
     *****************/
    public DES() {
    }

        
	public DES(Key k)	// creates an encryptor that performs the standard (16-round) DES algorithm
	{	
            key = k;
            rounds = 16;
        }
	public DES(Key k, int numRounds)  // allows the user to specify the number of rounds (for reduced versions oof DES)
	{	key = k;
		rounds = numRounds;
	}
/****************************
*  Routines to set options  *
     * @param numRounds
****************************/
	public void setNumberOfRounds(int numRounds)
	{	rounds = numRounds;}
/*************************************
*  Encryption/Decryption functions   *
     * @param texto
*************************************/
        public void encrytBlock(byte[] texto) 
        {
            for (long l : texto) 
                {
                    int t = -1;
                    if(!VariableGlobal.getLista().isEmpty())
                    {
                         t = VariableGlobal.getLista().indexOf(l);
                    }
                    if(t == -1)
                    {
                        long ipout = getInitialPermutation(l);

                        int left  = (int)(ipout >> 32);
                        int right = (int)(ipout);

                        for (int round = 0; round < 16; round++)
                        {
                            int temp = left;
                            left = right;
                            right = getCipherFunction(right, key.calcKeys[round]) ^ temp;
                        }
                        long result = ((long)right << 32) | ((long)left & LowWordMask);
                        long r = getFinalPermutation(result);
                        VariableGlobal.getLista().add(l);
                        VariableGlobal.getListaEncriptada().add(r);     
                    }
                    else
                    {
                        long l1 = VariableGlobal.getLista().get(t);
                        long l2 = VariableGlobal.getListaEncriptada().get(t);

                        VariableGlobal.getLista().add(l1);
                        VariableGlobal.getListaEncriptada().add(l2);
                    }

                }
        }   
        public void decryptBlock(String[] blocks)
        {
            for (String block : blocks) 
            {
                long bloque = Long.parseLong(block);
                int t = 0;
                    
                if(VariableGlobal.getLista().isEmpty())
                {
                    t = -1;
                }
                else
                {
                    t = VariableGlobal.getLista().indexOf(bloque);
                }
                if (t == -1)
                {
                    long ipout = getInitialPermutation(bloque);

                    int left  = (int)(ipout >> 32);
                    int right = (int)(ipout);

                    for (int round=15; round>-1; round--)
                    {
                    // apply cipher for that round and swap subblocks
                            int temp = left;
                            left = right;

                            right = getCipherFunction(right, key.calcKeys[round]) ^ temp;
                    }
                    long result = ((long)right << 32) | ((long)left & LowWordMask);

                    long l = getFinalPermutation(result);
                    
                    char c = (char)l;
                    
                    VariableGlobal.getListaDesencriptada().add(String.valueOf(c));
                    VariableGlobal.getLista().add(bloque);
                    
                }
                else
                {
                     long l1 = VariableGlobal.getLista().get(t);
                     String l2 = VariableGlobal.getListaDesencriptada().get(t);

                     VariableGlobal.getLista().add(l1);
                     VariableGlobal.getListaDesencriptada().add(l2);
                }
            }
        }
        	public long encryptBlock(long block)
	{
            long ipout = getInitialPermutation(block);
            int left  = (int)(ipout >> 32);
            int right = (int)(ipout);
            int round = 0;
            int r = rounds;
            while (r > 0)
            {
                int temp = left;
                left = right;
                right = getCipherFunction(right, key.calcKeys[round]) ^ temp;
                round++;
                r--;
            }
            long result = ((long)right << 32) | ((long)left & LowWordMask);
            return getFinalPermutation(result);
	}

	public long decryptBlock(long block)
	{
            
            long ipout = getInitialPermutation(block);

            int left  = (int)(ipout >> 32);
            int right = (int)(ipout);
            int round = rounds - 1;
            while (round >= 0) 
            {                
                int temp = left;
                left = right;
                right = getCipherFunction(right, key.calcKeys[round]) ^ temp;
                round--;
            }
            long result = ((long)right << 32) | ((long)left & LowWordMask);
            return getFinalPermutation(result);
	}
//	public long encryptBlock(long block)
//	{
//            long ipout = getInitialPermutation(block);
//             
//            int left  = (int)(ipout >> 32);
//            int right = (int)(ipout);
//            for (int round = 0; round < 16; round++)
//            {
//            // apply cipher for that round and swap subblocks
//                    int temp = left;
//                    left = right;
//
//                    right = getCipherFunction(right, key.calcKeys[round]) ^ temp;
//            }
//            long result = ((long)right << 32) | ((long)left & LowWordMask);
//
//            return getFinalPermutation(result);
//	}
//	public long decryptBlock(long block)
//	{
//            
//            long ipout = getInitialPermutation(block);
//
//            int left  = (int)(ipout >> 32);
//            int right = (int)(ipout);
//
//            for (int round=15; round>-1; round--)
//            {
//            // apply cipher for that round and swap subblocks
//                    int temp = left;
//                    left = right;
//
//                    right = getCipherFunction(right, key.calcKeys[round]) ^ temp;
//            }
//            long result = ((long)right << 32) | ((long)left & LowWordMask);
//            return getFinalPermutation(result);
//	}
/****************************************************************
*  Intermediate (private) functions/permutations/substitutions  *
****************************************************************/
	protected long getExpandedSubBlock(int subBlock)
	{	
            long e = 0;
            for (int i=0; i<48; i++)
            {	
                e |= (long)((subBlock >> (32 - expansion[i])) & 0x01) << (47 -i);
            }
            return e;
	}
	protected int getCipherPermutation(int subBlock)
	{	
            int result = 0;
            
            for (int i=0; i<32; i++)
            {	
                result |= ((subBlock >> (32 - cipherPermutation[i])) & 0x01) << (31-i);
            }
            
            return result;
	}
	protected int getSBoxOutput(long input)
	{	
            int sOutput = 0;
            for (int box = 0; box<8; box++)
            {	
                byte bin  = (byte)(input >> (42-(box*6)) & 0x03F);
                byte bout = sboxes[box].substitute(bin);
                int  iout = (int)bout  << (28-(box*4));
                sOutput |= iout;
            }
            return sOutput;
	}
	protected int getCipherFunction(int subBlock, long key)
	{
            long resultado1 = getExpandedSubBlock(subBlock) ^ key;
            int resultado2 = getSBoxOutput(resultado1);
            int resultado3 = getCipherPermutation(resultado2);
            return resultado3;
	}
	protected long getInitialPermutation(long block)
	{	
            long result = 0;
            for (int i=0; i<64; i++)
            {
                result |= ((block >> (64 - initialPermutation[i])) & 0x01) << (63-i);

            }
            return result;
	}
	protected long getFinalPermutation(long block)
        {	
            long result = 0;
            for (int i=0; i<64; i++)
            {	
                result |= ((block >> (63-i)) & 0x01) << (64 - initialPermutation[i]);
            }
            return result;
	}
}