package Task2;

/**
 * Created by vlad on 14.08.17.
 */
public class Task2 {

    public static void task2(){
        int array[] = {1 ,2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7, 8, 9};

        for (int i = 0; i<=array.length;i++){
            for (int k=i+1; k<array.length; k++){
                if (k!=i && array[k] == array[i]){
                    System.out.println(array[k]);
                }
            }
        }
    }
}
