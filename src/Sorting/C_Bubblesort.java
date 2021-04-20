
package Sorting;

public class C_Bubblesort {
    public static void BubbleSort(int[] C) {
        int i=1, j, n = C.length;
        int temp;
        while (i<n) {
            j = n-1;
            while (i<n) {
                if (C[j-1]>C[j]) {
                    temp = C[j];
                    C[j] = C[j-1];
                    C[j-1] = temp;
                }
                j = j-1;
            }
            i = i + 1;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int C[] = {3,10,4,2,8,13};
        C_Bubblesort.tampil(C);
        C_Bubblesort.BubbleSort(C);
        C_Bubblesort.tampil(C);
    }
    
}
