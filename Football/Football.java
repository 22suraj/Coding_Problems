import java.util.ArrayList;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {
            ArrayList<Integer> arrayListA = new ArrayList<>();
            ArrayList<Integer> arrayListB = new ArrayList<>();
            int maxValue = 0;

            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arrayListA.add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                arrayListB.add(sc.nextInt());
            }

            for (int i = 0; i < n; i++) {
                if ((arrayListA.get(i) * 20 - arrayListB.get(i) * 10) >= maxValue) {
                    maxValue = arrayListA.get(i) * 20 - arrayListB.get(i) * 10;
                }
            }
            System.out.println(maxValue);
        }
    }
}
