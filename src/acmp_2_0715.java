import java.util.Scanner;

public class acmp_2_0715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int a = row * 2;
        int columns = scanner.nextInt();
        int result = 0;
        scanner.nextLine();
        String[] photo = new String[a];
        for (int i = 0; i < row; i++) {
            photo[i] = scanner.nextLine();
        }
        scanner.nextLine();
        for (int i = row; i < a; i++) {
            photo[i] = scanner.nextLine();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if (photo[i].charAt(j) == photo[i + row].charAt(j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}


