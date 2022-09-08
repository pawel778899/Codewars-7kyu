import java.util.HashMap;
import java.util.Map;

public class isogram {
    public static boolean isIsogram(String str) {
        String str2 = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str2.length(); i++) {
            map.put(str2.charAt(i), 1);
        }
        return map.size() == str2.length();
    }
    public static boolean isIsogramFromCodeWars(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    }
}


// DESCRIPTION:
// An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

// Example: (Input --> Output)

// "Dermatoglyphics" --> true
// "aba" --> false
// "moOse" --> false (ignore letter case)
// STRINGS FUNDAMENTALS
