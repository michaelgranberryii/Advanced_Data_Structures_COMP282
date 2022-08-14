import java.util.Arrays;

public class SelectionSortDemo {
    private static int selectionSort(int[] numbers) {
        // A variable to hold the number of item comparisons
        int comparisons = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            // Find index of smallest remaining element
            int indexSmallest = i;
            for (int j = i + 1; j < numbers.length; j++) {
                comparisons++;
                if (numbers[j] < numbers[indexSmallest]) {
                    indexSmallest = j;
                }
            }

            // Swap numbers[i] and numbers[indexSmallest]
            int temp = numbers[i];
            numbers[i] = numbers[indexSmallest];
            numbers[indexSmallest] = temp;
        }

        return comparisons;
    }

    public static void main(String[] args) {
        // Create an array of numbers to sort
        int[] numbers = { 10, 2, 78, 4, 45, 32, 7, 11 };

        // Display the contents of the array
        System.out.println("UNSORTED: " + Arrays.toString(numbers));

        // Call the selectionSort method
        int comparisons = selectionSort(numbers);

        // Display the sorted contents of the array
        System.out.println("SORTED:   " + Arrays.toString(numbers));

        System.out.println("Total comparisons: " + comparisons);
    }
}
