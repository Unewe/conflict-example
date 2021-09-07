//Реализация алгоритмов сортировки.
//Инициализация массива, вывод результата в консоль.
class SortTest {
    int[] arr;
    int size = 0;

    public static void main(String[] args) {
        SortTest s = new SortTest(Integer.parseInt(args[0]));
    }

    public SortTest(int size) {
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
        //TODO Выполнить сортировку пузырьком.
    }

    private void startQuickSortTest() {
        //TODO Выполнить быструю сортировку.
    }
}
