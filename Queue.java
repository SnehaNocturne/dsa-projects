class Queue {
    int front = 0, rear = -1, size = 5;
    int arr[] = new int[size];

    void enqueue(int x) {
        if (rear == size - 1)
            System.out.println("Queue Full");
        else {
            arr[++rear] = x;
            System.out.println("Inserted: " + x);
        }
    }

    void dequeue() {
        if (front > rear)
            System.out.println("Queue Empty");
        else
            System.out.println("Removed: " + arr[front++]);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
    }
}
