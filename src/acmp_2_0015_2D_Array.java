import java.util.Scanner;

public class acmp_2_0015_2D_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] matrix = new int[a][a];
        int result = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1 && matrix[j][i] == 1) {
                    result++;
                }
            }
        }


            if (a == 0) {
                System.out.println(0);
            }else {
                System.out.println(result);
            }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }
}



