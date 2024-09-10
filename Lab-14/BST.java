public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }    
    }

    public static void main(String[] args) {

        int arr[] = {50,23,12,9,75,99};

        Node root = null;

        for(int i=0;i<arr.length;i++){
            root = insert(root, arr[i]);
        }

        // inOrder(root);
        // boolean isFound = search(root, 9);

        // System.out.println(" ");
        // if(isFound) System.out.println("The value is in BST.");
        // else System.out.println("The value is not in the BST.");


        System.out.println("Before deleting the elemt");
        inOrder(root);

        System.out.println(" ");

        delete(root,12);
        System.out.println("After deleting the elemt : ");
        inOrder(root);
    }

    public static Node insert(Node root ,int val){
        
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val < root.data){
           root.left =  insert(root.left, val);
        }
        if(val > root.data){
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static boolean search(Node root,int key){    

        if(root == null) return false;
        if(root.data == key) return true;

        if(key < root.data){
            return search(root.left, key);
        }
        if(key > root.data){
            return search(root.right, key);
        }

        return false;
    }

    public static Node delete(Node root,int key){

        if(root == null){
            return null;
        }

        if(key < root.data){
            root.left = delete(root.left, key);
        }
        else if(key > root.data){
            root.right = delete(root.right, key);
        }
        else{

            //case 1 : elemt you want to delete has no child
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 : elmt you want to delete has only one child either element or child.
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3 : elmt you want to delete have both childs left and right
            root.data = findMin(root.right);
            root.right = delete(root.right, key);

        }  
        return root;
    }

    public static int findMin(Node root){
        int min = root.data;

        while(root.left != null){
            min = root.left.data;
            root = root.left;
        }

        return min;
    }

    public static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    public static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }

}
