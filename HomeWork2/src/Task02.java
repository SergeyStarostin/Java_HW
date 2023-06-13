import java.io.IOException;
import java.util.logging.*;

public class Task02 
{
    public static void main(String[] args) throws IOException 
    {
        Logger logger = Logger.getLogger(Task02.class.getName());
        FileHandler fh = new FileHandler("LogTask02.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Заданный массив: ");
        int [] array = {-10, 12, 6, 45, 2, 3, 41, -1};
        PrintArray(array);
        int[] newArr = listSort(array);
        System.out.print("\n Отсортированный массив: \n");
        PrintArray(newArr);
    }

    public static int[] listSort(int [] array)
    {
        for(int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if (array[j] > array[j + 1]) 
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void PrintArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++) System.out.printf("%d, ", array[i]);
    }
}