import java.util.Arrays;

public class CountSort {
    //思路，生成一个临时数组，存放每个元素出现的次数，然后遍历这个数组，得到排序后的数组
    public int[] countSort(int[] array) {
        //获取生成临时数组的大小，size=max-min+1
        int min=array[0];
        int max=array[0];
        int size;
        for (int num : array) {
            if (num<min) min=num;
            if (num>max) max=num;
        }
        size=max-min;
        int[] countArr=new int[size+1];
        for (int num : array) {
            countArr[num-min]++;
        }
        int index=0;
        //遍历临时数组，得到有序数组
        for (int i = 0; i < array.length; i++) {
            while (countArr[i]>0){
                array[index++]=i+min;
                countArr[i]--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr={2};
        System.out.println(Arrays.toString(new CountSort().countSort(arr)));
    }
}
