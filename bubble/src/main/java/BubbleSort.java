import com.sun.istack.internal.NotNull;

public class BubbleSort {
  static void sort(@NotNull int array[]) {
    int arrLength = array.length;
    boolean needIteration = true;
    while (needIteration == true) {
          needIteration = false;
      for (int i = 1; i < arrLength; i++) {

        if (array[i - 1] > array[i]) {
          int temp = array[i - 1];
          array[i - 1] = array[i];
          array[i] = temp;
          needIteration = true;
        }
      }
    }
  }
}