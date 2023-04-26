import java.util.ArrayList;
import java.util.Scanner;

public class acmp_2_0284_2 {

    public static <E> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        while (length > 0){
            numbers.add(scanner.nextInt());
            length --;
        }
        int amoutOfSublistsToPrint = scanner.nextInt();
        while (amoutOfSublistsToPrint > 0){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            amoutOfSublistsToPrint--;
            ArrayList<Integer> outputSublist = new ArrayList<>(numbers.subList(i-1, j));
            StringBuilder stringBuilder = new StringBuilder();
            for (int number : outputSublist) {
                stringBuilder.append(number + " ");
            }
            System.out.println(stringBuilder.toString());
        }
    }
}

