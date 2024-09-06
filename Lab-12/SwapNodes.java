class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class SwapNodes {
     ListNode head;

    public void addLast(int val){
        ListNode newNode = new ListNode(val);
        if(head == null) {
            head = newNode;
        } 
        else{
            ListNode current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void swapConsecutiveNodes(){
        if(head == null || head.next == null){
            return;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null){
            ListNode first = prev.next;
            ListNode second = prev.next.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        head = dummy.next;
    }

    // Method to print the linked list
    public void printList(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;

        }
        System.out.println();
    }

    public static void main(String[] args){
        SwapNodes list = new SwapNodes();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);


        list.swapConsecutiveNodes();

        list.printList();
    }
}