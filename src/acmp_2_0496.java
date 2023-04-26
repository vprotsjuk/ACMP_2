import java.util.Scanner;

public class acmp_2_0496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bushes = scanner.nextInt();
        int temp = 0;
        int result = 0;
        int firstBush = 0;
        int secondBush = 0;
        int bush1 = 0;
        int bush2 = 0;
        int bush3 = 0;
            bush1 = scanner.nextInt();
            firstBush = bush1;
            bushes--;
            bush2 = scanner.nextInt();
            secondBush = bush2;
            bushes--;
            bush3 = scanner.nextInt();
            bushes--;
            temp = bush1 + bush2 + bush3;
        if (temp > result) {
            result = temp;
            temp = 0;
        }
        while (bushes > 0) {
            bush1 = bush2;
            bush2 = bush3;
            bush3 = scanner.nextInt();
            bushes--;
            temp = bush1 + bush2 + bush3;
            if (temp > result) {
                result = temp;
                temp = 0;
            }
        }
        if ((  bush3 + bush2 + firstBush) > result) {
            System.out.println(( bush3 + bush2 + firstBush));
        } else if ((firstBush + bush3 + secondBush) > result) {
            System.out.println((firstBush + bush3 + secondBush));
        } else {
            System.out.println(result);
        }
    }
}
