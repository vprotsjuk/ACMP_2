import java.util.Scanner;

public class acmp_2_0935 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if ( ((x1 + y1) % 2 ==  (x2 + y2) % 2 )) {
//        if ( ((x1 + y1) % 2 == 0 && (x2 + y2) % 2 == 0)) {
            System.out.println("YES");
//        }
//        else  if  ((x1 + y1) % 2 == 1 && (x2 + y2) % 2 == 1) {
//            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
