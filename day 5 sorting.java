import java.util.*;
public class sorting {

    public static void bubble_sort(int arr[]){


        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j = 0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }


    public static void selection_sort(int arr[]) {
        
        for(int turn = 0; turn<arr.length-1; turn++) {
            int minPos = turn;
            for(int j=turn+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]=arr[turn];
            arr[turn]=temp;
        }
    }

    public static void insertion_sort(int arr[]) {
        for(int i = 1 ; i<arr.length; i++) {
            int curr =arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
    }


    public static void count_sort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        max +=1;
        System.out.println(max);
        System.out.println(arr.length);
        int freq [] = new int[max];

       

        for(int i = 0; i < arr.length; i++)
        {
            freq[arr[i]] +=1 ;
        }
        // printarr(freq);

        int m = 0;
        for(int j = 0; j<freq.length; j++) {
            if(freq[j] != 0){
                while(freq[j] > 0){
                    arr[m] = j;
                    m++;
                    freq[j] -= 1;
                }
            }
           
        }
    }

    public static void printarr(int arr[]){
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args)
    {
        int arr [] = {11,11,8,4,1,3,2};
        count_sort(arr);
        printarr(arr);
    }
}
