import java.util.Random;

public class Sorts {
    public static int[] initValues(int size) {
        int[] values = new int[size];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(1001);
        }

        return values;
    }

    public static boolean isSorted(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    public static void printValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%5d", values[i]);

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        if (values.length % 10 != 0) {
            System.out.println();
        }
    }

    public static void selectionSort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[minIndex]) {
                    minIndex = j;
                }
            }

            swap(values, i, minIndex);
        }
    }

    public static void mergeSort(int[] values) {
        int[] tempArray = new int[values.length];
        mergeSort(values, tempArray, 0, values.length - 1);
    }

    private static void mergeSort(int[] values, int[] tempArray, int first, int last) {
        if (first >= last) {
            return;
        }

        int middle = (first + last) / 2;

        mergeSort(values, tempArray, first, middle);
        mergeSort(values, tempArray, middle + 1, last);

        merge(values, tempArray, first, middle, last);
    }

    private static void merge(int[] values, int[] tempArray, int first, int middle, int last) {
        int left = first;
        int right = middle + 1;
        int index = first;

        while (left <= middle && right <= last) {
            if (values[left] <= values[right]) {
                tempArray[index++] = values[left++];
            } else {
                tempArray[index++] = values[right++];
            }
        }

        while (left <= middle) {
            tempArray[index++] = values[left++];
        }

        while (right <= last) {
            tempArray[index++] = values[right++];
        }

        for (int i = first; i <= last; i++) {
            values[i] = tempArray[i];
        }
    }


    public static int[] copyArray(int[] values) {
        return values.clone();
    }

}
