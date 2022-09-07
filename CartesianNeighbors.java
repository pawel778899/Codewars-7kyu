 public class Kata {

    public static int[][] cartesianNeighbor(int x, int y) {

        int[][] result = {{x - 1, y - 1},{x - 1, y},{x - 1, y+1},
                {x , y - 1},{x , y+1},
                {x + 1, y - 1},{x + 1, y},{x + 1, y+1}
        };
        return result;
    }

        public static void main (String[]args){
            System.out.println(cartesianNeighbor(6, 6)[0][1]);
        }

    }
