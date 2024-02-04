import java.util.ArrayList;

public class bst {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }

    public static node insert(node root,int val){
        if(root == null){
            root = new node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left = insert(root.left,val);
        } else{
            //right subtree 
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(node root, int data){
        if(root == null){
            return false;
        }
        if(data == root.data){
            return true;
        }
        if(root.data > data){
            return search(root.left, data);
            
        }else{
            return search(root.right, data);
        }
    }

    public static node delete1(node root, int val){
        if(root.data < val){
            root.right = delete1(root.right, val);
        }
        else if(root.data>val){
            root.left = delete1(root.left,val);
        }
        else{
            //case 1 - leaf node 
            if(root.left == null && root.left == null){
                return null;
            }
            //case 2 -single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.right;
            }
            //case 3 both children
            node is = findInorderSuccessor(root.right);
            root.data = is.data;
            delete1(root.right,is.data);
        }
        return root;
    }
    public static node findInorderSuccessor(node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(node root, int k1, int k2){

        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }

   

    public static void printpath(ArrayList<Integer>path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("NULL");
    }
    public static void rootToLeaf(node root,ArrayList<Integer>path){
        
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.removeLast();
    }

    public static node createBst(int arr[], int st, int ed){
        if(st > ed){
            return null;
        }
    
        int mid = (st+ed)/2;
        node root = new node(arr[mid]);
        root.left = createBst(arr, st, mid-1);
        root.right = createBst(arr, mid+1, ed);
        return root;

    }

    public static void preorder(node root){

        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(node root, ArrayList<Integer>inorder){
        if(root == null){
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);

    }
    public static node createBst(ArrayList<Integer>inorder, int st, int ed){
        if(st>ed){
            return null;
        }
        int mid = (st+ed)/2;
        node root = new node(inorder.get(mid));
        root.left = createBst(inorder, st, mid-1);
        root.right = createBst(inorder, mid+1, ed);
        return root;
    }
    public static node balanceBst(node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        root = createBst(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String a[]){
        // node root = new node(5);

        // int val [] = {8,5,3,1,4,6,10,11,14};
        // node root = null;
        
        // for(int i =0; i<val.length;i++){
        //     root = insert (root, val[i]);
        // }

        // inorder(root);
        // System.out.println();
        // System.out.println(search(root, 132));
        // delete1(root, 11);
        // inorder(root);
        // System.out.println();
        // printInRange(root, 5, 10);

        // rootToLeaf(root, new ArrayList<>());


        int arr [] = {3,5,6,8,10,11,12};
        node root = createBst(arr, 0, arr.length-1);
        preorder(root);
    }
}
