import java.util.*;
public class SortAndStar {
  public static String twoSort(String[] s) {
     Arrays.sort(s);
     String result = s[0].trim().replaceAll("", "***");
        return result.substring(3, result.length() - 3);  
  }
}




// DESCRIPTION:
// You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.

// The returned value must be a string, and have "***" between each of its letters.

// You should not remove or add elements from/to the array.

// FUNDAMENTALS STRINGS ARRAYS
