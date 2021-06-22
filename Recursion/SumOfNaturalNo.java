public class SumOfNaturalNo {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int preSum = sum(n - 1);

        return n + preSum;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
