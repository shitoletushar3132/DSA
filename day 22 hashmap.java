import java.util.*;
public class hashmap {
    public static boolean isAnangram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }

    public static int count_distinct(int nums[]){
        HashSet<Integer>it = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            it.add(nums[i]);
        }
        return it.size();
    }
    public static void main(String[] args){
        // HashMap<String, Integer> hm = new HashMap<>();

        // //insert -O(1)
        // hm.put("India", 100);
        // hm.put("China", 150);
        // hm.put("Us",50);

        // System.out.println(hm);

        // //get - O(1)
        // int population = hm.get("India");
        // System.out.println(population); 

        // //containskey -O(1)

        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("sss"));

        // //remove

        // System.out.println(hm.remove("China"));
        // System.out.println(hm);


        // System.out.println(hm.size());

        // System.out.println(hm.isEmpty());

        // hm.clear();

        // System.out.println(hm);



        int nums [] = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(count_distinct(nums));
    }

}
