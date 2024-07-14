public class RemoveDuplicate {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addLast(int data) {
        Node n2 = new Node(data);

        if (head == null) {
            head = n2;
            return;
        } 
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n2;

        }
    }

    public void printData(){
        Node temp = head;

        if(head == null){
           System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    
    public static void remove_duplicates() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null) {
            return;
        }
        Node current = head;
        Node temp = current.next;
        Node previous = current;
        while(current != null) {
            while(temp != null) {
                if(temp.data == current.data) {
                    previous.next = temp.next;
                    temp = temp.next;
                    continue;
                }
                previous = temp;
                temp = temp.next;
            }
            current = current.next;
            if(current == null) return;
            previous = current;
            temp = current.next;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicate rd1 = new RemoveDuplicate();

        rd1.addLast(0);
        rd1.addLast(1);
        rd1.addLast(2);
        rd1.addLast(3);
        rd1.addLast(4);
        rd1.addLast(0);

        remove_duplicates();
        rd1.printData();
    }

}
