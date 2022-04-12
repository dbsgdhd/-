package sort;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class QuickSort {
    public static void quickSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
//        quickSort(arr,0,arr.length-1);
        quickSort2(arr,0,arr.length-1);
    }

    private static void quickSort2(int[] arr, int l, int r) {
        if (l<r){
            swap(arr, l+(int)(Math.random()*(r-l+1)), r);
            int[] p = partition(arr,l,r);
            quickSort2(arr, l, p[0]-1);
            quickSort2(arr, p[1]+1,r);
        }

    }

    private static int[] partition(int[] arr, int l, int r) {
        int less = l-1;
        int more = r;
        while (l<more){
            if (arr[l]<arr[r]){
                swap(arr, ++less, l++);
            }else if (arr[l]>arr[r]){
                swap(arr, --more, l);
            }else {
                l++;
            }
        }
        swap(arr, more, r);
        return new int[] {less+1,more};
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l==r){
            return;
        }
        int mid = findMid(arr,l,r);
        quickSort(arr,l,mid-1);
        quickSort(arr, mid+1,r);
    }

    private static int findMid(int[] arr, int l, int r) {
        int a = arr[l];
        while (l<r){
            while (arr[r]>a&&l<r){
                r--;
            }
            if (l<r){
                arr[l]=arr[r];
                l++;
            }
            while (arr[l]<a&&l<r){
                l++;
            }
            if (l<r){
                arr[r]=arr[l];
                r--;
            }
        }
        arr[l]=a;
        return l;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
