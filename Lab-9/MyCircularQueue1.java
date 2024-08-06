public class MyCircularQueue1 {
    public static void main(String[] args) {
        
        MyCircularQueue mcq = new MyCircularQueue(5);

        mcq.enQueueCircular(2);
        mcq.enQueueCircular(4);
        mcq.enQueueCircular(6);
        mcq.enQueueCircular(8);
        mcq.enQueueCircular(10);
        // mcq.deQueueCircular();
        // mcq.deQueueCircular();

        // mcq.enQueueCircular(1);
        // mcq.enQueueCircular(2);

        mcq.printQueueCircular();
    }
}
class MyCircularQueue{
    int front = -1;
    int rear = -1;
    int n;

    int q[];

    public MyCircularQueue(int n){
        this.n = n;
        q= new int[n];
    }

    public void enQueueCircular(int elmt){
        
        
        if(front == -1){
            front = rear = 0;
            q[rear] = elmt;
            return;
        }

        else if((rear+1) % n == front){
            System.out.println("Queue Overflow!!");
            return;
        }

        rear = (rear+1) % n;
        q[rear] = elmt;

    }

    public int deQueueCircular(){

        int y = 0;

        if(front == -1){
            System.out.println(" ");
            System.out.println("Queue UnderFlow!!");
            return 0;
        }
        
        if(front == rear){
            y = q[front];
            front = rear = -1;
            return y;
        }

        y = q[front];
        front += 1;

        return y;
    }

    public void printQueueCircular(){

        int i;

        for(i = front; i != rear; i = ((i+1)%n)){
            System.out.println(" ");
            System.out.println("Queue["+i+"] is : "+q[i]);
        }
        
        System.out.println(" ");
        System.out.println("Queue["+i+"] is : "+q[i]);

    }
}
