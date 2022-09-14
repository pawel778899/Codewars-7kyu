class RowSumOddNumbers {

    static int rowSumOddNumbers(int n) {
        int firstInNthRow = n * n - (n - 1);
        int lastInNthRow = firstInNthRow + (n - 1) * 2;
        return (firstInNthRow + lastInNthRow) * n / 2;
    }
  }


// DESCRIPTION:
// Given the triangle of consecutive odd numbers:

//              1
//           3     5
//        7     9    11
//    13    15    17    19
// 21    23    25    27    29
// ...
// Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

// 1 -->  1
// 2 --> 3 + 5 = 8
// ARRAYS LISTS FUNDAMENTALS
