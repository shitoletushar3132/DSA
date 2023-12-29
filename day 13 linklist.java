public class linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void printing(){//TC-O(n)
        
        Node temp = head;
        if(temp == null){
            System.out.print("link list will be ");
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;        
        }
        System.out.println("null");  
    }

    public void addfirst(int data){//TC - O(1)
        //step 1 = create new node
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }

        //step 2 new node next = head
        newnode.next = head; //link

        // step 3 - head = newnode
        head = newnode;
    }

    public void addlast(int data){//TC = O(1)
        //create a new node
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode; 
            return;
        }
        tail.next = newnode;

        tail = newnode;
        
    }

    public void addmiddle(int index,int data){// TC- O(n)
        if(index ==0){
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        int i=0;
        Node  temp=head;
        while (i < index-1) {
            temp=temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode; 
    }

    public int removefirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail=null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public int removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;


    }

    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int search(int key){
        return helper(head, key);
    }

    public void reverse_ll(){//TC - O(n)

        Node prev = null;
        Node curr = tail =  head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void find_remove_last(int n){
        
        //calculate size
        int sz=0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next; //+2
        }
        return slow;
    }
    public boolean LL_palindrome(){
        if(head == null || head.next == null){
            return true;
        }
       

        //step1 = find mid
        Node midnode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midnode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head;
        //step3 - check left half& right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!=null){
            temp.next= head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while(head2!=null){
            temp.next= head1;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergell.next;
    }
    public Node mergesort(Node head){
        //find mid
        if(head == null || head.next==null){
            return head;
        }
        Node mid = getmid(head);

        Node rigthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(rigthead);

        return merge(newleft,newright);

    }
    public static void main(String [] args){
        linkedlist ll2 = new linkedlist();
        // ll.addfirst(1);
        // ll.addfirst(2);
        // ll.addfirst(3);
        // ll.addlast(9);
        // ll.addlast(10);
        // ll.addmiddle(2,122);
        // ll.addmiddle(0,3132);
        
        // ll.printing();

        // ll.find_remove_last(7);
        // ll.printing();


        // ll.reverse_ll();
        // System.out.println(ll.head.data);
        // ll.printing();


        //second linklist
        
        // linkedlist l2 = new linkedlist();
        // l2.addfirst(1);
        // l2.addlast(2);
        // l2.addlast(3);
        // l2.addlast(1);
        // l2.printing();
        // System.out.println(l2.LL_palindrome());

        linkedlist ll = new linkedlist();
        ll.addfirst(12);
        ll.addlast(1);
        ll.addlast(312);
        ll.addfirst(100);
        ll.addlast(3);
        ll.printing();
        ll.head=ll.mergesort(ll.head);
        ll.printing();

    }
}
