import java.util.*;

public class acmp_2_0284_String_Builder {
    public static <E> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int massiveLenth = scanner.nextInt();
        ArrayList<Integer> massive = new ArrayList<>(massiveLenth);
        while (massiveLenth > 0){
            massive.add(0, scanner.nextInt());
            massiveLenth --;
        }
        Collections.reverse(massive);
        int output = scanner.nextInt();
        while (output > 0){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            output--;
            ArrayList<Integer> outputSublist = new ArrayList<>(massive.subList(i-1, j));
            StringBuilder builder = new StringBuilder();
            for (int c : outputSublist) {
                builder.append(c + " ");
            }
            System.out.println(builder.toString() );
        }
    }
}
