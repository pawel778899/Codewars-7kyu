//Solution 1
public class Troll {
    public static String disemvowel(String s) {
        return s.replaceAll("(?i)[aeiou]", "");
    }
}


//Solution 2
public class Troll {
    public static String disemvowel(String str) {
       
      return str.replaceAll("[aioueAIOUE]","");
    }
}
