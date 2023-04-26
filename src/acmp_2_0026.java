import java.util.Scanner;

public class acmp_2_0026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int a = Math.abs(x2 - x1);
        int b = Math.abs(y2 - y1);
        double gipo = Math.sqrt(a * a + b * b);
        if (  ((r1+r2) >= gipo) && (r1 <= (gipo + r2)) && (r2 <= (gipo+r1)) ){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
