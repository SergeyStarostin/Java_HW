package PyramidSorting;

public class pyramid 
{
/*
2) Реализовать алгоритм пирамидальной сортировки (HeapSort)(найти метод в Интернете и включить в проект).
 */
    public static void sort(int[] array) 
    {
        int size = array.length;

        // Построить кучу (переставить массив)
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

        // Один за другим извлечь элемент из кучи
        for (int i = size - 1; i > 0; i--) {
            // Переместить текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // вызвать max heapify для уменьшенной кучи
            heapify(array, i, 0);
        }
    }

    // Чтобы создать поддерево с корнем узла i, который является индексом в arr[]. size - размер кучи
    static void heapify(int[] array, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Если левый дочерний элемент больше, чем корень
        if (left < size && array[left] > array[largest])
            largest = left;

        // Если правый дочерний больше, чем самый большой до сих пор
        if (right < size && array[right] > array[largest])
            largest = right;

        // Если самый большой не корень
        if (largest != i) 
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, size, largest);
        }
    }
}