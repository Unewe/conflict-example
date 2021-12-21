import java.util.Arrays;

class SortTest {
    int[] arr;
    int size = 0;

    public static void main(String[] args) {
        SortTest s = new SortTest(Integer.parseInt(args[0]));
    }

    public SortTest(int size) {
        // Новая строка тут.
        // Еще одна строка !!!!
        this.size = size;

        // Создание массива.
        createArray();

        // Запуск тестов.
        startBubbleSortTest();
        startQuickSortTest();
    }

    private void createArray() {
        // Создание массива.
    }

    private void startBubbleSortTest() {
        int[] copy = Arrays.copyOf(arr, arr.length);
        int n = copy.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
    }

    private void startQuickSortTest() {
        int[] copy = Arrays.copyOf(arr, arr.length);
        quickSort(copy, 0, copy.length - 1);
    }

    private void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int index = process(arr, begin, end);

            quickSort(arr, begin, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    private int process(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = tmp;

        return i + 1;
    }
}
