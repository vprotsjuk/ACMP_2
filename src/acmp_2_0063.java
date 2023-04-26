import java.util.Scanner;

public class acmp_2_0063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s = 7;
        long p = 12;
        long x = 0;
        long y = 0;
        long sqrt = (long) Math.sqrt(p);
        while (p / sqrt != (s -sqrt)){
            sqrt--;
            p++;
        }
        if (sqrt <  (s-sqrt)) {
            System.out.println(sqrt + " " + (s - sqrt));
        }else {
            System.out.println((s - sqrt) + " " + sqrt);
        }
    }
}
