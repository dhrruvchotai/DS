public class DLL {

    class Node
    {
        int data;
        Node back;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.back = null;
            this.next = null;
        }
    }

    Node first = null;
    Node last = null;
    int length = 0;

    public void insertAtFirst(int data)
    {
        Node newNode = new Node(data);
        length++;

        if(first == null)
        {
            first = newNode;
            last = newNode;
            return;
        }

        newNode.next = first;
        first.back = newNode;
        first = newNode;

    }

    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);
        length++;

        if(first == null)
        {
            first = newNode;
            last = newNode;
            return;
        }

        last.next = newNode;
        newNode.back = last;
        last = newNode;

    }

    public void deleteFirst()
    {

        length--;

        if(first == null)
        {
            System.out.println("List is already Empty.");
            return;
        }

        first = first.next;
        first.back.next = null;
        first.back = null;
        
    }

    public void deleteLast()
    {

        length--;

        if(first == null)
        {
            System.out.println("List is already Empty.");
            return;
        }

        last = last.back;
        last.next.back = null;
        last.next = null;

    }

    public void insOrd(int data,int indx)
    {

        Node newNode = new Node(data);

        if(indx == 1)
        {
            insertAtFirst(data);
            return;
        }

        else if(indx == length)
        {
            insertAtLast(data);
            return;
        }

        else if(indx < length && indx > 1)
        {

            Node currNode = first;
            int currPos = 1;

            while(currNode != null && currPos < indx){
                
                currNode = currNode.next;
                currPos++;

            }

            if(currNode == null){
                insertAtLast(data);
            }

            newNode.next = currNode.next;
            newNode.back = currNode;
            currNode.next.back = newNode;
            currNode.next = newNode;
        }
        else
        {
            System.out.println("Enter index less than the "+length);
        }


    }

    public void printList()
    {
        Node currNode = first;

        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");

    }
    
    public static void main(String[] args) {
        DLL l1 = new DLL();

        l1.insertAtLast(1);
        l1.insertAtLast(2);
        l1.insertAtLast(4);
        l1.insertAtLast(5); 

        l1.insOrd(3, 2);

        l1.printList();

    }


}
