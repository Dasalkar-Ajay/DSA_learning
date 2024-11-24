import java.util.*;

class TwoStack {
        int[] StackArr;
        int maxSize;
        int top1 = -1;
        int top2;

        TwoStack(int size) {
                StackArr = new int[size];
                maxSize = size;
                top2 = maxSize;
        }

        void push1(int value) {
                if (top2 - top1 > 1) {
                        top1++;
                        StackArr[top1] = value;
                } else {
                        System.out.println("Stack overflow:");
                }
        }

        void push2(int value) {
                if (top2 - top1 > 1) {
                        top2--;
                        StackArr[top2] = value;
                } else {
                        System.out.println("Stack overflow:");
                }
        }

        int pop1() {
                if (top1 == -1) {
                        System.out.println("The Stack is Empty:");
                        return -1;
                }
                if (top2 > top1) {
                        int value = StackArr[top1];
                        StackArr[top1--] = 0;
                        return value;
                } else {
                        System.out.println("The Stack is Empty:");
                        return -1;
                }
        }

        int pop2() {
                if (top2 == maxSize) {
                        System.out.println("The Stack is Empty:");
                        return -1;
                }
                if (top2 > top1) {
                        int value = StackArr[top2];
                        StackArr[top2++] = 0;
                        return value;
                } else {
                        System.out.println("The Stack is Empty:");
                        return -1;
                }
        }
}
 class jdk {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the arr:");
                int size = sc.nextInt();
                TwoStack t = new TwoStack(size);

                System.out.println("Enter 1 for the push in stack1");
                System.out.println("Enter 2 for the push in stack2");
                System.out.println("pop the Element in the Stack1");
                System.out.println("pop the Element in the Stack2");

                char ch;
                do {
                        System.out.println("Enter your choice:");
                        int choice = sc.nextInt();

                        int value;
                        switch (choice) {
                                case 1:
                                        System.out.println("Enter the element you want to push in Stack1");
                                        value = sc.nextInt();
                                        t.push1(value);
                                        break;

                                case 2:
                                        System.out.println("Enter the element you want to push in Stack2");
                                        value = sc.nextInt();
                                        t.push1(value);
                                        break;

                                case 3:
                                        t.pop1();
                                        break;

                                case 4:
                                        t.pop2();
                                        break;

                                default:
                                        break;
                        }

                        System.out.println("If you wnt to continuoe get Y:");
                        ch = sc.next().charAt(0);
                } while (ch == 'y' || ch == 'Y');

        }
}
