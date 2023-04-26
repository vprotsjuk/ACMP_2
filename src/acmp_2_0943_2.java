import java.util.Scanner;

public class acmp_2_0943_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int y = scanner.nextInt() ;
        int x = scanner.nextInt()  ;
        if (y % 2 == 0){
            System.out.println(     (y * column)    - x );
        }else {
            System.out.println(  ((y * column )- 1) - (column - x));
        }
    }
}
