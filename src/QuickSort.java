import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[] array) {
        quickSort(array,0,array.length-1);
        return array;
    }

    private void quickSort(int[] array,int left,int right) {
        if (left < right) {
            int mid=partition(array,left,right);
            quickSort(array,left,mid-1);
            quickSort(array,mid+1,right);
        }
        return ;
    }

    private int partition(int[] array,int left,int right) {
        int pivot = array[left];
        int i = left + 1;
        while (true) {
            // 向左找到第一个大于等于 pivot 的元素位置
            while(i <= right && array[right] >= pivot ) right--;   //这里画个图，注意符号
            // 向右找到第一个小于等于 pivot 的元素位置
            while (i <= right && array[i] <= pivot) i++;
            if(i >= right)
                break;
            //交换两个元素的位置，使得左边的元素不大于pivot,右边的不小于pivot
            int temp = array[i];
            array[i] = array[right];
            array[right] = temp;
        }
        array[left] = array[right];
        // 使中轴元素处于有序的位置
        array[right] = pivot;
        return right;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new QuickSort().quickSort(new int[]{45,8,7,40,1,3,465,79,421})));
    }
}
