class SuffPref {

    public static int solve(String s) {
        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.substring(0, i + 1).equals(s.substring(s.length() - i - 1)))
                count = s.substring(0, i + 1).length();
        }
        return count;
    }
}


// DESCRIPTION:
// In this Kata, you will be given a string and your task will be to return the length of the longest prefix that is also a suffix. A prefix is the start of a string while the suffix is the end of a string. For instance, the prefixes of the string "abcd" are ["a","ab","abc"]. The suffixes are ["bcd", "cd", "d"]. You should not overlap the prefix and suffix.

// for example:
// solve("abcd") = 0, because no prefix == suffix. 
// solve("abcda") = 1, because the longest prefix which == suffix is "a".
// solve("abcdabc") = 3. Longest prefix which == suffix is "abc".
// solve("aaaa") = 2. Longest prefix which == suffix is "aa". You should not overlap the prefix and suffix
// solve("aa") = 1. You should not overlap the prefix and suffix.
// solve("a") = 0. You should not overlap the prefix and suffix.
// All strings will be lowercase and string lengths are 1 <= length <= 500

// More examples in test cases. Good luck!

// FUNDAMENTALS