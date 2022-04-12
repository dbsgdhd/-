package sort;

public class QuickSort {
    public static void quickSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
        quickSort(arr,0,arr.length-1);
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
}
