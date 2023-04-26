import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class acmp_2_0340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> firstBox = new ArrayList<>();
        ArrayList<Integer> secondBox = new ArrayList<>();
        firstBox.add(scanner.nextInt());
        firstBox.add(scanner.nextInt());
        firstBox.add(scanner.nextInt());
        secondBox.add(scanner.nextInt());
        secondBox.add(scanner.nextInt());
        secondBox.add(scanner.nextInt());
        Collections.sort(firstBox);
        Collections.sort(secondBox);
        int a1 = firstBox.get(0);
        int b1 = firstBox.get(1);
        int c1 = firstBox.get(2);
        int a2 = secondBox.get(0);
        int b2 = secondBox.get(1);
        int c2 = secondBox.get(2);
        if (a1 == a2 && b1 == b2 && c1 == c2) {
            System.out.println("Boxes are equal");
        } else if (a1 >= a2 && b1 >= b2 && c1 >= c2) {
            System.out.println("The first box is larger than the second one");
        } else if (a1 <= a2 && b1 <= b2 && c1 <= c2) {
            System.out.println("The first box is smaller than the second one");
        } else {
            System.out.println("Boxes are incomparable");
        }
    }
}



