import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sort{

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {

       for(int j=1;j<n;j++){
           int key=arr[j];
           int i=j-1;
           while((i>-1) && (arr[i]>key)){
               arr[i+1] = arr[i];
               i--;
           }
           arr[i+1] =key;
           printArray(arr);
       }
    }
    static void printArray(int[] Array){
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+" ");
        }
        System.out.println();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
