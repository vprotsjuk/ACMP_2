import java.util.Scanner;

public class acmp_2_0062_To_Char_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        char[] arr = str.toCharArray();
        int letter = arr[0];
        int number = arr[1];
        if (letter == 'A' || letter == 'C' || letter == 'E' || letter == 'G'){
            letter = 1;
        }else {
            letter = 0;
        } if (number == '1' || number == '3' || number == '5' || number == '7') {
            number = 1;
        }else {
            number = 0;
        }
        if ((letter + number) == 1){
            System.out.println("WHITE");
        }else {
            System.out.println("BLACK");
        }


    }
}
