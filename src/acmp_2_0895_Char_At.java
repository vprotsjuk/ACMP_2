import java.util.Locale;
import java.util.Scanner;


public class acmp_2_0895_Char_At {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner scanner = new Scanner(System.in);
        String f = scanner.next();
        String s = scanner.next();
        String t = scanner.next();
        if ((f.charAt(0) == 'X' && f.charAt(1) == 'X' && f.charAt(2) == 'X') ||
                (s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X') ||
                (t.charAt(0) == 'X' && t.charAt(1) == 'X' && t.charAt(2) == 'X') ||
                (f.charAt(0) == 'X' && s.charAt(1) == 'X' && t.charAt(2) == 'X') ||
                (f.charAt(2) == 'X' && s.charAt(1) == 'X' && t.charAt(0) == 'X') ||
                (f.charAt(0) == 'X' && s.charAt(0) == 'X' && t.charAt(0) == 'X') ||
                (f.charAt(1) == 'X' && s.charAt(1) == 'X' && t.charAt(1) == 'X') ||
                (f.charAt(2) == 'X' && s.charAt(2) == 'X' && t.charAt(2) == 'X') ) {
            System.out.println("Win");
        } else if ((f.charAt(0) == 'O' && f.charAt(1) == 'O' && f.charAt(2) == 'O') ||
                (s.charAt(0) == 'O' && s.charAt(1) == 'O' && s.charAt(2) == 'O') ||
                (t.charAt(0) == 'O' && t.charAt(1) == 'O' && t.charAt(2) == 'O') ||
                (f.charAt(0) == 'O' && s.charAt(1) == 'O' && t.charAt(2) == 'O') ||
                (f.charAt(2) == 'O' && s.charAt(1) == 'O' && t.charAt(0) == 'O') ||
                (f.charAt(0) == 'O' && s.charAt(0) == 'O' && t.charAt(0) == 'O') ||
                (f.charAt(1) == 'O' && s.charAt(1) == 'O' && t.charAt(1) == 'O') ||
                (f.charAt(2) == 'O' && s.charAt(2) == 'O' && t.charAt(2) == 'O')) {
            System.out.println("Lose");
        } else {
            System.out.println("Draw");
        }
    }
}








//        ArrayList<Integer> first = new ArrayList<>();
//        ArrayList<Integer> second = new ArrayList<>();
//        ArrayList<Integer> third = new ArrayList<>();
//        for (int i = 0; i < f.length(); i++) {
//            first.add( Integer.parseInt(String.valueOf (f.charAt(i))   ));
//            second.add(Integer.parseInt(String.valueOf (s.charAt(i)) ));
//            third.add(Integer.parseInt(String.valueOf (t.charAt(i)) ));
//        }
////        System.out.println(first.get(0) );
////        System.out.println(first.get(1));
////        System.out.println(first.get(2));
//        if ((first.get(0) == 88 && first.get(1) == 88 && first.get(2) == 88) ||
//                (second.get(0) == 88 && second.get(1) == 88 && second.get(2) == 88) ||
//                (third.get(0) == 88 && third.get(1) == 88 && third.get(2) == 88) ||
//                (first.get(0) == 88 && second.get(1) == 88 && third.get(2) == 88) ||
//                (first.get(2) == 88 && second.get(1) == 88 && third.get(0) == 88)) {
//            System.out.println("Win");
//        } else if ((first.get(0) == 79 && first.get(1) == 79 && first.get(2) == 79) ||
//                (second.get(0) == 79 && second.get(1) == 79 && second.get(2) == 79) ||
//                (third.get(0) == 79 && third.get(1) == 79 && third.get(2) == 79) ||
//                (first.get(0) == 79 && second.get(1) == 79 && third.get(2) == 79) ||
//                (first.get(2) == 79 && second.get(1) == 79 && third.get(0) == 79)) {
//        } else {
//            System.out.println("Draw");
//        }
//
////        System.out.println(first);
////        System.out.println(second);
////        System.out.println(third);
//    }
//}
