//Solution 1

import static java.util.stream.IntStream.range;

public class MaxProduct {
  int adjacentElementsProduct(int[] array) {
    return range(0, array.length - 1).map(i -> array[i] * array[i + 1]).max().orElse(0);
  }
}

//Solution 2

import java.util.stream.IntStream;

public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    
    return IntStream.range(0, array.length - 1)
                    .map(x -> array[x]*array[x+1])
                    .max()
                    .orElse(Integer.MIN_VALUE);
  }
}






// DESCRIPTION:
// Task
// Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.

// Notes
// Array/list size is at least 2.

// Array/list numbers could be a mixture of positives, negatives also zeroes .

// Input >> Output Examples
// adjacentElementsProduct([1, 2, 3]); ==> return 6
// Explanation:
// The maximum product obtained from multiplying 2 * 3 = 6, and they're adjacent numbers in the array.
// adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]); ==> return 50
// Explanation:
// Max product obtained from multiplying 5 * 10  =  50 .

// adjacentElementsProduct([-23, 4, -5, 99, -27, 329, -2, 7, -921])  ==>  return -14
// Explanation:
// The maximum product obtained from multiplying -2 * 7 = -14, and they're adjacent numbers in the array.
// Playing with Numbers Series
// Playing With Lists/Arrays Series
// For More Enjoyable Katas
// ALL translations are welcomed
// Enjoy Learning !!
// Zizou
// FUNDAMENTALS ARRAYS
