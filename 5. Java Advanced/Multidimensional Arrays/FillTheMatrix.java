import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")){
            fillPatternA(matrix, size);
        }else if (pattern.equals("B")){
            fillPatternB(matrix, size);
        }

        printMatrix(matrix ,size, size);
    }

    private static void fillPatternB(int[][] matrix, int size) {
        int element = 0;
        for (int col = 0; col < size; col++){
            if (col % 2 == 0){
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = ++element;
                }
            }else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = ++element;
                }
            }

        }
    }

    private static void fillPatternA(int[][] matrix, int size) {
        int element = 0;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++){
                matrix[row][col] = ++element;
            }
        }
    }

    private static void printMatrix(int[][] matrix, int rows, int cols){
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
