public class Vowels {

  public static int getCount(String str) {
  
    int vowels = 0;
    str = str.toLowerCase();
    for (int i = 0; i < str.length(); ++i) {
      char ch = str.charAt(i);

      
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
       }
      } 
      return vowels;
     }
   }


// DESCRIPTION:
// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, u as vowels for this Kata (but not y).

// The input string will only consist of lower case letters and/or spaces.

// STRINGS FUNDAMENTALS
