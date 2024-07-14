public class Lab_4_28 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        ArrayDatabase db = new ArrayDatabase(data);
        System.out.println("Sum: " + db.sum());
        System.out.println("Min: " + db.min());
        System.out.println("Max: " + db.max());
        System.out.println("Avg: " + db.avg());
    }
}
class ArrayDatabase {
    int[] data;

    public ArrayDatabase(int[] data) {
        this.data = data;
    }
    public int sum() {
        int total = 0;
        for (int value : data) {
            total += value;
        }
        return total;
    }
    public int min() {
        int minimum = Integer.MAX_VALUE;
        for (int value : data) {
            if (value < minimum) {
                minimum = value;
            }
        }
        return minimum;
    }
    public int max() {
        int maximum = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > maximum) {
                maximum = value;
            }
        }
        return maximum;
    }
    public double avg() {  
        return (double) sum() / data.length;
    }
}
