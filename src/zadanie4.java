/**
 * Created by deL on 29.03.2016.
 */
public class zadanie4 {
    public static void main(String[] args){
        int n=5,k=8;
        int [] [] array = new int[n][k];
        for(int i=0;i<k;i++){
            System.out.print((int)(Math.random()*90+10) + " ");
            for(int j=1;j<n;j++){
                System.out.print((int)(Math.random()*90+10)+ " ");
            }
            System.out.print("\n");
        }
    }
}
