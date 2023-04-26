import java.util.Scanner;

public class acmp_2_0014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();;
        int b = scanner.nextInt();;
        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = b; i > 0; i --){
            if (a % i == 0 && b % i == 0){
                System.out.println(a * b / i);
                break;

            }
        }

    }
}
