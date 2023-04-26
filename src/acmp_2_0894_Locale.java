import java.util.Locale;
import java.util.Scanner;

public class acmp_2_0894_Locale {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        double ringArea;
        ringArea = scanner.nextDouble();
        double radius1 = scanner.nextDouble();
        double bigCircleArea = radius1 * radius1 * pi;
        double smallCircleArea = bigCircleArea - ringArea;
        double r2 = Math.sqrt(smallCircleArea / pi);
        System.out.println(r2);
    }
}
