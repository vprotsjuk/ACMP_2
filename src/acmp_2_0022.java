
import java.util.Scanner;
public class acmp_2_0022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result = 0;
        while (a > 0) {
            result += a & 1;
            a = a >> 1;
            }
        System.out.println(result);
    }
}
