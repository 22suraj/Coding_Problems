import java.util.ArrayList;

public class SumOfAllSubArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 0, 7, 2 };
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int current = 0;
            for (int j = i; j < array.length; j++) {

                current += array[j];
                arrayList.add(current);
            }
        }

        System.out.println(arrayList);
    }
}
