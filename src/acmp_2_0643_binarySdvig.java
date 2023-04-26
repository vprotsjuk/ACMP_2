import java.util.Scanner;

public class acmp_2_0643_binarySdvig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int a = c;
        int result = 0;
        while (a > 0) {
            result += a & 1;
            a = a >> 1;
        }
        System.out.println(c +result);
    }
}

