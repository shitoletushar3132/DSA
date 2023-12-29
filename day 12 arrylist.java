import java.util.*;

public class arraylist {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void container_with(ArrayList<Integer> height) {

        int h1 = 0;
        int h2 = 0;
        int area = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i; j < height.size(); j++) {
                int temp = (j - i) * Math.min(height.get(i), height.get(j));
                if (temp > area) {
                    area = temp;
                    h1 = i;
                    h2 = j;
                }
            }
        }
        System.out.println(area);
    }

    // two pointer approcah
    public static void container_with_op(ArrayList<Integer> height)
    {
        int max =0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            //caluclate area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currwater = ht *width;
            max = Math.max(currwater,max);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        System.out.println(max);
    }

    public static boolean pairsum1(ArrayList<Integer>list, int target ){
        //2 pointer approach
        int lp=0;
        int rp= list.size()-1;
        while(lp != rp){
            //case 1
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }else if(list.get(lp)+list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        // className objectName = new className()

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(3);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        container_with(height);
        container_with_op(height);


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // adding elemnt at end TC = O(1)

        list.add(12);
        list.add(2);
        list.add(3);
        list.add(4);

        // printing a arraylist

        // System.out.println(list);

        // adding element at givent index TC = O(n)

        list.add(2, 9);

        // getting element from given index will be TC = O(1)

        int element = list.get(2);

        // System.out.println(element);

        // remove element /delete TC - O(n)

        list.remove(2);
        // System.out.println(list);

        // set element at given index TC - O(n)

        list.set(2, 54);
        // System.out.println(list);

        // contains element ...check element present or not TC- O(n)

        // System.out.println(list.contains(11));

        // System.out.println(list);
        // System.out.println(list.size());

        // printing array list

        for (int i = 0; i < list.size(); i++) {
            // System.out.print(list.get(i)+" ");
        }
        // System.out.println();

        // reverse of arry list
        for (int i = list.size() - 1; i >= 0; i--) {
            // System.out.print(list.get(i)+" ");
        }

        // maximum in arraylist

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            // if(max < list.get(i)){
            // max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }

        // System.out.println(max);

        list.clear();

        ArrayList<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(9);
        l.add(3);
        l.add(6);

        // System.out.println(l);

        int idx1 = 1, idx2 = 3;
        swap(l, idx1, idx2);

        // System.out.println(l);

        Collections.sort(l);// ascending order sorting

        // System.out.println(l);

        Collections.sort(list, Collections.reverseOrder());// descending
        // comparator - fnx logic
        // System.out.println(l);

        // -------------------2D arraylist------------------------------------
        ArrayList<ArrayList<Integer>> twoD = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        twoD.add(arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        arr2.add(8);
        arr2.add(10);

        twoD.add(arr2);
        // System.out.println(twoD);

        for (int i = 0; i < twoD.size(); i++) {
            ArrayList<Integer> currList = twoD.get(i);
            for (int j = 0; j < currList.size(); j++) {
                // System.out.print(currList.get(j)+" ");
            }
            // System.out.println();
        }
    }
}
