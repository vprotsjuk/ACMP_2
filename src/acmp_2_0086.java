import java.util.Scanner;

public class acmp_2_0086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a = 3;
        int b = 2;
        int c = 4;
        while (a <k) {
            a += 1;
            b = b + c;
            c += 2;
        }
        if (k == 2) {
            System.out.println(0);
        }
        else  if (k == 1){
            System.out.println(0);
        }else {
            System.out.println(b);
        }
    }
}

