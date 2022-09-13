import java.util.List;


// Solution 1
interface Kata {
  static List<Object> filterList(List<Object> list) {
    return list.stream().filter(Integer.class::isInstance).toList();
  }
}

//Solution 2
import java.util.*;
import java.util.stream.Collectors;

public class Kata {
  
  public static List filterList(final List<Object> list) {
    return list.stream()
      .filter(e -> e instanceof Integer)
      .collect(Collectors.toList());
  }

}





// DESCRIPTION:
// In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

// Example
// Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
// Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
// Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
// LISTS FILTERING DATA STRUCTURES FUNDAMENTALS
