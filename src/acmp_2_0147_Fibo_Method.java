import java.util.Scanner;

public class acmp_2_0147_Fibo_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(fibonacci(a));
    }
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}







//        int a = 0;
//        int b = 1;
//        int c = 0;
//        while (count > 0) {
//            c = a + b;
//            a = b;
//            b = c;
//            count--;
//        }
//        System.out.println(a);
//    }
//}
