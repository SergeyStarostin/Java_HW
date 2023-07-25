import java.util.Arrays;

class Answer {
  public int[] subArrays(int[] a, int[] b) {
    // проверяем что длины массивов равны, если не равны, то возвращаем новый
    // массив, содержащий только один элемент - 0
    if (a.length != b.length) {
      return new int[] { 0 };
    }
    // создаем новый массив С с длиной, равной длине массивов А и В
    int[] c = new int[a.length];
    // проходимся по каждому элементу массивов А и В
    for (int i = 0; i < a.length; i++) {
      // вычисляем разность между соответствующими элементами и записываем результат в
      // массив С
      c[i] = a[i] - b[i];
    }
    return c; // возвращаем массив С
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
  public static void main(String[] args) {
    int[] a = {};
    int[] b = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      a = new int[] { 4, 5, 6 };
      b = new int[] { 1, 2, 3 };
    } else {
      a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
      b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
    }

    Answer ans = new Answer();
    String itresume_res = Arrays.toString(ans.subArrays(a, b));
    System.out.println(itresume_res);
  }
}