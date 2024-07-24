public class CircularLL {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node first = null;
    Node last = null;

    public void insertAtFirst(int x){
        Node newNode = new Node(x);

        if(first == null){
            newNode.next = newNode;
            first = newNode;
            last = newNode;
            return;
        }
        newNode.next = first;
        first = newNode;
        last.next = first;
    }

    public void insertAtLast(int x){

        Node newNode = new Node(x);

        if(first == null){
            newNode.next = newNode;
            last = newNode;
            first = newNode;
            return;
        }

            last.next = newNode;
            last = newNode;
            last.next = first;

    }

    public void deleteFirst(){
         
        if(first == last){
            first = null;
            last = null;
            return;
        }

        last.next = first.next;
        first = first.next;
    }

    public void deleteLast(){

        if(first == last){
            first = null;
            last = null;
            return;
        }

        Node currNode = first;

        while(currNode.next != last){
            currNode = currNode.next;
        }

        last = currNode;
        last.next = first; 
    }

    public void deleteFromElmt(int x){

        Node currNode = first;

        if(x == first.data){
            first = first.next;
            last.next = first;
            return;
        }


        while (currNode.next.data != x) {
            currNode = currNode.next;
        }

        currNode.next = currNode.next.next;
    }

    public void insertInOrder(int x){

        Node newNode = new Node(x);

        if(x < first.data){
            insertAtFirst(x);
            return;
        }
        else if(x > last.data){
            insertAtLast(x);
            return;
        }


        Node currNode = first;
        
        while(currNode.next.data <= x){
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        

    }

    public void printList(){

        if(first == null || last == null){
            System.out.println(" ");
            System.out.println("List Is Empty!!");
            System.out.println(" ");
            return;
        }

        Node currNode = first;

        do{
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        while(currNode != first);

    }

    public static void main(String[] args) {
        CircularLL clist = new CircularLL();

        clist.insertAtFirst(1);
        clist.insertAtFirst(0);
        clist.insertAtLast(3); 
        clist.insertInOrder(2);
        clist.printList();

    }
}
