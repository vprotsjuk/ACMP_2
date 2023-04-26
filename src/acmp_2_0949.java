import java.util.Scanner;

public class acmp_2_0949 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int a = 0;
        while (n > 1) {
            n--;
            a = c - b;
            c = b;
            b = a;
        }
        System.out.println(b + " " + c);
    }
}
