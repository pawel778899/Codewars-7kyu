//Solution 1

public class Kata {

    public static final String generateShape(int n) {
        return ("+".repeat(n) + "\n").repeat(n).trim();
    }
}


//Solution 2

public class Kata {
    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        for (int j=0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}


// DESCRIPTION:
// I will give you an integer. Give me back a shape that is as long and wide as the integer. The integer will be a whole number between 1 and 50.

// Example
// n = 3, so I expect a 3x3 square back just like below as a string:

// +++
// +++
// +++
// FUNDAMENTALS ASCII ART
