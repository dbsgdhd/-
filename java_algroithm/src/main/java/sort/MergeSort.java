package sort;

public class MergeSort {
    public static void mergeSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
        mergeSort(arr,0,arr.length-1);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l==r){
            return;
        }
        int mid = l + (r-l)>>1;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[] re = new int[r-l+1];
        int i=0;
        int p=l;
        int q=mid+1;
        while (p<=mid&&q<=r){
            re[i++] = arr[p]<arr[q]?arr[p++]:arr[q++];
        }
        while (p<=mid){
            re[i++]=arr[p++];
        }
        while (q<=r){
            re[i++]=arr[q++];
        }
        for (i=0;i<re.length;i++){
            arr[l+i]=re[i];
        }
    }
}
