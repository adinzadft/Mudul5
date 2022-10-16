package modulke5;

public class pendahuluan5 {
    public static void main(String[] args) {
        int data[] = {4,6,4,2,8,4,2,11};
        
        //WHILE
        int i = 0;
        while(i<8){
            System.out.print(data[i]+" ");
            i++;
        }
        System.out.println();
        
        //DO WHILE
        int j = 0;
        do{
            System.out.print(data[j]+" ");
            j++;
        }while(j<8);
        System.out.println();
        
        //FOR
        for(int k=0;k<8;k++){
            System.out.print(data[k]+" ");                   
        }
        System.out.println();
        
    }
}
