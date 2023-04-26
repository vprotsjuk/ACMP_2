import java.util.Scanner;

public class acmp_2_0331_Integer_Parse_Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String s = scanner.next();
        int hh = Integer.parseInt(s.substring(0,2));
        int mm = Integer.parseInt(s.substring(3));
        int hTimeInRace = scanner.nextInt();
        int mTimeInRace = scanner.nextInt();

        int resultMin = mm + mTimeInRace;
        if (resultMin > 59){
            resultMin = mm + mTimeInRace - 60;
            hTimeInRace = hTimeInRace + 1;
        }
        int resultHour = hh + hTimeInRace;
        if (resultHour > 23){
            while (resultHour > 23) {
                resultHour = resultHour - 24;
            }
        }

        if (resultMin < 10 && resultHour < 10){
            System.out.println("0" + resultHour + ":"+ "0" + resultMin);
        }
        else if (resultMin < 10){
            System.out.println(resultHour + ":" + "0" + resultMin);
        }
        else  if (resultHour < 10){
            System.out.println("0" + resultHour + ":" + resultMin);
        }else {

            System.out.println(resultHour + ":" + resultMin);

        }
    }
}
