import java.util.Scanner;

public class acmp_2_0148 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;
        int first = 0;
        int second = 0;
        if (a>b) {
            first = a;
            second = b;
        }else {
            first = b;
            second = a;
        }
        if (first % second == 0) {
            System.out.println(second);
        }else {
            while ((first % second)  > 0){
                result = first % second;
                first = second;
                second = result;
            }
            System.out.println(result);
        }
    }
}
