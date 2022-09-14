public class DescendingOrder {
  public static int sortDesc(final int num) {
   
    if (num<0) return num;
    
    // our number we will return
    int sortedNumber = 0;
    
    // loop with a maximum number int
    // perform loop in reverse
    for (int i = 9; i >= 0; i--) {
        // set a local number variable
        int tmpNumber = num;
        // while greater than 0
        while (tmpNumber > 0) {
            // get the digit
            int digit = tmpNumber % 10;
            // check for the greatest digit in the given number
            if (digit == i) {
                // build the sortedNumber value
                sortedNumber *= 10;
                sortedNumber += digit;
            }
            // reduce the loop variable
            tmpNumber /= 10;
        }
    }
    // return our sorted number
    return sortedNumber;   
  }
}




// DESCRIPTION:
// Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

// Examples:
// Input: 42145 Output: 54421

// Input: 145263 Output: 654321

// Input: 123456789 Output: 987654321

// FUNDAMENTALS
