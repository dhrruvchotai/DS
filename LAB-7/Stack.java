public class Stack {

    public static void main(String[] args) {
        StackImpliment s = new StackImpliment(5);
        s.push(5);
        s.push(10);
        s.push(6);
        s.peep(2);
        s.change(1, 0);
        s.display();
    }
}

class StackImpliment {
    int maxSize;
    int top;
    int[] stackArray;

    public StackImpliment(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    void push(int val) {
        if (top == maxSize) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = val;
            System.out.println("pushed " + val + " into the stack");
        }
    }

    void pop() {
        if (top >= 0) {
            int popped = stackArray[top--];
            System.out.println(popped);
        } else {
            System.out.println("stack empty");
        }
    }

    void peek() {
        System.out.println(stackArray[top]);
    }

    int peep(int i) {
        if (top - i + 1 <= 0) {
            System.out.println("Stack Underflow");
        }
        return stackArray[top - i + 1];
    }

    void change(int idx, int val) {
        stackArray[idx] = val;

    }   

    void display() {
        int temp = top;
        while (temp >= 0) {
            System.out.println(stackArray[temp--]);
        }

    }
}