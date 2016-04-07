/**
 * Created by deL on 28.03.2016.
 */
public class zadanie3 {
    public static void main(String[] args){
        int n=15,count=0;
        int [] array = new int[n];
        for(int i=0;i<=n-1;i++){
            array[i] = (int)(Math.random()*10);
            System.out.print(array[i]+" ");
            if(array[i] % 2 == 0 &   array[i]!=0){
                count++;
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
