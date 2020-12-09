import java.util.Arrays;

public class ShellSort {
    public int[] shellSort(int[] array){
        int len=array.length;
        //变量gap为间隔,即间隔为gap的元素分在一组，当gap为1时，即为插入排序
        for (int gap = len/2; gap > 0; gap/=2) {
            for (int j = gap; j < len; j++) {
                //对每个分组进行插入排序
                insert(array,gap,j);
            }
        }
        return array;
    }

    //插入排序
    private void insert(int[] array,int gap,int j) {
        int tem=array[j];
        int pre=j-gap;
        while (pre>=0 && tem<array[pre]) {
            array[pre+gap]=array[pre];
            pre-=gap;
        }
        array[pre+gap]=tem;
    }

    public static void main(String[] args) {
        int[] arr={45,4,89,67,633,1,469,77,564,52};
        System.out.println(Arrays.toString(new ShellSort().shellSort(arr)));
    }
}
