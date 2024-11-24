import java.util.*;

class ll {
        ll next;
        int data;

        ll(int data) {
                this.data = data;
        }
}

class StackDemo {
        ll head = null;

        public void push(int data) {
                ll newnode = new ll(data);
                if (head == null) {
                        head = newnode;
                } else {
                        newnode.next = head;
                        head = newnode;
                }
        }

        public void pop() {
                if (head == null) {
                        System.out.println("The empty stack:");
                        return;
                }
                System.out.println(head.data);
                head = head.next;
        }

        public void peek() {
                System.out.println(head.data);
        }

        void printAll() {
                ll temp = head;
                while (temp != null) {
                        System.out.println(temp.data);
                        temp = temp.next;
                }
        }

        int size() {
                ll temp = head;
                int size = 0;
                while (temp != null) {
                        temp = temp.next;
                        size++;
                }
                return size;
        }

        boolean empty() {
                if (head == null)
                        return true;

                return false;
        }
}

 class stackLLsingly {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                StackDemo sd = new StackDemo();
                char ch;
                
                System.out.println("for push 1");
                System.out.println("for pop 2");
                System.out.println("for peek 3");
                System.out.println("for empty 4");
                System.out.println("for size 5");
                System.out.println("for printAll 6");
                do {

                        System.out.println("\n Enter your choice");
                        int choice = sc.nextInt();

                        switch (choice) {
                                case 1:
                                        System.out.println("Enter the value you want to push");
                                        sd.push(sc.nextInt());
                                        break;

                                case 2:
                                        sd.pop();
                                        break;

                                case 3:
                                        sd.peek();
                                        break;

                                case 4:
                                        System.out.println(sd.empty());
                                        break;

                                case 5:
                                        System.out.println("The size of stack" + sd.size());
                                        break;

                                case 6:
                                        sd.printAll();
                                        break;

                                default:
                                        System.out.println("Enter the valid choice:");
                                        break;
                        }

                        System.out.println("Enter y if you want to continue:");
                        ch = sc.next().charAt(0);
                } while (ch == 'y' || ch == 'Y');
        }
}
