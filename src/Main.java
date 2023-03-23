import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        System.out.print("Data points: ");
        for (int i = 0; i < dataPoints.length; i++) {
            if (i == dataPoints.length - 1) {
                System.out.printf("%d", dataPoints[i]);
            } else {
                System.out.printf("%d | ", dataPoints[i]);
                }
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        System.out.printf("The sum of the array is %d\n", sum);
        System.out.printf("The average of the array is %.2f\n", average);

        Scanner scanner = new Scanner(System.in);


        int userValue = SafeInput.getRangedInt(scanner, "Enter a value between 1 and 100: ", 1, 100);


        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.printf("The user input (%d) was found %d times in the array.\n", userValue, count);

        userValue = SafeInput.getRangedInt(scanner, "Enter another value between 1 and 100: ", 1, 100);

        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                System.out.printf("The value %d was found at array index %d.\n", userValue, i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.printf("The value %d was not found in the array.\n", userValue);
        }

        int minVal = dataPoints[0];
        int maxVal = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minVal) {
                minVal = dataPoints[i];
            }
            if (dataPoints[i] > maxVal) {
                maxVal = dataPoints[i];
            }
        }
        System.out.println("The min is: " + minVal);
        System.out.println("The max is: " + maxVal);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum+= value;
        }
        return (double) sum / values.length;
    }
}

