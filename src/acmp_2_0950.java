import java.util.*;

public class acmp_2_0950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String res = "";
        int zero = 0;
        for (int i = 0; i < str.length(); i++) {
            while (str.charAt(i) == '0') {
                zero++;
                i++;
            }
           res += ((char) (zero + 'a'));
            zero = 0;
        }
        System.out.println(res);
    }
}


//import java.util.*;
//
//public class acmp_2_0950 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        ArrayList<Character> result = new ArrayList<>();
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            while (str.charAt(i) == '0') {
//                count++;
//                i++;
//            }
//            result.add((char) (count + 'a'));
//            count = 0;
//        }
//        StringBuilder builder = new StringBuilder();
//        for (char value : result) {
//            builder.append(value);
//        }
//        String text = builder.toString();
//        System.out.println(text);
//    }
//}



//        System.out.println(str );
//        HashMap<Integer, String> alphabet = new HashMap<Integer, String>();
//        alphabet.put(0, "a");
//        alphabet.put(1, "b");
//        alphabet.put(2, "c");
//        alphabet.put(3, "d");
//        alphabet.put(4, "e");
//        alphabet.put(5, "f");
//        alphabet.put(6, "g");
//        alphabet.put(7, "h");
//        alphabet.put(8, "i");
//        alphabet.put(9, "j");
//        alphabet.put(10, "k");
//        alphabet.put(11,"l");
//        alphabet.put(12, "m");
//        alphabet.put(13, "n");
//        alphabet.put(14, "o");
//        alphabet.put(15, "p");
//        alphabet.put(16, "q");
//        alphabet.put(17, "r");
//        alphabet.put(18, "s");
//        alphabet.put(19, "t");
//        alphabet.put(20, "u");
//        alphabet.put(21, "v");
//        alphabet.put(22, "w");
//        alphabet.put(23, "x");
//        alphabet.put(24, "y");
//        alphabet.put(25, "z");
//        ArrayList<String> result = new ArrayList<>();
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            while  (str.charAt(i) == '0') {
//                count++;
//                i++;
//            }
//            result.add(alphabet.get(count));
//            count = 0;
//            }
//        StringBuilder builder = new StringBuilder();
//        for (String value : result) {
//            builder.append(value);
//        }
//        String text = builder.toString();
//        System.out.println(text);
//    }
//}
