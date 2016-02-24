package cripto;


/*************************************************************************************
* The Key class below implements a key to be used with the DES encryption algorithm. *
* It has the appropriate subkey functions for that algorithm                         *
*************************************************************************************/


public final class Key
{

/************************************************************************
* Some handy constants: masks for the high and low words of a long type *
************************************************************************/

	public static long HighWordMask =  (long)0x80000000 << 1;
	public static long  LowWordMask =  (long)-1 ^ HighWordMask;
        public long[] calcKeys = new long[16*9];



/***************
* Private data *
***************/

	private long key;  		// the original key
	private long permKey; 	// the permuted key, ie. PC1(key)



/*********************************
* Rotation values for each round *
*********************************/
	private static int roundShifts[] = {1, 2, 4, 6, 8,
                                            10, 12, 14, 15, 17, 
                                            19, 21, 23, 25, 27, 
                                            28, 30, 32, 34, 35, 
                                            37, 39, 41, 43, 45, 
                                            47, 48, 50, 52, 54, 
                                            56, 58, 60, 61, 63, 
                                            65, 67, 69, 71, 73, 
                                            75, 76, 78, 80, 82, 
                                            84, 86, 88, 89, 91, 
                                            93, 95, 97, 99, 101, 
                                            102, 104, 106, 108, 110,
                                            112, 114, 115, 117, 119,
                                            121, 123, 125, 127, 129, 
                                            130, 132, 134, 136, 138, 
                                            140, 142, 143, 145, 147, 
                                            149, 151, 153, 155, 156, 
                                            158, 160, 162, 164, 166, 
                                            168, 169, 171, 173, 175,
                                            177, 179, 181, 182, 184,
                                            186, 188, 190, 192, 194,
                                            196, 197, 199, 201, 203,
                                            205, 207, 209, 210, 212,
                                            214, 216, 218, 220, 222,
                                            223, 225, 227, 229, 231,
                                            233, 235, 236, 238, 240,
                                            242, 244, 246, 248, 250,
                                            251, 253, 255, 257, 259,
                                            261, 263, 264, 266};



/*********************
* Permutation tables *
*********************/

	private static byte initPermutation[] = {57, 49, 41, 33, 25, 17,  9,
											  1, 58, 50, 42, 34, 26, 18,
											 10,  2, 59, 51, 43, 35, 27,
											 19, 11,  3, 60, 52, 44, 36,
											 63, 55, 47, 39, 31, 23, 15,
											  7, 62, 54, 46, 38, 30, 22,
											 14,  6, 61, 53, 45, 37, 29,
											 21, 13,  5, 28, 20, 12,  4};





	private static byte subkeyPermutation[] =  {14, 17, 11, 24,  1,  5,
												 3, 28, 15,  6, 21, 10,
												23, 19, 12,  4, 26,  8,
												16,  7, 27, 20, 13,  2,
												41, 52, 31, 37, 47, 55,
												30, 40, 51, 45, 33, 48,
												44, 49, 39, 56, 34, 53,
												46, 42, 50, 36, 29, 32};

/********************************************************************************************
* Constructors. NOTE: all take 64-bit (paritied) key vales, and the parity bits are ignored *
********************************************************************************************/


	public Key(long keyVal)
	{	key=keyVal;
		permKey = getInitPermutation(key);
                for (int i = 0; i < calcKeys.length; i++) 
                {
                    calcKeys[i] = getSubKey(i+1);
                
                }
	}


        public Key(int highKeyWord, int lowKeyWord)		//damned Java doesn't let you specify long constants, so this allows for two ints
	{	key = ((long)highKeyWord << 32) | ((long)lowKeyWord & LowWordMask);
		permKey = getInitPermutation(key);
	}



/***********************
* data access routines *
***********************/

	public long getKey() {return key;}
	public long getPermutedKey() {return permKey;}




/******************
* Subkey function *
******************/

	public long getSubKey(int round)
        {
            long resultado1 = getRoundRotation(round);
            long resultado2 = getSubkeyPermutation(resultado1);
            return resultado2;
            //return getSubkeyPermutation(getRoundRotation(round)); 
        }





/********************************************
* Intermediate functions (to compute subkey *
********************************************/

	public long getRoundRotation(int round)
	{	int k1 = (int)(permKey) & 0x0FFFFFFF;
		int k2 = (int)(permKey >> 28) & 0x0FFFFFFF;

		int shift = roundShifts[round-1];
		k1 = ((k1 << shift) & 0x0FFFFFFF) | (k1 >> (28 - shift)); // rotational shift of 28 bits
		k2 = ((k2 << shift) & 0x0FFFFFFF) | (k2 >> (28 - shift)); // rotational shift of 28 bits


		return (long)(k1 & 0x0FFFFFFF) | ((long)(k2 & 0x0FFFFFFF) << 28);
	}



	public static long getInitPermutation(long k)
	{	long newk = 0;
		for (int i = 0; i<56; i++)
		{
			newk |= ((k >> (64 - initPermutation[i])) & 0x01) << (55 - i);
		}
		return newk;
	}



	public static long getSubkeyPermutation(long k)
	{	long newk = 0;
		for (int i = 0; i<48; i++)
		{	newk |= ((k >> (56-subkeyPermutation[i])) & 0x01) << (47-i);}
		return newk;
	}



}
