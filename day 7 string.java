import java.util.Scanner;

public class string {

    public static boolean palin(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float shortest(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String f_letter(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();
    }

    public static String compression(String str) {
        StringBuilder sb = new StringBuilder("");

        
        for(int i = 0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // String are immutable
        // char arr[] = {'a','b','c'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);

        // String name ;

        // name = sc.nextLine();

        // System.out.println(name.length());

        // concatenation

        // String f_name = "Tushar";
        // String l_name = "Shitole";

        // String fullname = f_name +" "+l_name;
        // System.out.println(fullname);

        // System.out.println(fullname.charAt(0));

        // System.out.println(palin("racear"));

        // System.out.println(shortest("WNEENESENNN"));

        // String str = "HelloWorld";
        // System.out.println(str.substring(0,5));
        // System.out.print(substring(str, 0, 5));

        // String fruits [] = {"apple","mango","banana"};

        // String largest = fruits[0];

        // for(int i = 1; i<fruits.length; i++){
        // if(largest.compareToIgnoreCase(fruits[i])< 0){
        // largest = fruits[i];
        // }
        // }

        // System.out.println(largest);

        // StringBuilder sb = new StringBuilder("");

        // for(char ch = 'a'; ch<='z';ch++){
        // sb.append(ch);
        // }
        // System.out.println(sb.toString());

        // String str = "hi, i am tushar";

        // System.out.println(f_letter(str));

        String str = "aaabbcccdd";

        System.out.println(compression(str));
    }

}
