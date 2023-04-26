import java.util.Scanner;

public class acmp_2_0929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
//        int n = 9;

        if (n < 7){
            System.out.println(  (7 - n) + " " + (6 * n)  );
        }else {
            if (n % 6 == 0) {
                System.out.println(   (n / 6)  + " " + (n * 6)   );
            } else {
                System.out.println( (n / 6 + ( Math.abs( (n % 6 ) - 7) )  ) + " " + n * 6);
            }
        }
    }
}
