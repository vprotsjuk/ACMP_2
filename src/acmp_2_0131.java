import java.util.ArrayList;
import java.util.Scanner;

public class acmp_2_0131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Integer> sex = new ArrayList<>();
        int oldestAge = 0;
        int answerI = 0;
        int z = 0;
        while (total > 0) {
            age.add(z, scanner.nextInt());
            sex.add(z, scanner.nextInt());
            total--;
            z++;
        }
        for (int i = 0; i < age.size(); i++) {
            if ((sex.get(i) == 0)) {
                age.set(i, 0);
            }
            if ((age.get(i) > oldestAge) && (sex.get(i) == 1)) {
                oldestAge = age.get(i);
                answerI = age.indexOf(oldestAge) + 1;
            }
        }
        if (answerI ==0) {
            System.out.println(-1);
        }else {
            System.out.println(answerI);
        }
    }
}

