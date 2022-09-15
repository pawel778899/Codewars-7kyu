//Solution 1

public class SillyAdditon {
  public static int add(int num1, int num2) {
    StringBuilder sum = new StringBuilder();
    do {
      sum.insert(0, num1 % 10 + num2 % 10);
      num1 /= 10;
      num2 /= 10;
    } while (num1 + num2 > 0);
    return Integer.parseInt(sum.toString());
  }
}

//Solution 2

public class SillyAdditon {

  public static int add(int x, int y) {
    int res = 0, m = 1;
    while (x != 0 || y != 0) {
      int s = x % 10 + y % 10;
      res += s * m;
      m *= s < 10 ? 10 : 100;
      x /= 10;
      y /= 10;
    }
    return res;
  }
}







//DESCRIPTION:
// https://www.codewars.com/kata/5effa412233ac3002a9e471d
 
// You may assume both integers are positive integers and the result will not be bigger than Integer.MAX_VALUE

// ALGORITHMS MATHEMATICS
