public class TreeMethods {
    
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

    public static int countNodes(Node root){

        if(root == null) return 0;
        
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;

    }

    public static int sumValues(Node root){

        if(root == null) return 0;
        
        int leftValues = sumValues(root.left);
        int rightValues = sumValues(root.right);

        return leftValues + rightValues + root.data;

    }

    public static int findMaxHeight(Node root){
        
        if(root == null) return 0;

        int leftHeight = findMaxHeight(root.left);
        int rightHeight = findMaxHeight(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }

    public static int findMinHeight(Node root){

        if(root == null) return 0;
        int leftHeight = findMinHeight(root.left);
        int rightHeight = findMinHeight(root.right);

        if(leftHeight == 0) return rightHeight + 1;
        else if(rightHeight == 0) return leftHeight + 1;
        
        return Math.min(leftHeight, rightHeight) + 1;

    }

    public static int diameter(Node root){

        if(root == null) return 0;
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = findMaxHeight(root.left) + findMaxHeight(root.right) + 1;


        return Math.max(diam3,Math.max(diam1, diam2));
    }


    // CURRENTLY PENDING.


    // private static int diam = 0;

    // public static void optDiameter(Node root){
        
    //     // if(root == null) return 0;

    //     // int leftHeight = findMaxHeight(root.left);
    //     // int rightHeight = findMaxHeight(root.right);

    //     // diam = Math.max(diam,leftHeight+rightHeight);
    //     // return Math.max(rightHeight,rightHeight) + 1;

    //     diam = 0;
    //     diameter(root);
    //     System.out.println("The diam is :"+diam);
    // }



    // MAKE A FUNCTION TO CHECK THE SUBTREE IS PART OF MAIN TREE OR NOT(PENDING.)


    
    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);


        System.out.println("The total Nodes are : "+countNodes(root));

        System.out.println("The sum of nodes are : "+sumValues(root));

        System.out.println("The max-height of the tree is : "+findMaxHeight(root));

        System.out.println("The min-height of the tree is : "+findMinHeight(root));

        System.out.println("The diamter is : "+diameter(root));

        // System.out.println("Optimized diameter methods ans : "+optDiameter(root));

        // optDiameter(root);

    }
}
