import java.util.Scanner;

public class acmp_2_0763 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ;
        int b = scanner.nextInt();
        if (a == 1 && b == 1) {
            System.out.println(0);
        } else {
            if (a == 1 || b == 1) {
                System.out.println(1);
            } else if(a != b) {
                System.out.println(1);
            }else {
                System.out.println(2);
            }
        }
    }
}


