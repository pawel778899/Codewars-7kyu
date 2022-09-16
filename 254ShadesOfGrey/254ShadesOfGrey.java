//Solution 1

public class ShadesOfGrey {

    static String[] shadesOfGrey(int num) {
        num = Math.max(0, Math.min(254, num));
        String[] result = new String[num];
        for (int i = 1; i <= num; ++i) {
            result[i - 1] = String.format("#%02x%02x%02x", i, i, i);
        }
        return result;
    }
  
  //Solution 2
  
  
  import java.util.stream.IntStream;

public class ShadesOfGrey {
  static String[] shadesOfGrey(final int num) {
    return (String[]) IntStream
      .rangeClosed(1, Math.min(num, 254))
      .mapToObj(i -> String.format("#%1$02x%1$02x%1$02x", i))
      .toArray(String[]::new);
  }
}
  
  
//Solution 3
  
  public class ShadesOfGrey {
  static String[] EMPTY = new String[0];
  static char[] HEX = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
  
  static String[] shadesOfGrey(int num) {
    if(num <= 0) return EMPTY;
    if(num > 254) num = 254;
    String[] result = new String[num];
    char[] color = new char[]{'#','0','0','0','0','0','0'};
    for(int i = 1; i <= num; ++i){
      color[1] = color[3] = color[5] = HEX[i >> 4];
      color[2] = color[4] = color[6] = HEX[i & 15];
      result[i - 1] = new String(color);
    }
    return result;
  }
}
  
  
  
  
  
  
  
// DESCRIPTION:
// Why would we want to stop to only 50 shades of grey? Let's see to how many we can go.

// Write a function that takes a number n as a parameter and return an array containing n shades of grey in hexadecimal code (#aaaaaa for example). The array should be sorted in ascending order starting with '#010101', '#020202', etc. (using lower case letters).

// Examples:

// n =  1:    ["#010101"]
// n = 10:    ["#010101", "#020202", "#030303", "#040404", "#050505", "#060606", "#070707", "#080808", "#090909", "#0a0a0a"]
// As a reminder, the grey color is composed by the same number of red, green and blue: #010101, #aeaeae, or #555555.

// Black: #000000 and white: #ffffff are not accepted values.

// When n is negative, just return an empty array. If n is higher than 254, just return an array of 254 elements.

// Have fun!

// FUNDAMENTALS STRINGS ALGORITHMS
