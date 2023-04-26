import java.util.Scanner;

public class acmp_2_0822_Round_Double_to_2_Decimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        double a = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
        double b = Math.sqrt(Math.pow(Math.abs(x3 - x2), 2) + Math.pow(Math.abs(y3 - y2), 2));
        double c = Math.sqrt(Math.pow(Math.abs(x3 - x1), 2) + Math.pow(Math.abs(y3 - y1), 2));
        double p = (a + b + c) / 2.0;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(p);

        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(Math.round(result * 100.0) / 100.0);
    }
}





