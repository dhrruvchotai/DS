class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class RemoveDuplicate{
    public ListNode head;

    public void addLast(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
        } 
        else{
            ListNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public ListNode removeDuplicates(){
        if (head == null) {
            return null;
        }
        
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val){
                current.next = current.next.next;

            }
             else{
                current = current.next;
            }
        }
        
        return head;
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicate list = new RemoveDuplicate();


        list.addLast(1);
        list.addLast(1);
        list.addLast(6);
        list.addLast(13);
        list.addLast(13);
        list.addLast(13);
        list.addLast(27);
        list.addLast(27);

    

        list.removeDuplicates();

     
        list.printList();
    }
}