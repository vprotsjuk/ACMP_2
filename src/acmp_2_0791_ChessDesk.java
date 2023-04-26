import java.util.Scanner;

public class acmp_2_0791_ChessDesk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fields = 8;
        int k = scanner.nextInt();
        if (k == 1){
            System.out.println((1 + 1) + " " + (1 + fields));
        }
       else  if (k == fields){
            System.out.println( (fields - 1) + " " + fields * 2);
        }
       else  if (k == (Math.pow(fields, 2) - fields) + 1){
            System.out.println( (k - fields) + " " +  (k +  1));
        }
       else if (k == Math.pow(fields, 2) ){
            System.out.println( (k - fields) + " " +  (k -  1));
        }
       else if ( k > 1 && k < fields){
            System.out.println((k - 1) +" " + (k + 1) + " " + (k + fields));
        }
       else if ( k < (Math.pow(fields, 2) ) && k >  (Math.pow(fields, 2) ) - (fields-1)){
            System.out.println((k - fields) + " " + (k - 1) + " " + (k + 1));
        }
        else if ( k %fields == 0){
            System.out.println((k - fields) + " " + (k - 1) + " " + (k + fields));
        }
        else if ( (k - 1) %fields == 0){
            System.out.println((k - fields) + " " + (k + 1) + " " + (k + fields));
        }
       else {
            System.out.println((k - fields) + " " + (k - 1) + " " + (k + 1) + " " + (k + fields));
        }
    }
}
