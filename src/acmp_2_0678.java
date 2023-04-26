import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class acmp_2_0678 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char [] arr = str.toCharArray();
        String [] thimbles = {"left", "center", "right"};
        String temp = null;

        for ( char c = 0; c < str.length(); c++) {
            if (arr[c] == 'A') {
                temp = thimbles[0];
                thimbles[0] = thimbles[1];
                thimbles[1] = temp;
            }
            if (arr[c] == 'B') {
                temp = thimbles[1];
                thimbles[1] = thimbles[2];
                thimbles[2] = temp;
            }
            if (arr[c] == 'C') {
                temp = thimbles[0];
                thimbles[0] = thimbles[2];
                thimbles[2] = temp;
            }
        }
        System.out.println(Arrays.asList(thimbles).indexOf("left")+1);
//        System.out.println(Arrays.toString(thimbles));
    }
}
