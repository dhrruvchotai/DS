public class LinkedListDemo {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public Node head;

    //aagad add karva mate 
    public void addFirst(int data){
        Node n1 = new Node(data);
       
        if(head == null){
            head = n1;
            return;
        }
        else{
            n1.next = head;
            head = n1;
        }
    }

    //last ma add karva mate
    public void addLast(int data){
        Node n2 = new Node(data);

        if(head == null){
            head = n2;
            return;
        }
        else{
            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n2;
             
        }
    }

    //vache node nakhva mate
    public void addMiddle(int index, int data){
        Node n1 = new Node(data);
        Node temp = head;
        int cnt = 1;

        while(cnt != index-1){
            temp = temp.next;
            cnt++;
        }

        n1.next = temp.next;
        temp.next = n1;

    }

    //print
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

    //first delete karva mate
    public void deleteFirst(){
        if(head == null){
            System.out.println("This is empty");
            return;
        }
        head = head.next;
    }

    //last delete karva mate
    public void deleteLast(){
        if(head == null){
            System.out.println("This is empty");
            return;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        } 
        temp.next = null;
    }

    //aapeli index par no node delete karva mate
    public void deleteIndex(int index){
        Node curr = head;

        for(int i = 1; i < index-1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    //apeli value delete karva mate
    public void deleteVal(int data){
        Node temp = head;

        while(temp.data != data){
            temp = temp.next;
        }
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }


    public static void main(String[] args) {
        LinkedListDemo l1 = new LinkedListDemo();

        l1.addFirst(1);
        l1.addFirst(0);
        l1.printData();

        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        l1.printData();

        // l1.deleteLast();
        // l1.printData();

        // l1.deleteFirst();
        // l1.printData();

        // l1.deleteIndex(2);
        // l1.printData();

        // l1.addMiddle(3,19);
        // l1.printData();

        // l1.deleteVal(4);
        // l1.printData();


    }
}
