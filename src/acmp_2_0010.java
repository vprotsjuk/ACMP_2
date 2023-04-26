import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class acmp_2_0010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = -100; i <= 100; i++){
            if (a * Math.pow(i, 3) + b * Math.pow(i, 2) + c * i + d == 0) {

                result.add(i);
            }

            Collections.sort(result);
        }
        List<Integer> listWithoutDuplicates = result.stream().distinct().toList();



        for (int i = 0; i < result.size(); i++){
                System.out.print(listWithoutDuplicates.get(i) + " ");

        }
    }
}
