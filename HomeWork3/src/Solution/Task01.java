package Solution;

import java.util.Arrays;

public class Task01 {

/*
Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
*/

    public static void MergeSortMain(String args[]) 
    {
        int[] sortArr = {45, 85, -2, 13, 75, 21, 10};
        System.out.println(Arrays.toString(sortArr));
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] sortArr)
    {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) 
    {
        if (startIndex >= endIndex - 1)
            return buffer1;
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex)
        {
            if (sorted1[index1] < sorted2[index2]){
                result[destIndex++] = sorted1[index1++];
            }else
                result[destIndex++] = sorted2[index2++];
        }
        while (index1 < middle) 
            result[destIndex++] = sorted1[index1++];
        
        while (index2 < endIndex) 
            result[destIndex++] = sorted2[index2++];
        return result;
    }
}