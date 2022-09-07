public class GCD {

    public static int compute(int x, int y) {

        if (x < y) {
            int temp = 0;
            temp = x;
            x = y;
            y = temp;
        }
        boolean flag = true;

        while (flag) {
            if ( x % y == 0) {
                return y;
            }else if( x % y != 0){
                int tempX = x;
                x = y;
                y = tempX % y;
            }
        }
        return 0;
    }
}



// DESCRIPTION:
// Find the greatest common divisor of two positive integers. The integers can be large, so you need to find a clever solution.

// The inputs x and y are always greater or equal to 1, so the greatest common divisor will always be an integer that is also greater or equal to 1.

// ALGORITHM SFUNDAMENTALS RECURSION
