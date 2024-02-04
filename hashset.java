import java.util.*;
public class hashset {
    
    public static void main(String [] args){
        HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(4);
        // set.add(1);
        // System.out.println(set);
        // set.clear();
        // System.out.println(set.size());
        // if(set.contains(12)){
        //     System.out.println("yes");
        // }

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("mumbai");
        cities.add("chennai");
        cities.add("pune");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("mumbai");
        lhs.add("chennai");
        lhs.add("pune");
        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        System.out.println(lhs);

        for (String city : cities) {
            System.out.println(city);
        }
    }

}
