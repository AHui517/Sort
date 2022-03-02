import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    //递归的将大区间分解为两个区间然后调用merge方法合并为有序区间
    private void mergeSort(int[] array, int L, int R) {
        if (L < R) {
            int M = L + (R - L) / 2;
            mergeSort(array, L, M);
            mergeSort(array, M + 1, R);
            merge(array, M, L, R);
        }
    }

    //将两个有序区间合并为一个有序区间
    private void merge(int[] array, int M, int L, int R) {
        int l = 0;
        int r = 0;
        int[] leftArr = new int[M - L + 1];
        int[] rightArr = new int[R - M];
        for (int i = L; i <= M; i++) {
            leftArr[i - L] = array[i];
        }
        for (int i = M + 1; i <= R; i++) {
            rightArr[i - M - 1] = array[i];
        }
        for (int i = L; i <= R; i++) {
            if (l == leftArr.length && r < rightArr.length) array[i] = rightArr[r++];
            else if (l < leftArr.length && r == rightArr.length) array[i] = leftArr[l++];
            else if (leftArr[l] < rightArr[r]) array[i] = leftArr[l++];
            else array[i] = rightArr[r++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {45, 5, 12, 63, 77, 10, 0, 22, 3, 7, 85, 463, 468, 443, 146, 73, 599};
        System.out.println(Arrays.toString(new MergeSort().mergeSort(arr)));
    }
}
