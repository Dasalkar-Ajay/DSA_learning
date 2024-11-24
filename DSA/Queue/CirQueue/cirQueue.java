import java.util.*;

class CircularQueue {
        int queueArr[];
        int front;
        int rear;
        int maxSize;

        CircularQueue(int size) {
                this.maxSize = size;
                this.queueArr = new int[size];
                front = rear = -1;
        }

        void enqueue(int data) {
                if ((rear == maxSize - 1 && front == 0) || (rear % maxSize + 1 == front)) {
                        System.out.println("The queue is full");
                        return;
                }
                if (front == rear && rear == -1) {
                        front++;
                }
                if (rear == maxSize - 1) {
                        rear = -1;
                }
                queueArr[++rear] = data;
        }

        int dequeue() {
                if (front == -1) {
                        System.out.println("The queueu is empty");
                        return -1;
                }
                int value = queueArr[front];
                System.out.println(queueArr[front] + "removed");
                if (rear >= front) {
                        queueArr[front] = 0;
                        front++;
                        if (front > rear) {
                                front = rear = -1;
                        }
                        return value;
                }

                queueArr[front] = 0;
                front++;
                if (front == maxSize) {
                        front = 0;
                }

                return value;
        }

        void printAll() {
                if (front == -1) {
                        System.out.println("The queue is empty");
                        return;
                }
                if (rear >= front) {
                        for (int i = front; i <= rear; i++) {
                                System.out.println(queueArr[i] + " ");
                        }
                } else {
                        int index = front;
                        for (int i = 0; i <= maxSize - (front - rear); i++) {

                                System.out.println(queueArr[index] + " ");

                                index++;
                                if (index == maxSize) {
                                        index = 0;
                                }
                        }
                }

        }

}

class Client {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of array");
                int size = sc.nextInt();
                CircularQueue cq = new CircularQueue(size);

                char ch;

                do {
                        System.out.println("1.enqueue");
                        System.out.println("2.dequeue");
                        System.out.println("3.printQueue");
                        int choice = sc.nextInt();

                        switch (choice) {
                                case 1:
                                        System.out.println("Enter the no you want to enter");
                                        int data = sc.nextInt();
                                        cq.enqueue(data);
                                        break;
                                case 2:
                                        cq.dequeue();
                                        break;
                                case 3:
                                        cq.printAll();
                                        break;

                                default:
                                        System.out.println("Enter the correct choice");
                        }

                        System.out.println("Enter y if you want to continu");
                        ch = sc.next().charAt(0);
                } while (ch == 'y' || ch == 'Y');
        }
}
