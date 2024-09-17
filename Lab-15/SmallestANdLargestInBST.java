public class SmallestANdLargestInBST {

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
        }

        int min = findMinVal(root);
        int max = findMaxVal(root);

        System.out.println("Min is : "+min+" Max is : "+max);
    }

    public static int findMinVal(Node root){
        int min = root.data;

        Node temp = root.left;

        while(temp != null){
            min = temp.data;
            temp = temp.left;
        }

        return min;
    }

    public static int findMaxVal(Node root){
        int max = root.data;

        Node temp = root.right;

        while(temp != null){
            max = temp.data;
            temp = temp.right;
        }

        return max;
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
}
