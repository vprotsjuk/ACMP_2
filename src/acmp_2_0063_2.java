import java.util.Scanner;

public class acmp_2_0063_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int p = scanner.nextInt();
        int sqrt = (int) Math.sqrt(s * s - 4 * p);
        int x1 = (s + sqrt) / 2;
        int x2 = (s - sqrt) / 2;
        if (x1 < x2) {
            System.out.println(x1 + " " + x2);
        }else {
            System.out.println(x2 + " " + x1);
        }
    }
}
