import java.util.Arrays;
import java.util.Random;

public class LoopSolution {

    public static void main(String[] args) {
        // Write the program that print all values in array
        int[] number = { 123,456,789,321,543,765,987 };

        int[] ramdonSet = new int[5];
        for (int i = 0; i < ramdonSet.length; i++) {
            ramdonSet[i] = new Random().nextInt(ramdonSet.length);
        }
        System.out.println(testQuiz2(ramdonSet));
        System.out.println(Arrays.toString(ramdonSet));
    }

    public static void testQuiz1() {
        // Write program that return number 1 - 10
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static int testQuiz2(int[] randomSet) {
        // Write the program that read sets of integers, then return the sum of even integer
        int evenNumber = 0;
        for (int i = 0; i < randomSet.length; i++) {
            if(randomSet[i] % 2 == 0) evenNumber += randomSet[i];
        }
        return evenNumber;

    }
}
