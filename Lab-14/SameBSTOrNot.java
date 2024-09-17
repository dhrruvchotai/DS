public class SameBSTOrNot {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }  
    }

    public static Node insertNode(Node root,int val){
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(val < root.data){
            root.left = insertNode(root.left, val);
        }
        else if(val > root.data){
            root.right = insertNode(root.right, val);
        }

        return root;
    }

    public static boolean inOrder(Node root1,Node root2){

        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.data != root2.data) return false;


        boolean lefttree = inOrder(root1.left,root2.left);
        boolean righttree = inOrder(root1.right,root2.right);
        
        System.out.println(" "+root1.data+" "+root2.data+',');
        return lefttree && righttree;

    }

    public static void main(String[] args) {
        int arr1[] = {3,2,1,5};

        Node root1 = null;

        for(int i=0;i<arr1.length;i++){
            root1 = insertNode(root1, arr1[i]); 
        }

        int arr2[] = {3,2,1,5};

        Node root2 = null;

        for(int i=0;i<arr2.length;i++){
            root2 = insertNode(root2, arr2[i]); 
        }

        boolean ans = inOrder(root1, root2);
        System.out.println(ans);
    }
}
