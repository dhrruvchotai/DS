public class SymmetricBST {

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

    public static Node root;
    static class BinaryTree{

        static int index = -1;

        public static Node buildTree(int nodes[]){

            index++;

            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        } 
    }

    public static void main(String[] args) {
        int arr[] = {8,5,3,-1,-1,6,-1,-1,5,6,-1,-1,3,-1,-1};

        BinaryTree tree = new BinaryTree();
        root = tree.buildTree(arr);

       boolean ans = isSymmetric(root);
       System.out.println("The tree is symmetric = "+ans);


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

     public static boolean isSymmetric(Node root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(Node one, Node two) {
        if (one == null && two == null) return true;

        if (one == null || two == null) return false;

        return (one.data == two.data) && isMirror(one.left, two.right) && isMirror(one.right, two.left);
    }

}
