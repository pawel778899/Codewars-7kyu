//Solution 1


import java.util.Arrays;

public class GiftSorter{
    public String sortGiftCode(String code){

        char arr[] = code.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

//Solution 2

import java.util.Arrays;
import java.util.Comparator;

public class GiftSorter{
    public String sortGiftCode(String code){

        Character tempArray[] = new Character[code.length()];

        for (int i = 0; i < code.length(); i++) {
            tempArray[i] = code.charAt(i);
        }

        Arrays.sort(tempArray, new Comparator<Character>() {

            // Method 2
            // To compare characters
            @Override
            public int compare(Character c1, Character c2)
            {
                // Ignoring case
                return Character.compare(
                        Character.toLowerCase(c1),
                        Character.toLowerCase(c2));
            }
        });
        StringBuilder sb = new StringBuilder(tempArray.length);

        for (Character c : tempArray)
            sb.append(c.charValue());

        return sb.toString();
    }
}

//Solution 3

import java.util.Arrays;
import java.util.stream.Collectors;

public class GiftSorter {
    public String sortGiftCode(String code) {
        return Arrays.stream(code.split("")).sorted().collect(Collectors.joining(""));
    }
}


// DESCRIPTION:
// Happy Holidays fellow Code Warriors!
// Santa's senior gift organizer Elf developed a way to represent up to 26 gifts by assigning a unique alphabetical character to each gift. After each gift was assigned a character, the gift organizer Elf then joined the characters to form the gift ordering code.

// Santa asked his organizer to order the characters in alphabetical order, but the Elf fell asleep from consuming too much hot chocolate and candy canes! Can you help him out?

// Sort the Gift Code
// Write a function called sortGiftCode/sort_gift_code/SortGiftCode that accepts a string containing up to 26 unique alphabetical characters, and returns a string containing the same characters in alphabetical order.

// Examples (Input -- => Output):
// "abcdef"                      -- => "abcdef"
// "pqksuvy"                     -- => "kpqsuvy"
// "zyxwvutsrqponmlkjihgfedcba"  -- => "abcdefghijklmnopqrstuvwxyz"
// SORTING STRINGS FUNDAMENTALS


