import java.util.Scanner;

public class acmp_2_0817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        long d = scanner.nextInt();
        long k = scanner.nextInt();
        System.out.println(  (n + m) * k * d - n * m * d * d);
    }
}
