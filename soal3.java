package modulke5;

import javax.swing.JOptionPane;

public class soal3 {
    public static void main(String[] args) {
        int[] data = new int[5];
        for(int i = 0;i < data.length;i++){
            data[i] = Integer.parseInt(JOptionPane.showInputDialog("masukan nilai indeks ke-"+i));
        }
        int nilaiBesar = data[0],nilaiKecil = data[0],indeksBesar = 0,indeksKecil = 0;
        double jumlahNilai=0;
        for(int i = 0;i < data.length;i++){
            if(data[i] > nilaiBesar){
                nilaiBesar = data[i];
                indeksBesar = i;
            }
            if(data[i] < nilaiKecil){
                nilaiKecil = data[i];
                indeksKecil = i;
            }
            jumlahNilai += data[i];
        }
        JOptionPane.showMessageDialog(null, "Nilai Terbesar = "+nilaiBesar+ " indeks ke-"+indeksBesar+"\nNilai Terkecil = "+nilaiKecil+" indeks ke-"+indeksKecil);
        
        double rata2;
        rata2 = jumlahNilai/data.length;
        JOptionPane.showMessageDialog(null, "Rata-rata = " + rata2);
        
        int jumlahGanjil = 0;
        for(int i = 0;i < data.length;i++){
            if(data[i]%2 != 0){
                jumlahGanjil+=data[i];
            }
        }
        if(jumlahGanjil % 2 == 0){
            JOptionPane.showMessageDialog(null, "Jumlah Semua Bilangan Ganjl = "+jumlahGanjil+"\nBernilai Genap");
        }else if(jumlahGanjil % 2 != 0){
            JOptionPane.showMessageDialog(null, "Jumlah Semua Bilangan Ganjl = "+jumlahGanjil+"\nBernilai Ganjil");
        }
        
        for(int i = 0;i<data.length;i++){
            System.out.println("indeks ke-"+i+" = " + data[i]);
        }
        
        int n = data.length,strg=0;
        
        for(int i = n;i > 0;i--){
            for(int j = n-1;j >= 1;j--){
                if(data[j]<data[j-1]){
                    strg = data[j];
                    data[j] = data[j-1];
                    data[j-1]= strg;
                }
            }
        }
        System.out.print("\nUrutan data = ");
        for(int i = 0;i < n;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
