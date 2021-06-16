import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        for (Integer element : arrayList) {
            int num = element;
            int total = 0;
            while (num != 0) {
                total = total * 10 + num % 10;
                num = num / 10;
            }
            System.out.println(total);
        }
    }
}
