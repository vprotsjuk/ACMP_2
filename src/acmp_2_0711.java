import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class acmp_2_0711 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPilots = scanner.nextInt();
        int laps = scanner.nextInt();;
        scanner.nextLine();
        ArrayList<String> pilots = new ArrayList<>();
        ArrayList<Integer> totalPilotsTime = new ArrayList<>();


        for (int i = 0; i < numberOfPilots; i++) {
            pilots.add(scanner.next());
            int temp = 0;
            for (int j = 0; j <laps; j++) {
                temp += scanner.nextInt();
            }
            totalPilotsTime.add(temp);
            scanner.nextLine();
        }
        System.out.println( pilots.get (totalPilotsTime.indexOf (Collections.min(totalPilotsTime))) );


        }

    }

