import java.util.Scanner;

public class acmp_2_0778 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalWorkers = 0;
        while (scanner.hasNext()){
            totalWorkers += scanner.nextInt();
        }
        System.out.println(totalWorkers/27);
    }
}
