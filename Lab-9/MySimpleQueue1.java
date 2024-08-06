public class MySimpleQueue1 {
    public static void main(String[] args) {
        MySimpleQueue mq = new MySimpleQueue();

        mq.enQueue(1);
        mq.enQueue(2);
        mq.enQueue(4);
        mq.enQueue(8);
        int removedelmt = mq.deQueue();
        mq.printQ();

        System.out.println(" ");
        System.out.println("Removed Elmt is :"+removedelmt);
    }
}
class MySimpleQueue{
    int front = -1;
    int rear = -1;
    int q[] = new int[5];

    public void enQueue(int elmt){
        rear = rear + 1;

        if(rear >= 5){
            System.out.println("Queue OverFlow!!");
        }

        q[rear] = elmt;

        if(front == -1){
            front = 0;
            return;
        }

    }

    public void printQ(){
        for(int i=0;i<5;i++){
            System.out.println(" ");
            System.out.println("Queue["+i+"] is : "+q[i]);
        }
    }

    public int deQueue(){

        if(rear == -1){
            System.out.println(" ");
            System.out.println("Queue Overflow!!");
        }
        rear = rear - 1;
        return q[rear+1];

    }

    
}