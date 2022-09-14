import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        return Integer.parseInt(Arrays.stream(String.valueOf(n).split("")).map(s
                -> String.valueOf((int) Math.pow(Integer.parseInt(s), 2))).collect(Collectors.joining()));
    }
}




// DESCRIPTION:
// Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

// For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

// Note: The function accepts an integer and returns an integer

// MATHEMATICS FUNDAMENTALS
