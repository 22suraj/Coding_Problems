import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Horses
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int totalStable = sc.nextInt();

        for (int k = 0; k < totalStable; k++) {
            int n = sc.nextInt();
            int shortDistance = 1000000000;

            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();

            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] >= array[j]) {
                        if (array[i] - array[j] < shortDistance) {
                            shortDistance = array[i] - array[j];
                        }
                    } else {
                        if (array[j] - array[i] < shortDistance) {
                            shortDistance = array[j] - array[i];
                        }
                    }
                }
            }
            System.out.println(shortDistance);
        }
	}
}
