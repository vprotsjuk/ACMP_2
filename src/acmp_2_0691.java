import java.util.Scanner;

public class acmp_2_0691 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isLetter = new String("ABCEHKMOPTXY");
        String isNumber = new String("0123456789");
        int count = scanner.nextInt();

        while (count > 0) {
            String stringToProve = scanner.next();
            if (stringToProve.length() != 6){
                System.out.println("No");
            }
            else if (isLetter.indexOf(stringToProve.charAt(0)) != -1 &&
                    isNumber.indexOf(stringToProve.charAt(1)) != -1 &&
                    isNumber.indexOf(stringToProve.charAt(2)) != -1 &&
                    isNumber.indexOf(stringToProve.charAt(3)) != -1 &&
                    isLetter.indexOf(stringToProve.charAt(4)) != -1 &&
                    isLetter.indexOf(stringToProve.charAt(5)) != -1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            count--;
        }
    }
}
