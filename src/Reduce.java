/**
 * Count the number of steps taken to reduce 100 to 0.
 *
 * - For an integer n, if n is even, then divide it by 2. If n is odd, subtact by 1.
 * - Repeat until 0.
 */
public class Reduce {

    public static void main(String[] args) {
        int stepCount = 0;
        int n = 100;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else if (n % 2 == 1) {
                n--;
            }
            stepCount++;
        }

        System.out.println(stepCount);
    }
}
