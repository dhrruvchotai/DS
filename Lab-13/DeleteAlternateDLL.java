    public class DeleteAlternateDLL {
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

    public void printList()
    {
        Node currNode = first;

        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");

    }

    public void DeleteAlter(){
        Node currNode = first;

        while(currNode != null && currNode.next != null){
            currNode.next = currNode.next.next;
        }
    }

    public static void main(String[] args) {
        DeleteAlternateDLL l1 = new DeleteAlternateDLL();

        l1.insertAtFirst(1);
        l1.insertAtLast(2);
        l1.insertAtLast(3);
        l1.insertAtLast(4);
        l1.insertAtLast(5);
        l1.insertAtLast(6);
        l1.insertAtLast(7);

    }
}
