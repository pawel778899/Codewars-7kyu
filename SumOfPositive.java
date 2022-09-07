//Solution 1

public class Positive{
    public static int sum(int[] arr){
        int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }
}

//Solution2

import java.util.Arrays;
public class Positive{
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}


// DESCRIPTION:
// You get an array of numbers, return the sum of all of the positives ones.

// Example [1,-4,7,12] => 1 + 7 + 12 = 20

// Note: if there is nothing to sum, the sum is default to 0.

// ARRAYS FUNDAMENTALS
