import java.util.*;

public class SelectionSort {
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

        int max;
        for (int i = arr.length-1; i>0; i--){
            max = i;
            for (int j = i-1; j >=0; j--){
                if (arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
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
