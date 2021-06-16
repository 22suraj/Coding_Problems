import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int total = 1;
            int num = array[i];
            while (num > 0) {
                total = total * num;
                num--;
            }
            System.out.println(total);
        }
    }
}
