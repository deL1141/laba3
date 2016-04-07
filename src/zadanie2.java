/**
 * Created by deL on 28.03.2016.
 */
public class zadanie2 {
    public static void main(String[] args){
        int n=100;
        int[] array = new int[n];
        array[0]=1;
        System.out.print(array[0]+" ");
        for(int i=1;i<array.length-1;i=i+2){
            array[i]=i+2;
            System.out.print(array[i]+" ");
        }
                System.out.println();
                    System.out.println(array.length-1);
        for(int i=array.length-1;i>=2;i=i-2){
            array[i]=i-2;
            System.out.println(array[i]+" ");
        }

    }
}
