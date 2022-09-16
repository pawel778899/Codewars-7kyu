//Solution 1

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static int largestPairSum(int[] numbers) {

        int sum = 0;

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {

            sum = numbers[numbers.length-1]+numbers[numbers.length-2];
        }
        return sum;
    }
}

//solution 2

import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution{
    public static int largestPairSum(int[] numbers){
    return IntStream.of(numbers)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .limit(2)
                    .mapToInt(Integer::intValue)
                    .sum();
    }
}


//Solution 3

import java.util.Arrays;

public class Solution{
    public static int largestPairSum(int[] numbers){
      return Arrays.stream(numbers).map(x->-x).sorted().map(x->-x).limit(2).sum();
    }
}




// DESCRIPTION:
// Given a sequence of numbers, find the largest pair sum in the sequence.

// For example

// [10, 14, 2, 23, 19] -->  42 (= 23 + 19)
// [99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
// Input sequence contains minimum two elements and every element is an integer.

// FUNDAMENTALS
