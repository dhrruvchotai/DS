public class CountNodes {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public Node head;

    public void count(){
        Node temp = head;
        int cnt = 1;

        while(temp.next != null){
            temp = temp.next;
            cnt++;
        }
        System.out.println(cnt);
    }
   
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

    public static void main(String[] args) {
        CountNodes cn = new CountNodes();
        cn.addLast(0);
        cn.addLast(1);
        cn.addLast(2);
        cn.addLast(3);
        cn.addLast(4);
        cn.addLast(5);

        cn.count();
        
    }
}
