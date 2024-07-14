public class CheckTwoList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public Node head;
   
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

    public static void check(CheckTwoList cl1,CheckTwoList cl2){
       
        Node temp1 = cl1.head;
        Node temp2 = cl2.head;

        while(temp1 != null && temp2 != null){
            if(temp1.data != temp2.data){
                System.out.println("not equal");
                return;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if (temp1 == null && temp2 == null) {
            System.out.println("equal");
        } 
        else {
            System.out.println("not equal");
        }
    }

    public static void main(String[] args) {
        CheckTwoList cl1 = new CheckTwoList();
        CheckTwoList cl2 = new CheckTwoList();

        cl1.addLast(0);
        cl1.addLast(1);
        cl1.addLast(2);
        cl1.addLast(3);
        cl1.addLast(4);
        cl1.addLast(5);

        cl2.addLast(0);
        cl2.addLast(1);
        cl2.addLast(2);
        cl2.addLast(3);
        cl2.addLast(4);
        cl2.addLast(5);


        check(cl1,cl2);
    }
}
