import sort.QuickSort;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int[] a= {3,6,9,10,4,56,1,2};
        QuickSort.quickSort(a);
        for (int i : a) {
            System.out.println(i);
        }

    }
}
