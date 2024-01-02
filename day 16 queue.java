public class queue{
    public static class QueueA{
        static int arr[];
        static int size;
        static int rear;

        QueueA(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear = rear +1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0]; 
        }
    }

    static class QueueCA {
        static int arr[];
        static int rear;
        static int size;
        static int front;
        
        QueueCA(int n ){
            arr = new int[n];
            size = n; 
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            
            int result = arr[front];
            
            //last deletion
            if(rear == front){
                rear = front =-1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }
        static int peek(){
            return arr[front];
        }
    }

    static class QueueLL{
        static class node{
            int data;
            node next;
            node(int data){
                this.data =data;
                this.next = null;
            }
        }

        static node tail= null;
        static node head= null;
        

        static boolean isEmpty(){
            return head==null;
        }
        static void add(int data){
            node newnode = new node(data);
            
            if(head == null){
                head = newnode;
                tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
            
        }
        static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int result = head.data;
            if(tail == head){
                tail=head=null;
            }
            else{
                head= head.next;
            }
            return result;
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
            }
            return head.data;
        }
    }
    public static void main(String [] args){
        // QueueCA q = new QueueCA(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);
 
        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }
        QueueLL qll = new QueueLL();
        qll.add(1);
        qll.add(2);
        qll.add(3);

        while(!qll.isEmpty()){
            System.out.println(qll.peek());
            qll.remove();
        }
    }
}


"________________________________________________________________________"
  import java.util.*;
public class queue_frame {
    public static void main(String [] args){
        Queue<Integer> qf = new LinkedList<>(); 
        // Queue<Integer> q = new ArrayDeque<>();//ArrayDeque 
        qf.add(1);
        qf.add(2);
        qf.add(3);

        while(!qf.isEmpty()){
            System.out.println(qf.peek());
            qf.remove();
        }

    }
}

"_________________________________________________________________________"

  import java.util.*;

public class queue_problem {
    static class Queue_using_stack {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        boolean isEmpty() {
            return s1.isEmpty();
        }

        void add(int data) {
            if (s1.isEmpty()) {
                s1.push(data);
                return;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

        int remove() {
            if (s1.isEmpty()) {
                System.out.print("Empty Queue");
                return -1;
            }
            int result = s1.peek();
            s1.pop();
            return result;
        }

        int peek() {
            if (s1.isEmpty()) {
                System.out.print("Empty Queue");
                return -1;
            }
            return s1.peek();
        }

    }

    static class Stack_using_queue {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        boolean isEmpty() {
            return q1.isEmpty();
        }

        void push(int data) {
            if (q1.isEmpty()) {
                q1.add(data);
                return;
            }

            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            q1.add(data);

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }

        }

        int pop() {
            if (q1.isEmpty()) {
                System.out.print("Empty Stack");
                return -1;
            }
            int result = q1.peek();
            q1.remove();
            return result;
        }

        int peek() {
            if (q1.isEmpty()) {
                System.out.print("Empty Stack");
                return -1;
            }
            return q1.peek();  
        }

    }

    public static void first_non_repeating(String str) {
        int freq[] = new int[25];// 'a'-'z'
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
            System.out.println();
        }

    }

    public static void interleave_two_halves(Queue<Integer> q){
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
        
        int mid = q.size()/2;
        
        int curr = 1;
       for(int i=0; i<mid; i++){
           first.add(q.remove());
       }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }
    public static void reverse_queue_using_stack(Queue<Integer> q){
        Stack<Integer> ss = new Stack<>();
        while(!q.isEmpty()){
            ss.push(q.remove());
        }
        
        while(!ss.isEmpty()){
            q.add((ss.pop()));
        }
    
    }
    public static void deque_framework(){
        Deque<Integer> deque = new LinkedList<>();
        
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        System.out.println("first element: " +deque.getFirst());
    }
    static class Stack_using_deque{
        Deque<Integer> dq = new LinkedList<>();
        
        void push(int data){
            dq.addLast(data);
        }
        
        int pop(){
            if(dq.isEmpty()){
                System.out.println("empty Stack");
            }
            int data = dq.getLast();
            dq.removeLast();
            return data;
        }
        
        boolean isEmpty(){
            return dq.isEmpty();
        }
        
        int peek(){
            if(dq.isEmpty()){
                System.out.println("empty Stack");
            }
            return dq.getLast();
        }
    }
    
    static class Queue_using_deque{
        Deque<Integer>dq = new LinkedList<>();
        
        boolean isEmpty(){
            return dq.isEmpty();
        }
        
        int peek(){
            if(dq.isEmpty()){
                System.out.println("empty queue");
            }
            return dq.getFirst();
        }
        
        void add(int data){
            dq.addLast(data);
        }
        
        int remove(){
            if(dq.isEmpty()){
                System.out.println("empty queue");
            }
            int data = peek();
            dq.removeFirst();
            return data;
        }
        
    }
    public static void main(String[] args) {
        Queue_using_stack q = new Queue_using_stack();
        q.add(1);
        q.add(2);
        q.add(3);

        // System.out.println(q.peek());
        // q.remove();
        // System.out.println(q.peek());

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}
