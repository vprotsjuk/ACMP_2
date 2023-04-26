import java.util.Scanner;

public class acmp_2_0028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int xA = scanner.nextInt();
        int yA = scanner.nextInt();
        if (x1 == x2){
            System.out.println((x1 * 2 - xA) + " " + yA);
        }else  if ( y1 == y2){
            System.out.println(xA + " " + (y1*2 - yA));
        }
    }
}
