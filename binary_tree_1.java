import java.util.*;

public class binary_tree_1 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binary_tree {
        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length ||nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = BuildTree(nodes);
            newnode.right = BuildTree(nodes);
            return newnode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                // System.out.print(-1 +" ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
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

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return (Math.max(lh, rh) + 1);
        }

        public static int count_node(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return (lh + rh + 1);
        }

        public static int sum_of_node(Node root) {
            if (root == null) {
                return 0;
            }

            int leftsum = sum_of_node(root.left);
            int rightsum = sum_of_node(root.right);
            return (leftsum + rightsum + root.data);
        }

        public static boolean isIdentical(Node node, Node subroot) {
            if (node == null && subroot == null) {
                return true;
            } else if (node == null || subroot == null || node.data != subroot.data) {
                return false;
            }
            if (!isIdentical(node.left, subroot.left)) {
                return false;
            }
            if (!isIdentical(node.right, subroot.right)) {
                return false;
            }
            return true;
        }

        public static boolean issubtree(Node root, Node subroot){
            if(root == null){
                return false;
            }
            if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            return issubtree(root.left, subroot) || issubtree(root.right, subroot);

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        binary_tree tree = new binary_tree();
        Node root = tree.BuildTree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        tree.level_order(root);
        // System.out.println(tree.height(root));
        // System.out.println(tree.count_node(root));
        System.out.println(tree.sum_of_node(root));

        int subnodes[] = { 2, 4, -1, -1, 5,-1,-1 };
        //binary_tree subtree = new binary_tree();
        //Node subroot = subtree.BuildTree(subnodes);

        // System.out.println(tree.issubtree(root,subroot));

    }
}
