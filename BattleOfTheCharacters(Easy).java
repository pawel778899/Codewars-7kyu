import java.util.stream.IntStream;

public class BattleOfTheCharacters {

    public static String battle(final String x, final String y) {
        return val(x) == val(y) ? "Tie!" : val(x) > val(y) ? x : y;
    }

    public static long val(String s) {
        return IntStream.range(0, s.length()).mapToObj(i -> s.toLowerCase().toCharArray()[i] - '`').mapToInt(Integer::intValue).sum();
    }
  }


DESCRIPTION:
Description:
Groups of characters decided to make a battle. Help them to figure out which group is more powerful. Create a function that will accept 2 strings and return the one who's stronger.

Rules:
Each character have its own power: A = 1, B = 2, ... Y = 25, Z = 26
Strings will consist of uppercase letters only
Only two groups to a fight.
Group whose total power (A + B + C + ...) is bigger wins.
If the powers are equal, it's a tie.
Examples:
  battle("ONE", "TWO"); // => "TWO"`
  battle("ONE", "NEO"); // => "Tie!"
Related kata:
Battle of the characters (Medium)
ALGORITHMS
