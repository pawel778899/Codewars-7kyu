public class Kata {

    public static String addLetters(String... letters) {

        String x = "zabcdefghijklmnopqrstuvwxy";
        int i = 0;
        for (String letter : letters) {
            i += x.indexOf(letter);
        }
        return   String.valueOf( x.charAt( i % x.length()) )   ;
    }
}


// DESCRIPTION:
// Your task is to add up letters to one letter.

// The function will be given an array of single character Strings, each one being a letter to add.

// Notes:
// Letters will always be lowercase.
// Letters can overflow (see second to last example of the description)
// If no letters are given, the function should return 'z'
// Examples:
// addLetters("a", "b", "c") = "f"
// addLetters("a", "b") = "c"
// addLetters("z") = "z"
// addLetters("z", "a") = "a"
// addLetters("y", "c", "b") = "d" // notice the letters overflowing
// addLetters() = "z"
// Confused? Roll your mouse/tap over here

// ALGORITHMS
