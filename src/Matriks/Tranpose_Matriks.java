
package Matriks;
import java.util.Scanner;

public class Tranpose_Matriks {
    public static void main(String[] args) {
    int i, j, m, n;
    int matriks[][] = new int [10][10];
    int transpose[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan jumlah : ");
    m = scan.nextInt();
    System.out.print("Masukan jumlah kolom matriks: ");
    n = scan.nextInt();
    System.out.print("Masukan elemen matriks: ");
    for(i = 0; i < m; i++) {
        for(j = 0; j< n; j++) {
            matriks[i][j] = scan.nextInt();
          }
        } 
        System.out.println("Hasil matriks: ");
        for(i = 0; i < m; i++) {
            for(j = 0; j< n; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        
        for(i = 0; i < m; i++){
            for(j =0; j< n; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        
        System.out.println("Hasil transpose matriks: ");
        for(i = 0; i < n; i++) {
            for(j = 0; j< m; j++) {
                System.out.println(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}

    

