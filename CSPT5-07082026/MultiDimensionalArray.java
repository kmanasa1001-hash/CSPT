public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 4, 1, 2, 1},
            {1, 8, 6, 1, 1},
            {2, 1, 2, 2, 1}
        };
        for (int[] ar: arr) {
            for (int ay: ar) {
                System.out.print(ay + " ");
            }
            System.out.println();
        }
    }
}