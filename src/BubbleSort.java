import java.util.*;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000)+1;
        }
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            row++;
            if (row == 10){
                System.out.println();
                row =0;
            }
        }

        for (int i = arr.length; i>=1; i--){
            for (int j =0; j<i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
        }

        row = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            row++;
            if (row == 10){
                System.out.println();
                row =0;
            }
        }


    }
}