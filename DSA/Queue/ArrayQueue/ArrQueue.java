import java.util.*;

class Queue {
        int queueArr[];
        int front = -1;
        int rear = -1;
        int maxSize;

        Queue(int size) {
                this.maxSize = size;
                this.queueArr = new int[size];
        }

        void enqueue(int data) {
                if (rear == maxSize - 1) {
                        System.out.println("Queue is full");
                        return;
                } else {
                        if (front == rear && front == -1)
                                front++;

                        queueArr[++rear] = data;

                }
        }

        int dequeue() {
                if (front != -1 && front <= rear && rear < maxSize) {
                        int value;
                        if (front == rear) {

                                value = queueArr[front];
                                queueArr[front] = 0;
                                front = rear = -1;
                                return value;
                        }
                        value = queueArr[front];
                        queueArr[front++] = 0;
                        return value;
                } else {
                        System.out.println("Queue is empty or at last index");
                }
                return -1;
        }

        boolean empty() {
		if(front==-1)return true;
                return false;
        }

        int front() {
		if(front== -1){
			System.out.println("The queue is empty");
			return -1;
		}else{
			return queueArr[front];
		}
       }
        int rear() {
		if(rear== -1){
			System.out.println("The queue is empty");
			return -1;
		}else{
			return queueArr[rear];
		}
        }

        void printQueue() {
		if(rear==-1) {
			System.out.println("The queue is empty");
			return;
		}
		System.out.print("[");
		for(int i=front;i<=rear;i++){
			System.out.print(queueArr[i]+",");
		}
		System.out.println("]");

        }
}

class Client {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of Queue");
                int size = sc.nextInt();
                System.out.println("in clieent");
                Queue q = new Queue(size);
                char ch;
                do {
                        System.out.println("1.enqueue");
                        System.out.println("2.dequeue");
                        System.out.println("3.empty");
                        System.out.println("4.front");
                        System.out.println("5.rear");
                        System.out.println("6.PrintQueue");

                        System.out.println("Enter your choice");
                        int choice = sc.nextInt();

                        switch (choice) {
                                case 1:
                                        System.out.println("Enter the no you want to enqueue");
                                        int data = sc.nextInt();
                                        q.enqueue(data);
                                        break;
                                case 2: {
                                        int ret = q.dequeue();
                                        if (ret != -1) {
                                                System.out.println(ret + "pop");
                                        } else {
                                                System.out.println("Empty queue");
                                        }
                                }
                                        break;
                                case 3: {
                                        boolean ret = q.empty();
                                        if (ret)
                                                System.out.println("Queue is empty");
                                        else
                                                System.out.println("Queue is no empty");
                                }
                                        break;
                                case 4: {
                                        int ret = q.front();
                                        if (ret != -1)
                                                System.out.println("Front element is ret" + ret);
                                }
                                        break;
                                case 5: {
                                        int ret = q.rear();
                                        if (ret != -1)
                                                System.out.println("Front element is " + ret);
                                }
                                        break;
                                case 6: {
                                        q.printQueue();
                                }
                                        break;
                                default:
                                        System.out.println("Enter the valid choice");
                        }
                        System.out.println("Enter y if you want to continue");
                        ch = sc.next().charAt(0);
                } while (ch == 'y' || ch == 'Y');

        }
}
