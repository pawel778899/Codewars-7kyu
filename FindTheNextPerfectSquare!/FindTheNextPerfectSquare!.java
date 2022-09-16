//Solution 1

package org.example;

public class NumberFun {
    public static long findNextSquare(long sq) {

        double sqrtSq = Math.sqrt(sq);

        if (Math.floor(sqrtSq) - sqrtSq == 0) {

            return (long) Math.pow(sqrtSq + 1, 2);
        } else {
            return -1;
        }
    }
}

//Solution 2

public class NumberFun {
  public static long findNextSquare(long sq) {
      long root = (long) Math.sqrt(sq);
      return root * root == sq ? (root + 1) * (root + 1) : -1;
  }
}

//Solution 3

public class NumberFun {
  public static long findNextSquare(long sq) {
      return Math.sqrt(sq) % 1 != 0 ? -1 : (long)Math.pow(Math.sqrt(sq)+1,2);
  }
}




// DESCRIPTION:
// You might know some pretty large perfect squares. But what about the NEXT one?

// Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.

// If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.

// Examples:(Input --> Output)

// 121 --> 144
// 625 --> 676
// 114 --> -1 since 114 is not a perfect square
// ALGEBRA FUNDAMENTALS
