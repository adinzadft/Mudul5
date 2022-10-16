package modulke5;

import javax.swing.JOptionPane;

public class soal2 {
    public static void main(String[] args) {
        //input nilai data pada array
        int data[] = new int[10];
        for(int a=0;a<data.length;a++){
            data[a]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke " + a));
            System.out.println("Index Ke-"+a+" adalah "+data[a]);
        }

        //deklarasi
        int nilaiBesar=0, nilaiKecil = data[0],indeksBesar = 0,indeksKecil =0;
        double jumlahData = 0;
        double rata2;
        for(int i=0;i<data.length;i++){
            //nilai terbesar
            if(data[i] > nilaiBesar){
                nilaiBesar = data[i];
                indeksBesar = i;
            }
            //nilai terkecil
            if(data[i] < nilaiKecil){
                nilaiKecil = data[i];
                indeksKecil = i;
            }         
            //hitung jumlah data
            jumlahData += data[i];
        } 
        
        JOptionPane.showMessageDialog(null, "Nilai maksimal = " + nilaiBesar + " indeks ke-" + indeksBesar + "\nNilai minimal = " + nilaiKecil + " indeks ke-" + indeksKecil);

        //rata rata
        rata2 = jumlahData / data.length;
        JOptionPane.showMessageDialog(null, "Rata -rata = " + rata2);

        //cari nilai
        int scanAngka, gantiNilai = 0;
        scanAngka = Integer.parseInt(JOptionPane.showInputDialog("masukkan angka yang akan dicari"));

        for(int i = 0; i < data.length;i++){
            if(scanAngka == data[i]){
                JOptionPane.showMessageDialog(null,scanAngka+" adalah posisi index ke-" + i );
                gantiNilai = i;
                //ganti nilai
                data[gantiNilai]=Integer.parseInt(JOptionPane.showInputDialog("Ganti nilai indeks ke-"+gantiNilai));
                JOptionPane.showMessageDialog(null, "indeks ke-"+gantiNilai+" = "+data[gantiNilai]);
            }
        }

        //output nilai array baru
        System.out.println("\ndata array baru :");
        for(int a=0;a<data.length;a++){
            System.out.println("Index Ke-"+a+" adalah "+data[a]);
        }
        
    }
}
