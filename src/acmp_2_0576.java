import java.util.Scanner;

public class acmp_2_0576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int f = first;
        int second = first - 1;
        int s = second;
        int result = first;
        int answer = first;
        while (second > 0){
            while ((f % s) > 0) {
            result = f % s;
            f = s;
            s = result;
        }
        if (s == 1) {
            answer--;
            f = first;
        }
        s = second;
        second--;
            f = first;
        }
        System.out.println(first - answer );

    }
}

