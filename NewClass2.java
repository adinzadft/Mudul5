package modulke5;

import javax.swing.JOptionPane;

public class NewClass2 {
    public static void main(String[] args) {
        int data[] = new int[10];
        for(int a=0;a<data.length;a++){
            data[a]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke " + a));
            System.out.println("Index Ke-"+a+" adalah "+data[a]);
        }
    }
}
