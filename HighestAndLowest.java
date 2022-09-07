public class Kata {
  public static String highAndLow(String numbers) {
    
    String[] array = numbers.split(" ");
  String big = array[0];
  String small = array[0];
    
  for(int i=0; i<array.length; i++) 
  {
    if(Integer.parseInt(big) <= Integer.parseInt(array[i])) 
    {
    big = array[i];
    }
    else if(Integer.parseInt(small) >= Integer.parseInt(array[i])) 
    {
      small = array[i];
          }
  }
  return (big +" "+ small);
  }
}



DESCRIPTION:
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
FUNDAMENTALS STRINGS
