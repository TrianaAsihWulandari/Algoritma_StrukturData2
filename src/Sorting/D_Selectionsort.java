
package Sorting;

public class D_Selectionsort {
    public static void SelectionSort(int[] D) {
        int smallIndex;
        int pass, j, n = D.length;
        int temp;
        
        // index of smallest element in the sublist
        for (pass = 0; pass < n - 1; pass++) { 
            smallIndex = pass;                 
            for (j = pass + 1; j < n; j++) {   
                if (D[j]< D[smallIndex]) {     
                    smallIndex = j;
                }
            }
            // tukar nilai terkecil dengan array[pass]
            temp = D[pass]; //
            D[pass] = D[smallIndex];
            D[smallIndex] = temp;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int A[] = {3,10,4,2,8,13};
        D_Selectionsort.tampil(A);
        D_Selectionsort.SelectionSort(A);
        D_Selectionsort.tampil(A);
        
    }
    
}

    

