import java.util.Scanner;

public class acmp_2_0798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();;
        int n = scanner.nextInt();;
        int i = scanner.nextInt();;
        int j = scanner.nextInt();;
        int c = scanner.nextInt();;
        if ( (m * n) %2 == 0  ){
            System.out.println("equal");
        }else {
            if ( (i + j) %2 == 0 && c == 0) {
                System.out.println("black");
            }else if ((i + j) %2 == 1 && c == 0) {
                System.out.println("white");
            }else  if ((i + j) %2 == 0 && c == 1) {
                System.out.println("white");
            }
            else {
                System.out.println("black");
            }
        }
    }
}
