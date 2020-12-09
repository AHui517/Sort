import java.util.Arrays;

public class SelectSort {
    //寻找每轮中最小的元素往前插
    public int[] selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //i后面的元素中最小的元素和i进行交换
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) min = j;
            }
            //交换操作
            int t = array[i];
            array[i] = array[min];
            array[min] = t;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array={45,56};
        System.out.println(Arrays.toString(new SelectSort().selectSort(array)));
    }
}
