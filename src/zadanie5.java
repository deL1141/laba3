/**
 * Created by deL on 29.03.2016.
 */
public class zadanie5 {
    public static void main(String[] args) {
        int n=7, m=4,k=1, max = 1, g=1;
            int array[][] = new int [n][m];
            int arrayS [] = new int [n];
        // Заполняем массив и выводим массив
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = (int)(Math.random()*11-5);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nПроизведение элементов :");
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                k = k * array[i][j];
                k = Math.abs(k);
            }
            System.out.println(i + ") " + k);
            if(k > max){
                max = k;
                g = i;
            }
            k=1;
        }
        System.out.print("\nИндекс строки с наибольшим значением : " + g);
    }
}
