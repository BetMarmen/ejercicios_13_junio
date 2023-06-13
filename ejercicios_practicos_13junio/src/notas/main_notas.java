package notas;

import java.util.Arrays;
import java.util.Scanner;

public class main_notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int not;

        int[] arr = new int[5];

        
        for (int i = 0; i < arr.length; i++) {
        do {
         System.out.println("Ingrese la nota "+(i+1)+" : ");
         not=scan.nextInt();
         }while(not>10 || not<0);
         
            arr[i] = not;
        }
        System.out.println("Notas");
        System.out.println(Arrays.toString(arr));
        System.out.println("");
        sort(arr);
        System.out.println("Notas de mayor a menor:");
     
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quicksort(arr, 0, arr.length - 1);
    }
    private static void quicksort(int[] arr, int low, int high) {
     
        int i = low, j = high;
        int pivot = arr[low];


        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quicksort(arr, low, j);
        }
        if (i < high) {
            quicksort(arr, i, high);
        }
	}

}
