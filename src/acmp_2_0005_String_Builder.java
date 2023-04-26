import java.util.ArrayList;
import java.util.Scanner;

public class acmp_2_0005_String_Builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int number = -1;
        ArrayList<Integer> evenNumber = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();
        while (days > 0){
            number = scanner.nextInt();
            if (number % 2 == 0){
                evenNumber.add(number);
            }else {
                oddNumber.add(number);
            }
            days--;
        }

        StringBuilder builderEven = new StringBuilder();
        for (int i : evenNumber) {
            builderEven.append(i).append(" ");
        }
        String textEven = builderEven.toString();

        StringBuilder builderOdd = new StringBuilder();
        for (int i : oddNumber) {
            builderOdd.append(i).append(" ");
        }
        String textOdd = builderOdd.toString();

        System.out.println(textOdd);
        System.out.println(textEven);


        if (evenNumber.size() >= oddNumber.size()){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
