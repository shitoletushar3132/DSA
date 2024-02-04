import java.util.*;
public class binary_tree_2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left = null;
            this.right= null;
        }
    }
    static class binary_tree{
        static int idx = -1;

        public static Node buildtree(int nodes[]){
            idx++;
            if(idx >= nodes.length ||nodes[idx]==-1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);

            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }
        public static void preorder(Node root){

            if(root==null){
                return;
            }
            System.out.print(root.data+"  ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void level_order(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q1 = new LinkedList<>();
            q1.add(root);
            q1.add(null);

            while (!q1.isEmpty()) {
                Node curr = q1.remove();
                if (curr == null) {
                    System.out.println();
                    if (q1.isEmpty()) {
                        break;
                    } else {
                        q1.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q1.add(curr.left);
                    }
                    if (curr.right != null) {
                        q1.add(curr.right);
                    }
                }
            }
        }
    }

    public static void klevel(Node root, int level, int k){
        if(root==null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }

        klevel(root.left, level+1, k);
        klevel(root.right, level+1, k);
    }
    public static void main(String [] args){
           
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            // t2.preorder(root);
            binary_tree t2 = new binary_tree();
            klevel(root,1, 3);   

    }
}
