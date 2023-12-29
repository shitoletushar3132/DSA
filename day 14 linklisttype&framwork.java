public class linklist2 {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }
    public static node head;
    public static node tail;

    public void add(int data){
        node newnode = new node(data);
        if(head == null){
            head = newnode;
            tail=newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static void printll(){
        node temp = head;
        if(temp == null){
            System.out.print("is ");
        }
        
        while(temp != null){
            System.out.print(temp.data+" -> " );
            temp = temp.next;
            
            
        }
        System.out.print("null");
        // return;
    }

    public static boolean isCycle(){
        node slow  = head;
        node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    
    public static void removecycle(){
        //detect cycle
        node slow = head;
        node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        node prev = null;
        while(slow != fast ){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static node getmid(node head){
        node slow = head;
        node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static node reverse(node head){
        node prev = null;
        node curr = head;
        node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        return prev;
    }
    public static void zig_zag_ll(node head ){
        //find mid
        node mid = getmid(head);

        //reverses 2nd half
        node right = reverse(mid.next);
        mid.next = null;
        node left = head;
        node nextl,nextr;

        while(left != null && right != null){
           nextl = left.next;
           left.next = right;
           nextr = right.next;
           right.next = nextl;

           left = nextl;
           right=nextr;
        }
        // return alter.next;
    }

    public static void main(String [] args){
        // node newnode = new node(3132);
        // head = newnode;
        // // head.next = null;

        // node newnode1 = new node(7172);
        // head.next = newnode1;
        // newnode1.next = null;
        linklist2 l2 = new linklist2();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);

        l2.printll();
        l2.zig_zag_ll(head);
        System.out.println();
        l2.printll();

        // head = new node(1);
        // head.next = new node(2); 
        // // head.next = temp;
        // head.next.next = new node(3);
        // head.next.next.next = new node(320);
        //1->2->3->1
        // System.out.println(isCycle());
        // removecycle();
        // System.out.println(isCycle());

        // printll();


    }
}
/////////////////////////////////////////////////////////////////////////////---------------------------------------------'/////////////////////////////////////



import java.util.*;//Java framework
public class linklistframe {
    
    public static void main(String args[]){
        //create-object sorted in that we use classes 
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);

        //remove
        ll.removeLast();
        // System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);

    }
}



