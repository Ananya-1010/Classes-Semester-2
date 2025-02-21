public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow ");
            return;
        }
        top++;
        stackArray[top] = value;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return ;
        }
       top--; 
    }


    public void Display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return ;
        }

        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i]);
            }
        
    
    }


    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.Display();


        stack.pop();

        stack.Display();

    }
}
