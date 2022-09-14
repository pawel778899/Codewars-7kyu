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
For this kata you will have to forget how to add two numbers.

It can be best explained using the following meme:

Dayane Rivas adding up a sum while competing in the Guatemalan television show "Combate" in May 2016

In simple terms, our method does not like the principle of carrying over numbers and just writes down every number it calculates :-)

You may assume both integers are positive integers.

Examples
16+1821426+39515122+811103\large \begin{array}{lll} & 1 & 6 \\ + & 1 & 8 \\ \hline & 2 & 1 4 \\ \end{array} \qquad \large \begin{array}{lll} & 2 & 6 \\ + & 3 & 9 \\ \hline & 5 & 15 \\ \end{array} \qquad \large \begin{array}{lll} & 1 & 2 & 2 \\ + & & 8 & 1 \\ \hline & 1 & 10 & 3 \\ \end{array} 
+
​
  
1
1
2
​
  
6
8
14
​
 
​
  
+
​
  
2
3
5
​
  
6
9
15
​
 
​
  
+
​
  
1
1
​
  
2
8
10
​
  
2
1
3
​
 
​
 
You may assume both integers are positive integers and the result will not be bigger than Integer.MAX_VALUE

ALGORITHMS MATHEMATICS
