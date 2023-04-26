import java.util.Scanner;

public class acmp_2_0952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        long adults = 2;
        long children = 9;
        if (adults == 0 ) {
            System.out.println("Impossible");
        }else if (children == 0){
            System.out.println(adults + " " + adults);
        }
        else if(children <= adults) {
            System.out.println(adults + " " + (adults + (children - 1)));
        }else {
            System.out.println((adults + (children - adults)) + " " + (adults + (children -1)));
        }
    }
}
