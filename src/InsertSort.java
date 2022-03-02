import java.util.Arrays;

public class InsertSort {

    //该排序和打牌时整自己的手牌过程差不多
    public int[] insertSort(int[] array) {
        //从第二个数开始进行插入操作
        for (int i = 1; i < array.length; i++) {
            //保存当前需要进行插入操作的元素
            int t = array[i];
            //初始化进行计较的索引
            int j = i - 1;
            //这一步是在寻找我需要插入的位置
            while (j >= 0 && t < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            //进行插入
            array[j + 1] = t;
        }
        return array;
    }

    public static void inSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tem = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > tem) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tem;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {45, 56, 82, 1, 56, 0, 63, 16, 266, 4};
        InsertSort.inSort(array);
    }
}
