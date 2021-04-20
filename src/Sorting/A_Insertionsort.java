
package Sorting;

public class A_Insertionsort {
    
    public static void InsertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i -1;
            while ((j >= 0) && (A[j] > key)) {
                
                A[j + 1]= A[j];
                j--;
            }
            A[j + 1] = A[j];
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    
    public static void main(String[] args) {
        int A[] = {3, 10, 4, 2, 8, 13};
        A_Insertionsort.tampil(A);
        A_Insertionsort.InsertionSort(A);
        A_Insertionsort.tampil(A);
    }
    
}
