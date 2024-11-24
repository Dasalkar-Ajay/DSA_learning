
import java.util.*;

class Stack {
    int maxsize;
    int index = -1;
    int[] StackArr;

    Stack(int size) {
        StackArr = new int[size];
        this.maxsize = size;
    }

    public void push(int value) {
        if (index < maxsize - 1) {
            index++;
            StackArr[index] = value;
        } else {
            System.out.println("the stack is full");
        }
    }

    public void pop() {
        if (index >= 0) {
            System.out.println(StackArr[index]);
            StackArr[index] = 0;
            index--;
        } else {
            System.out.println("The Queue is empty:");
        }
    }

    public void peek() {
        System.out.println(StackArr[index]);
    }

    void PrintStack() {
        for (int i = 0; i < maxsize; i++) {
            System.out.print(StackArr[i] + " ");
        }
        System.out.println();
    }

    int size() {
        return index + 1;
    }

    boolean empty() {
        if (index > -1)
            return false;

        return true;
    }
}

 class stackArrDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack:");
        int size = sc.nextInt();
        Stack s = new Stack(size);
        char ch;
        do {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.empty");
            System.out.println("5.size");
            System.out.println("6.PrintStack");

            System.out.println("Enter Your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value want to push");
                    s.push(sc.nextInt());
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    System.out.println(s.empty());
                    break;

                case 5:
                    System.out.println(s.size());
                    break;

                case 6:
                    s.PrintStack();

                default:
                    System.out.println("Enter the valid choice:");
                    break;
            }

            System.out.println("Enter your choice if want to continue enter the y || Y");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}

