public class PatternPrinter {

    // Print solid rectangle of stars
    public static void patternStars(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print alternating 1s and 0s rows
    public static void patternBinaryRows(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            char ch = (i % 2 == 0) ? '1' : '0';
            for (int j = 0; j < cols; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // Print incrementing numbers row-wise
    public static void patternIncremental(int rows, int cols) {
        int val = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(val++ + " ");
            }
            System.out.println();
        }
    }

    // Print repeated row-wise numbers
    public static void patternRepeatedRows(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Print columns with incrementing values
    public static void patternRepeatedCols(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Print alphabets in sequence
    public static void patternAlphabets(int rows, int cols) {
        char ch = 'a';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    // Print Pascal's triangle
    public static void pascalTriangle(int layers) {
        int[][] triangle = new int[layers][];
        for (int i = 0; i < layers; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        for (int[] row : triangle) {
            for (int s = 0; s < layers - row.length; s++) System.out.print(" ");
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    // Print diamond-like hollow pattern
    public static void symmetricalHollowDiamond(int size) {
        for (int i = 1; i <= size; i++) {
            for (int s = size; s > i; s--) System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int s = size; s > i; s--) System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
