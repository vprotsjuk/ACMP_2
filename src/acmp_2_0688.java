import java.util.Scanner;

public class acmp_2_0688 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xSuslik = scanner.nextInt();
        int ySuslik = scanner.nextInt();
        int xDog = scanner.nextInt();
        int yDog = scanner.nextInt();
        int count = 0;

        int holeNumbers = scanner.nextInt();
        while (holeNumbers > 0) {
            int xHole = scanner.nextInt();
            int yHole = scanner.nextInt();
            double suslikDistanse = (Math.sqrt((Math.pow(xHole - xSuslik, 2) + Math.pow(yHole - ySuslik, 2)))) * 2;
            double dogDistanse = Math.sqrt((Math.pow(xHole - xDog, 2) + Math.pow(yHole - yDog, 2)));
            count++;
            if (suslikDistanse > dogDistanse) {
                holeNumbers--;
            }else {
                System.out.println(count);
                break;
            }
            if (holeNumbers == 0) {
                System.out.println("NO");
            }
        }
    }
}
