public class MaxTillI {
    public static void main(String[] args) {
        int[] array = { 1, 0, 5, 4, 6, 8 };

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            for (int j = 0; j <= i; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
            }
            array[i] = max;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
