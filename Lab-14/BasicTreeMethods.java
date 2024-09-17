import java.util.Queue;
import java.util.LinkedList;

public class BasicTreeMethods {

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

    public static void preOrder(Node root){

        if(root == null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        
    }

    public static void inOrder(Node root){

        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    public static void postOrder(Node root){
        
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }

    public static void levelOrder(Node root){

        if(root == null){
            System.out.println("The tree is empty.");
            return;  
        } 

        
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode == null){
                System.out.println(" ");
                if(q.isEmpty()){
                    return;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+"");
                
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);

            }
        }

    }

    public static boolean serchNode(Node root,int val){
        
        if(root == null) return false;

        if(root.data == val) return true;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            Node temp = q.poll();

            if(temp.data == val) return true;

            if(temp.left != null) q.add(temp.left);
            if(temp.right != null)  q.add(temp.right);

        }

        return false;
    }
    
    public static boolean deleteNode(Node root,int val){

        if(BasicTreeMethods.root.data == val){
           BasicTreeMethods.root = null;
           return false;
        }
            
        if(root == null) return false;
        if(root.data == val) return true;

        boolean left  = deleteNode(root.left, val);
        boolean right = deleteNode(root.right, val);

        if(left){
            root.left = null;
            return false;
        }
        else if(right){
            root.right = null;
            return false;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        
        int nodes[] = {50,25,22,15,-1,-1,-1,40,30,-1,-1,-1,75,60,-1,-1,80,-1,90,-1,-1};

        BinaryTree tree = new BinaryTree();
        root = tree.buildTree(nodes);

        System.out.println("The root node is : "+root.data );
        

        System.out.println("preOrder is : ");
        preOrder(root);
        System.out.println(" ");

        System.out.println("inOrder is : ");
        inOrder(root);

        System.out.println(" ");

        System.out.println("postOrder is : ");
        postOrder(root);

        System.out.println(" ");

        System.out.println("levelOrder is :");
        levelOrder(root);

        deleteNode(root,75);
        System.out.println("After deleting 1 : ");
        levelOrder(root);

       boolean isFound = serchNode(root, 15);

       if(isFound) System.out.println("The Node is found.");
       else System.out.println("The Node is not found.");

    }
}

