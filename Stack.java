class Stack {
    int top = -1;
    int arr[] = new int[5];

    void push(int x) {
        if (top == arr.length - 1)
            System.out.println("Stack Overflow");
        else {
            arr[++top] = x;
            System.out.println("Pushed: " + x);
        }
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + arr[top--]);
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.pop();
        s.display();
    }
}
