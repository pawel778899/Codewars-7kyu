//Solution 1

import java.math.BigInteger;

public class BinaryScore {
  public static BigInteger score (BigInteger n) {
    return BigInteger.valueOf(2).pow(n.bitLength()).subtract(BigInteger.valueOf(1));
  }
}


//Solution 2

import java.math.BigInteger;

public class BinaryScore {
  public static BigInteger score(BigInteger n) {
    return BigInteger.ZERO.setBit(n.bitLength()).subtract(BigInteger.ONE);
  }
}




// DESCRIPTION:
// Objective
// Given a number n we will define its scORe to be 0 | 1 | 2 | 3 | ... | n, where | is the bitwise OR operator.

// Write a function that takes n and finds it's scORe.

// n	scORe n
// 0	0
// 1	1
// 49	63
// 1000000	1048575
// Any feedback would be much appreciated

// BINARY ALGORITHMS
