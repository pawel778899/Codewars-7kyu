public class Accumul {
    public static String accum(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i].repeat(i + 1);
            arr[i] = Character.toUpperCase(arr[i].charAt(0)) + temp.substring(1);
        }
        return String.join("-", arr);
    }
}




// DESCRIPTION:
// This time no story, no theory. The examples below show you how to write function accum:

// Examples:
// accum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") -> "C-Ww-Aaa-Tttt"
// The parameter of accum is a string which includes only letters from a..z and A..Z.

// FUNDAMENTALS STRINGS PUZZLES
