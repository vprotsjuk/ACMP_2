import java.util.Scanner;

public class acmp_2_0263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = Math.min(b, c);
        int max = Math.max(b, c);
        if (   (max - min)   <   ((a - max) + min)   ){
            System.out.println(   (max - min)-1);
        }else {
            System.out.println(  ( (a - max)+ min ) -1);
        }
    }
}
