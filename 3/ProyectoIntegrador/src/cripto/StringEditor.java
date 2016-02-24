package cripto;


public class StringEditor
{
	public static String extend(String s, int length, char padChar)
	{	while (s.length() < length) s = padChar+s;
		return s;
	}


	public static String extendNum(String s, int length, int separation)
	{	while (s.length() < length) s = '0'+s;
		if (separation<1) return s;

		String s2 = s.substring(0,separation);
		for (int i = separation; i<s.length(); i+=separation)
		{	s2+=","+s.substring(i, i+separation); }



		return s2;
	}



	public static long convertHexString(String hex)
	{	long l =0;
		for (int i=0; i<hex.length(); i++)
		{	l <<= 4;
			int digit = Character.digit(hex.charAt(i), 16);
			if (digit>=0) l |= (long)digit;

		}

		return l;
	}


}