import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class acmp_2_0633 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayList<String> names = new ArrayList<>();
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());
        Collections.sort(names);
        System.out.println(names);
        System.out.println(command + ":" + " " + names.get(0) + ", "+ names.get(1) + ", "+ names.get(2));

    }
}
