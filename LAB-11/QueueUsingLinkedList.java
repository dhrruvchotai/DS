public class QueueUsingLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public Node head;

    public void add(int data){
      Node n1 = new Node(data);

      if(head == null){
        head = n1;
        return;
      }

      Node temp = head;

      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = n1;
    }

    public void remove(){
        if(head == null){
            System.out.println("This is empty");
            return;
        }
        head = head.next;
    }

    public void printData() {
        Node temp = head;

        if (head == null) {
            System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        QueueUsingLinkedList ql1 = new QueueUsingLinkedList();

        ql1.add(0);
        ql1.add(1);
        ql1.add(2);
        ql1.add(3);
        ql1.add(4);
        ql1.printData();

        ql1.remove();
        ql1.remove();
        ql1.printData();
    }
}
