public class GCDOfNode{
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

    public void addGCD(){

        if (head == null || head.next == null) {
            return;  
        }
        Node temp = head;

        while(temp != null && temp.next != null){
            int gcd = calcGCD(temp.data, temp.next.data);
            addNode(gcd,temp);
            temp = temp.next.next;
        }
    }

    public int calcGCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
 
    }

    public void addNode(int n, Node temp){
        Node n1 = new Node(n);
        n1.next = temp.next;
        temp.next = n1;
    }

    public static void main(String[] args) {
        GCDOfNode l1 = new GCDOfNode();

        l1.addLast(18);
        l1.addLast(6);
        l1.addLast(10);
        l1.addLast(3);
        
        l1.addGCD();
        l1.printData();
    }
}