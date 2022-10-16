package modulke5;

import javax.swing.JOptionPane;

public class pendahuluan4 {
    public static void main(String[] args) {
        int data[] = {4,6,4,2,8,4,2,11};
        int indeks[] = new int[8];
        int input = Integer.parseInt(JOptionPane.showInputDialog("masukkan angka"));
        
        String posisiIndex = "";
        for (int i = 0; i < data.length; i++){
            if(input == data[i]){
                posisiIndex += i + " ";
            }
        }
        JOptionPane.showMessageDialog(null, "posisi indeks  : " + posisiIndex);
    }
}
