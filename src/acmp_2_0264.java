import java.util.Scanner;

public class acmp_2_0264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int result = -1;
        int temp = 0;
        while (days > 0) {
            int d = scanner.nextInt();
            if (d > 0) {
                temp++;
            }else {
                temp = 0;
            }
            if (temp > result) {
                result = temp;
            }
            days--;
        }
        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}

