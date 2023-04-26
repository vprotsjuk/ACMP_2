import java.util.Scanner;

public class acmp_2_0850 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = 0;
        int min = -1;
        int max = -1;
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }

        max = a;
        if (b % 2 == 0){
            min = b/2;
        }else {
            min = b/2 + 1;
        }

        System.out.println(min + " " + max);


    }
}
