public class Main {
    public static void main(String[] args) {
        int[] sizes = {10000, 1000000};

        for (int size : sizes) {
            System.out.println("\n===== Array Size: " + size + " =====");

            int[] original = Sorts.initValues(size);

            int[] mergeValues = Sorts.copyArray(original);

            long start = System.nanoTime();
            Sorts.mergeSort(mergeValues);
            long end = System.nanoTime();

            System.out.printf("Merge Sort: %.2f ms%n", (end - start) / 1000000.0);
            System.out.println("Merge Sort Correct: " + Sorts.isSorted(mergeValues));

            if (size == 10000) {
                int[] selectionValues = Sorts.copyArray(original);

                start = System.nanoTime();
                Sorts.selectionSort(selectionValues);
                end = System.nanoTime();

                System.out.printf("Selection Sort: %.2f ms%n", (end - start) / 1000000.0);
                System.out.println("Selection Sort Correct: " + Sorts.isSorted(selectionValues));
            } else {
                long comparisons = (long) size * (size - 1) / 2;
                System.out.println("Selection Sort skipped due to impractical runtime.");
                System.out.println("Theoretical Selection Sort comparisons: " + comparisons);
            }
        }

        testEdgeCases();
    }

    public static void testEdgeCases() {
        int[][] testArrays = {
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1},
            {7, 7, 7, 7, 7}
        };

        String[] names = {
            "Already Sorted",
            "Reverse Sorted",
            "Identical Values"
        };

        System.out.println("\n===== Edge Case Tests =====");

        for (int i = 0; i < testArrays.length; i++) {
            int[] selectionValues = Sorts.copyArray(testArrays[i]);
            int[] mergeValues = Sorts.copyArray(testArrays[i]);

            Sorts.selectionSort(selectionValues);
            Sorts.mergeSort(mergeValues);

            System.out.println(names[i]);
            System.out.println("Selection Sort: " + Sorts.isSorted(selectionValues));
            System.out.println("Merge Sort: " + Sorts.isSorted(mergeValues));
        }
    }
}
