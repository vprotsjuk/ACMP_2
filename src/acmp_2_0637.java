import java.util.ArrayList;
import java.util.Scanner;

public class acmp_2_0637 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> commands = new ArrayList<>();
        int result = 0;
        while (n > 0){
            commands.add(scanner.nextInt());
            n--;
        }
        int rooms = scanner.nextInt();
        for (int i = 0; i < commands.size(); i ++){
            if (commands.get(i) <= rooms){
                result += commands.get(i);
            }
            else if (commands.get(i) > rooms){
                result += rooms;
            }
        }
        System.out.println(result);
    }
}
