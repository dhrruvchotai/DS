public class PriorityQueueArray {
    private int[] queue;
    private int size;
    private int capacity;

    public PriorityQueueArray(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.size = 0;
    }

    public void insert(int element) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[size] = element;
        size++;
        heapifyUp(size - 1);
    }

    public int delete() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int deletedElement = queue[0];
        queue[0] = queue[size - 1];
        size--;
        heapifyDown(0);
        return deletedElement;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Priority Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && queue[index] < queue[parentIndex]) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < size && queue[leftChild] < queue[smallest]) {
            smallest = leftChild;
        }
        if (rightChild < size && queue[rightChild] < queue[smallest]) {
            smallest = rightChild;
        }
        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = queue[i];
        queue[i] = queue[j];
        queue[j] = temp;
    }

    public static void main(String[] args) {
        PriorityQueueArray pq = new PriorityQueueArray(10);

        pq.insert(5);
        pq.insert(3);
        pq.insert(8);
        pq.insert(1);

        pq.display();

        System.out.println("Deleted element: " + pq.delete());
        pq.display();

        System.out.println("Deleted element: " + pq.delete());
        pq.display();
    }
}