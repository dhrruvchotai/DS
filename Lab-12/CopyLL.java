class CopyList{
    
    class Node{
        int data;
        Node next;

        Node(int data){

            this.data = data;
            this.next = null;

        }
    }

    Node first = null;

    
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            return;
        }

        newNode.next = first;
        first = newNode;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);

        if(first == null){
            first = newNode;
            return;
        }

        Node currentNode = first;

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
            currentNode.next = newNode;
    }

    public void printList(){

        if(this.first == null){
            System.out.println("LinkedList is Empty");
            return;
        }

        Node cuurrentNode = this.first;

        while(cuurrentNode != null){
            System.out.print(cuurrentNode.data + " -> ");
            cuurrentNode = cuurrentNode.next;
        }

        System.out.print("null");
        System.out.println(" ");

    }
    
    public void copy(CopyList l1){

        Node currNode1 = l1.first;
        Node currNode2 = null;


        while(currNode1 != null){
            
            Node newNode = new Node(currNode1.data);

            if(currNode2 == null){
                this.first = newNode;
                currNode2 = newNode;
                
            }
            
            else{
                currNode2.next = newNode;
                currNode2 = currNode2.next;
            }
            
            currNode1 = currNode1.next;
         
        }

    }

}

public class CopyLL{
    public static void main(String[] args){
        CopyList l1 = new CopyList();
        CopyList l2 = new CopyList();

        l1.insertAtLast(0);
        l1.insertAtLast(1);
        l1.insertAtLast(2);
        l1.insertAtLast(3);
        l1.insertAtLast(4);

        l2.copy(l1);

        l2.printList();
        


    }
}