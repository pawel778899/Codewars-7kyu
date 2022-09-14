import java.util.Arrays;
import java.util.stream.*;

public class Kata {
    public static String reverseWords(final String original) {
        String[] arr = original.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return original.strip().length() == 0 ? original : String.join(" ", arr);
    }
}




// DESCRIPTION:
// Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

// Examples
// "This is an example!" ==> "sihT si na !elpmaxe"
// "double  spaces"      ==> "elbuod  secaps"
// STRINGSFUNDAMENTALS
