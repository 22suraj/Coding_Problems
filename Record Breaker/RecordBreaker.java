public class RecordBreaker {
    public static void main(String[] args) {
        int[] array = { 1, 2, 0, 7, 2, 0, 2, 8 };

        for (int i = 0; i < array.length; i++) {
            boolean status = true;
            for (int j = 0; j <= i; j++) {
                if (array[i] < array[j]) {
                    status = false;
                    break;
                }
            }
            if (i != array.length - 1) {
                if (array[i] < array[i + 1]) {
                    status = false;
                }
            }
            if (status) {
                System.out.println("Breaking day : " + array[i] + " At index : " + i);
            }
        }
    }
}
/////////// Time Complexity : O(n^2) /////////////////