public class SelectioSort {
  static void sort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int temp = i;
      for (int a = temp; a < arr.length; a++) {
        if (arr[a] < arr[temp]) {
          temp = a;
        }
      }
      int temp2 = arr[i];
      arr[i] = arr[temp];
      arr[temp] = temp2;
    }
  }
}