import java.util.Scanner;

public class acmp_2_0043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int temp = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0') {
                temp++;
            }else {
                temp = 0;
            }
            if (temp > result){
                result = temp;

            }
        }
        System.out.println(result);


    }
}
