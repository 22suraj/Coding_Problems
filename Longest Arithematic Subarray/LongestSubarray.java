import java.util.ArrayList;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] array = { 10, 7, 4, 6, 8, 10, 11 };
        ArrayList<Integer> arrayList = new ArrayList<>();

        int pd = array[1] - array[0];
        int counter = 2;
        int ans = 2;

        for (int i = 0; i < array.length - 1; i++) {
            if (pd == array[i + 1] - array[i]) {
                counter++;
            } else {
                pd = array[i + 1] - array[i];
                counter = 2;
            }
            ans = Math.max(ans, counter);
        }

        System.out.println(ans);

    }
}
