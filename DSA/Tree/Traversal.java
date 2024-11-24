import java.util.Scanner;

class Node {
        int data;
        Node left, right = null;

        Node(int data) {
                this.data = data;
        }
}

class BinaryTree {
        Node bpt = null;

        Scanner sc = new Scanner(System.in);

        Node constructBT() {
                System.out.println("Enter data for Node:");
                int data = sc.nextInt();
                Node newNode = new Node(data);
                if (bpt == null) {
                        bpt = newNode;
                }

                System.out.println("Do you want to enter node  at left 0f?  " + newNode.data);
                char leftNode = sc.next().charAt(0);

                if (leftNode == 'y' || leftNode == 'Y') {
                        newNode.left = constructBT();
                }

                System.out.println("Do you want to enter node  at right of?  " + newNode.data);
                char rightNode = sc.next().charAt(0);

                if (rightNode == 'y' || rightNode == 'Y') {
                        newNode.right = constructBT();
                }
                return newNode;
        }

        void preOrderBT(Node root) {
                // Node pointer = root;

                if (root == null)
                        return;

                System.out.print(root.data + "  ");

                preOrderBT(root.left);
                preOrderBT(root.right);

        }

        void inOrderBT(Node root) {
                if (root == null)
                        return;

                inOrderBT(root.left);
                System.out.print(root.data + "  ");
                inOrderBT(root.right);
        }

        void postOrder(Node root) {
                if (root == null)
                        return;

                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data + "  ");
        }

        public static void main(String[] args) {
                Node root = null;
                BinaryTree bt = new BinaryTree();
                root = bt.constructBT();

                bt.preOrderBT(root);
                System.out.println();
                bt.inOrderBT(root);
                System.out.println();
                bt.postOrder(root);
        }

}
