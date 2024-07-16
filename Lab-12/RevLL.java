public class RevLL 
{
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node first = null;

    public void printList()
    {

        if(first == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }

        Node cuurrentNode = first;

        while(cuurrentNode != null)
        {
            System.out.print(cuurrentNode.data + " -> ");
            cuurrentNode = cuurrentNode.next;
        }

        System.out.print("null");
        System.out.println(" ");
    }

    public void insertAtFirst(int data)
    {
        Node newNode = new Node(data);
        if(first == null)
        {
            first = newNode;
            return;
        }

        newNode.next = first;
        first = newNode;
    }

    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);

        if(first == null)
        {
            first = newNode;
            return;
        }

        Node currentNode = first;

        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void reverse(){

        if(first == null)
        {
            System.out.println("List is empty can't be reversed.");
            return;
        }
        if(first.next == null)
        {
            System.out.println("There is only one elemt!");
            return;
        }

        Node prev = null;
        

        Node currNode =  first;

        while(currNode != null)
        {
            Node front = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = front;     
        }
        first = prev;
        
    }

    public static void main(String[] args) {

        RevLL l1 = new RevLL();

        l1.insertAtLast(0);
        l1.insertAtLast(1);
        l1.insertAtLast(2);
        l1.insertAtLast(3);
        l1.insertAtLast(4);
        l1.insertAtLast(5);

        l1.reverse();

        l1.printList();
    }
}
