
import java.util.*;

public class array {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static int linear(int number[], int search) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == search) {
                return i;
            }
        }
        return -1;
    }

    public static int larges_arr(int number[]) {
        int large = Integer.MIN_VALUE; // -infinity & Interger.MAX_VALUE = +infinity

        for (int i = 0; i < number.length; i++) {
            if (number[i] > large) {
                large = number[i];
            }
        }
        return large;
    }

    public static int binary(int number[], int search) {
        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (search == number[mid]) {
                return mid;
            }

            if (number[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void reverse(int array[]) {
        int first = 0, temp = 0;
        int last = array.length - 1;

        for (int i = first; i < last; i++) {
            temp = array[first];
            array[first] = array[last];
            array[last] = temp;

            first += 1;
            last -= 1;
        }

    }

    public static void pair(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subarray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + "  ");
                }
                System.out.println();
            }
            System.out.println(); 

        }
    }

    public static void main(String args[]) {
        // int a [] = new int[10];
        int number[] = { 2, 4, 6, 8, 10 };
        // String fruit [] = {"orange" , "mango", "Grapes"};

        // update(number);

        // for(int i= 0 ; i<number.length; i++)
        // {
        // System.out.print(number[i] + " ");
        // }

        // int re = linear(number,3);

        // int re = binary(number,1);
        // if(re==-1){
        // System.out.print("not found");
        // }
        // else
        // {

        // int re = larges_arr(number);
        // System.out.print("the largest number are : " + re);

        // reverse(number);
        // for(int i = 0; i<number.length;i++)
        // {
        // System.out.print(number[i]+ " ");
        // }

        // pair(number);

        subarray(number);
    }
}
