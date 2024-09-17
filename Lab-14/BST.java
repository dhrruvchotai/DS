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

        int arr[] = {50,23,5,2,1};

        Node root = null;

        for(int i=0;i<arr.length;i++){
            root = insert(root, arr[i]);
            if(checkCritical(root) && checkCase1(root, arr[i])){
                root = rightRotation(root);
            }
        }
        // System.out.println(root.data);
        preOrder(root);
        System.out.println(" ");
        inOrder(root);
        // boolean isFound = search(root, 9);

        // System.out.println(" ");
        // if(isFound) System.out.println("The value is in BST.");
        // else System.out.println("The value is not in the BST.");


        // System.out.println("Before deleting the elemt");
        // inOrder(root);

        // System.out.println(" ");

        // delete(root,12);
        // System.out.println("After deleting the elemt : ");
        // inOrder(root);

        // int maxh = findMaxHeight(root);
        // System.out.println("Max height is : "+maxh);

        
        // int weightarr[] = new int[2];
        
        // weightarr = weight(root);
        
        // for(int i=0;i<weightarr.length;i++){
        //     System.out.print(weightarr[i]);
        // } 

        // printAllWeight(root);
        
    }

    public static void printAllWeight(Node root){

        if(root == null) return;
        
        int weightarr[] = new int[2];

        weightarr = weight(root);
        
        System.out.print("Weight array of "+root.data+" is : ");

        for(int i=0;i<weightarr.length;i++){
            System.out.print(weightarr[i]+" ");
        } 
        System.out.println(" ");

        printAllWeight(root.left);
        printAllWeight(root.right);
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

    public static void newParentder(Node root){
        if(root == null) return;

        System.out.print(root.data+" ");
        inOrder(root.left);
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

    public static int findMaxHeight(Node root){
        if(root == null) return 0;

        int leftHeight = findMaxHeight(root.left);
        int rightHeight = findMaxHeight(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }

    public static int[] weight(Node root){

        int ans[] = new int[3];

        if(root == null) return ans;

        ans[0] = findMaxHeight(root.left);
        ans[1] = findMaxHeight(root.right);
        ans[2] = Math.abs(ans[0] - ans[1]);
       
        weight(root.left);
        weight(root.right);

       return ans;
    }

    public static boolean checkCritical(Node root){

        if(root == null) return false;

        int weightarr[] = new int[3];

        weightarr = weight(root);

        if(weightarr[2] >= 2){
            return true;
        }
        else{
            checkCritical(root.left);
            checkCritical(root.right);
        }
        return false;
    }

    public static boolean checkCase1(Node root,int key){

        if(root == null || root.left == null) return false;

        Node temp = root.left;
        temp = temp.left;

        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.left;
        }
        return false;
    }

    public static Node rightRotation(Node root){

        Node lcRightSubTree = root.left.right;
        root.left.right = null;

        Node newParent = root.left;
        newParent.right = root;

        newParent.right.left = lcRightSubTree;

        return newParent;
    }
}
