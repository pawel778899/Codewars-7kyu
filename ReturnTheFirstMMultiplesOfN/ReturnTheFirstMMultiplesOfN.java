//Solution 1

public class Kata {
  public static int[] multiples(int m, int n) {
    int[] array = new int[m];
    for(int i = 0; i < arr.length; i++){
      array[i] = (i + 1) * n;
    }
    return array;
  }
}

//Solution 2

import static java.util.stream.IntStream.iterate;
public class Kata {
  public static int[] multiples(int m, int n) {
   
    return iterate(n, i -> i + n).limit(m).toArray();
  }
}

//Solution 3

import java.util.stream.IntStream;

public class Kata {
  public static int[] multiples(int m, int n) {
        return IntStream.rangeClosed(1, m)
                .map(x -> x * n)
                .toArray();
  }
}




// DESCRIPTION:
// Implement a function, multiples(m, n), which returns an array of the first m multiples of the real number n. Assume that m is a positive integer.

// Ex.

// multiples(3, 5.0)
// should return

// [5.0, 10.0, 15.0]
// MATHEMATICS FUNDAMENTALS
