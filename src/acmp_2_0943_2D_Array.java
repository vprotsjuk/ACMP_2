import java.util.Scanner;

public class acmp_2_0943_2D_Array {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int y = scanner.nextInt() - 1;
        int x = scanner.nextInt()  - 1;
        int a = 0;
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            if (   (i % 2) == 0) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = a;
                    a = a + 1;
//                    System.out.print(matrix[i][j]);

                }
            }else if (   (i % 2) == 1){
                for (int j = column-1; j >= 0; j--) {
                    matrix[i][j] = a;
                    a = a + 1;
//                    System.out.print(matrix[i][j]);

                }


            }
        }
        System.out.println(matrix[y][x]);
//        System.out.print(Arrays.toString(matrix));

    }
}
