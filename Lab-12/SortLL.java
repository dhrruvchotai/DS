public class SortLL{
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

        if(first == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node cuurrentNode = first;
        while(cuurrentNode != null){
            System.out.print(cuurrentNode.data + " -> ");
            cuurrentNode = cuurrentNode.next;
        }
        System.out.print("null");
        System.out.println(" ");
    }

    public Node sortList(Node first) {
        if(first == null || first.next == null) return first;

        Node slow = first;
        Node fast = first.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node right = slow.next;
        slow.next = null;

        Node l1 = sortList(first);
        Node l2 = sortList(right);

        return merge(l1, l2);
    }

    public Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) temp.next = l1;
        else temp.next = l2;

        return dummy.next;
    }


    public static void main(String[] args) {
        
        SortLL l1 = new SortLL();

        l1.insertAtFirst(2);
        l1.insertAtFirst(3);
        l1.insertAtFirst(4);
        l1.insertAtFirst(9);
        l1.insertAtFirst(1);

        l1.first  = l1.sortList(l1.first);

        l1.printList();
    }
}