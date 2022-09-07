import java.util.Arrays;
import java.util.stream.*;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        return Arrays.stream((s1 + s2).split("")).sorted().distinct().collect(Collectors.joining());
    }
}


// DESCRIPTION:
// Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

// Examples:
// a = "xyaabbbccccdefww"
// b = "xxxxyyyyabklmopq"
// longest(a, b) -> "abcdefklmopqwxy"

// a = "abcdefghijklmnopqrstuvwxyz"
// longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
// FUNDAMENTALS
