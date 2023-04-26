import java.util.Scanner;

public class acmp_2_0844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long i = 1;
        while (i <= Math.max(a, b)) {
            if ((i * i) == (a * b)) {
                System.out.println(i);
                break;
            }
           if ((i * i) > (a * b)) {
                System.out.println(0);
                break;
            }
            i++;
        }
    }
}


//        if (Math.sqrt(a * b) % 1 != 0){
//            System.out.println(0);
//        }else {
//            System.out.println((long) Math.sqrt(a * b));
//        }

//        System.out.println(5.5 % 1);
//    }
//}
