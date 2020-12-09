import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //每进行一次排序，下一轮需要排序的的个数就减一
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    //交换两个元素
                    int tem = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tem;
                }
            }
        }
        return array;
    }

    public int[] bubbleSortImprove(int[] array){
        for (int i = 0; i < array.length; i++) {
            //flag作为标记，如果前面元素已经有序，则无需继续排序
            boolean flag=true;
            //每进行一次排序，下一轮需要排序的的个数就减一
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    //交换两个元素
                    flag=false;
                    int tem = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tem;
                }
            }
            //前面数组已经有序
            if (flag) break;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr={5,4,8,9,6,1,2,3};
        System.out.println(Arrays.toString(new BubbleSort().bubbleSortImprove(arr)));
    }
}
