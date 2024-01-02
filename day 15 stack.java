import java.util.*;

public class Stack {
    static class StackA {
        static ArrayList<Integer> list = new ArrayList<>();

        // checking empty or not
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    static class Stackll{
        static node head = null;
        
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            node newnode = new node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;

        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        // StackA s = new StackA();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        Stackll s = new Stackll();
        s.push(3);
        s.push(2);
        s.push(1);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}


"__________________________________________________________________________"


  
import java.util.*;

public class stackframe {
    public static void main(String args[]) {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);

        while (!ss.isEmpty()) {
            System.out.println(ss.peek()); // Corrected from ss.peak() to ss.peek()
            ss.pop();
        }
    }
}
"_________________________________________________________________________"
  //element pushing at bottom in stack

import java.util.*;

public class Push_last {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // reversing a string 'abc' -> "cba"
    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder("");

        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }

    public static void reverse_s(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse_s(s);
        pushAtBottom(s, top);
    }

    public static boolean check(String str) {
        char arr[] = { '(', ')', '{', '}', '[', ']' };
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }

            else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }

            }

        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean duplicate_par(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            while (i < str.length()) {
                ch = str.charAt(i);
                i++;
                if (ch == ')') {
                    int count = 0;
                    while (s.peek() != '(') {
                        s.pop();
                        count++;
                    }
                    if (count < 1) {
                        return true;
                    } else {
                        s.pop();
                    }
                } else {
                    s.push(ch);

                }
            }
        }
        return false;
    }

    public static void nxt_greatest(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int nxt[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxt[i] = -1;
            } else {
                nxt[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nxt.length; i++) {
            System.out.print(nxt[i] + " ");
        }

    }

    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // nxt smaller right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left

        s = new Stack<>();

        for (int i = 0; i < arr.length - 1; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);

        }
        // current area : width = j-i-1 = nsr[i]-nsl[i]-1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = height * width;

            maxArea = Math.max(currarea, maxArea);
        }

        System.out.println("max area in histogram = " + maxArea);
    }

    public static void prints(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        // ---------------
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s,4);

        // while(!s.isEmpty()){
        // System.out.println(s.peek());
        // s.pop();
        // }
        // ----------------

        // String str = "Tushar";
        // str=reverseString(str);
        // System.out.print(str);

        // --------------

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // // prints(s);
        // System.out.println("____________________________________");
        // reverse_s(s);
        // prints(s);

        // _--------------------------------------

        // problem next greater element in array
        // arr = [6,8,0,1,3]
        // nextGreater = [8,-1,1,3,1]
        // int arr[] = { 6, 8, 0, 1, 3 };
    }
}
