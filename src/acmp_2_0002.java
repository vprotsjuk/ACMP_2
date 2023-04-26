import java.util.Scanner;

public class acmp_2_0002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long a = 1;
        long b = 0;
        if (n > 0) {
            System.out.println((n + 1) * (n) / 2);
        } else {
            System.out.println((n + 1) * (2 - n ) / 2);

        }
    }
}
//
//        if (n == 0){
//            System.out.println(1);
//        }
//        else  if (n > 0) {
//
//            System.out.println(  (n * (n + 1)/2 ));
//        }else {
//            System.out.println(  (n * (-n+1)/2  )+1 );
//        }
//        }
//    }

