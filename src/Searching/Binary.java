
package Searching;

public class Binary {
    public static void main(String[] args) {
        //pendeklarasian variabel
        int E[] = {3, 10, 4, 2, 8, 13};
        int cari = 8;
        int IndeksAwal = 0;  
        int IndeksAkhir = E.length-1;   
        int ketemu = 0;
        int point = 0;
        
        //menampilkan data dalam array
        System.out.println("Isi data adalah ");
        for (int i = 0; i < E.length; i++) {
            
            System.out.print(E[i] +" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
        point = (IndeksAwal + IndeksAkhir) / 2; 
        System.out.println("indeks pointer : "+ point);
           if (cari == E[point] ) { 
               ketemu = 1;
               System.out.println("Data " + 
               cari + " Telah ditemukan pada indeks ke " + point);
           }
           
           else if (cari < E[point] ) { //9<11-T
               System.out.println("Cari di kiri ");
               IndeksAkhir = point-1; 
           }
           
           else {
               IndeksAwal = point+1;
               System.out.println("Cari dikanan ");
           }
        }
        
    if (ketemu == 1)
        System.out.println("kesimpulan: data ditemukan ");
    else
        System.out.println("kesimpulan: data tidak ditemukan ");
    }
    
}

    

