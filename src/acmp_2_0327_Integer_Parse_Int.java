import java.util.Scanner;

public class acmp_2_0327_Integer_Parse_Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        while (q > 0) {
            String number = scanner.next();
            int a = Integer.parseInt(number);
//            System.out.println(a);
            int b = a;
            int left = 0;
            int right = 0;
            for (int i = 0; i < 3; i++) {
                right += a % 10;
                a /= 10;
            }
            while (a > 0) {
                left += a % 10;
                a /= 10;
            }
//            System.out.println(left);
//            System.out.println(right);

            if ((left > right) && (b % 10 == 9)) {
                System.out.println("No");
            } else if ((left < right) && (b % 10 == 0)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");

            }
            q--;
        }

    }
}
