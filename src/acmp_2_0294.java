import java.util.Scanner;

public class acmp_2_0294 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bolts = scanner.nextInt();
        int boltsLoosePercent = scanner.nextInt();
        int boltsPrice = scanner.nextInt();
        int screw = scanner.nextInt();
        int screwLoosePercent = scanner.nextInt();
        int screwPrice = scanner.nextInt();
        int boltsLoosePrice = bolts / 100 * boltsLoosePercent * boltsPrice;
        int screwLoosePrice = screw / 100 * screwLoosePercent * screwPrice;
        int boltRest = bolts - (bolts * boltsLoosePercent / 100);
        int screwRest = screw - (screw * screwLoosePercent / 100);
        int delta = 0;
        if (boltRest >= screwRest){
            delta = ( boltRest  - screwRest) * boltsPrice;
        }else {
            delta = (screwRest - boltRest) * screwPrice;
        }
        System.out.println(boltsLoosePrice + screwLoosePrice + delta);
    }
}
