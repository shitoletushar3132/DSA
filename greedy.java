import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class greedy {
    public static void maximum_activity(int start[], int end[]) {
        int maxAcr = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAcr = 1;
        ans.add(0);
        int lastend = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastend) {
                maxAcr++;
                ans.add(i);
                lastend = end[i];
            }
        }
        System.out.println("max Activities = " + maxAcr);
    }

    public static void fractional_knapsack(int val[], int weight[], int w) {
        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalval = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalval += val[idx];
                capacity -= weight[idx];
            } else {
                finalval += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }

        }
        System.out.print(finalval);
    }

    public static void minimum_sum_absolute(int a[], int b[]) {

        Arrays.sort(a);
        Arrays.sort(b);
        int min_sum = 0;
        for (int i = 0; i < a.length; i++) {
            min_sum += Math.abs(a[i] - b[i]);
        }
        System.out.println(min_sum);
    }

    public static void indian_coins(Integer money[], int val) {

        Arrays.sort(money,Comparator.reverseOrder());
        int count = 0;
        int amount = val;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<money.length; i++){
             if(money[i]<=amount){
                while(money[i]<=amount){
                    count++;
                    ans.add(money[i]);
                    amount -= money[i];
                }
             }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        // int start[] = { 1, 3, 0, 5, 8, 5 };
        // int end[] = { 2, 4, 6, 7, 9, 9 };

        // end time basis sorted
        // int weight []={10,20,30};
        // int val [] = {60,100,120};
        // int w = 50;

        // fractional_knapsack(val, weight, w);

        // int a[] = { 1, 2, 3 };
        // int b[] = { 2, 1, 3 };
        // minimum_sum_absolute(a, b);

        // Integer money[] = {1,2,5,10,20,50,100,500,2000};
        // indian_coins(money, 12);

        int n =4,m=6;
        Integer costver [] = {2,1,3,1,4};
        Integer costhor[] = {4,1,2};

        Arrays.sort(costver,Collections.reverseOrder());
        Arrays.sort(costhor,Collections.reverseOrder());

        int h=0,v=0,hp=1,vp=1,cost=0;

        while(h<costhor.length && v<costver.length){
            if(costver[v] <= costhor[h]){
                cost += (costhor[h]*vp);
                hp++;
                h++;
            }else{
                cost += costver[v]*hp;
                vp++;
                v++;
            }
        }
        while(h<costhor.length){
            cost += (costhor[h]*vp);
            hp++;
            h++;
        }
        while(v<costver.length){
            cost+=costver[v]*hp;
            vp++;
            h++;
        }

        System.out.println(cost);
    }
}
