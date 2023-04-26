import java.util.Scanner;
public class acmp_2_0791_2 {
        public static void main(String[] args) {
            int boardWidth = 8;
            int boardSize = 64;
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            boolean hasLeft = (n-1) % boardWidth != 0 && n != 1;
            boolean hasUp = n <= boardSize-boardWidth;
            boolean hasDown = n>boardWidth;
            boolean hasRight = n%boardWidth != 0;
            String ans = "";
            if(hasLeft)
                ans = ans + (n-1) + " ";
            if(hasRight)
                ans = ans + (n+1) + " ";
            if(hasUp)
                ans = ans + (n+boardWidth) + " ";
            if(hasDown)
                ans = ans + (n-boardWidth) + " ";
            System.out.println(ans);
        }
    }

