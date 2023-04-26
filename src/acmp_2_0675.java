import java.util.ArrayList;
import java.util.Scanner;

public class acmp_2_0675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        int temp = 0;
        int result = 1000;
        while (n > 0) {
            String lineString = scanner.nextLine();
            for (int i = 0; i < lineString.length(); i++) {
                if (lineString.charAt(i) == '.') {
                    temp++;
                }
            }
            if (temp < result) {
                result = temp;
                temp = 0;

            }
            temp = 0;
            n--;
        }
        if (n == 1){
            System.out.println(0);
        }else {
            System.out.println(result);
        }


    }
}
