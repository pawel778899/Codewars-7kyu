public class FindDivisor {

  public long numberOfDivisors(int n) {
   
    int sum=0;
    for (int i=1; i <=n; i++){
      if(n%i==0)
      sum+=1;
    }
    return sum;
  }
}



DESCRIPTION:
Count the number of divisors of a positive integer n.

Random tests go up to n = 500000.

Examples (input --> output)
4 --> 3 (1, 2, 4)
5 --> 2 (1, 5)
12 --> 6 (1, 2, 3, 4, 6, 12)
30 --> 8 (1, 2, 3, 5, 6, 10, 15, 30)
NUMBER THEORY MATHEMATICS FUNDAMENTALS
