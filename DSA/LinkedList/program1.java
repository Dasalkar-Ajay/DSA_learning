
/**
 * Optimal
 */
import java.util.*;

class Node {
  Node next = null;
  Node prev = null;
  int data;

  Node(int data) {
    this.data = data;
  }
}

class DoubleLL {
  Node head = null;

  void addFirst(int element) {
    Node newnode = new Node(element);
    if (head == null) {
      head = newnode;
    } else if (head.next == null) {
      newnode.next = head;
      head.prev = newnode;
      head = newnode;
    } else {
      newnode.next = head;
      head.prev = newnode;

      head = newnode;
    }
  }

  void printall() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + "  ");
      temp = temp.next;
    }
    System.out.println();
  }

  void printallrev() {
    Node temp = head;
    if (temp == null)
      return;
    while (temp.next != null) {
      temp = temp.next;
    }

    while (temp != null) {
      System.out.print(temp.data + "  ");
      temp = temp.prev;
    }
    System.out.println();
  }

  int getCount() {
    Node temp = head;

    int count = 0;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    return count;

  }

  void addAtPosition(int position, int element) {
    if (position > getCount() + 1 || position < 0) {
      System.out.println("envalid position");
      return;
    }
    if (position == 1) {
      addFirst(element);
    } else if (position == getCount() + 1) {
      addLast(element);
    } else {
      Node newnode = new Node(element);
      Node temp = head;
      while (position - 1 != 0) {
        temp = temp.next;
        position--;
      }
      temp.next.prev = newnode;
      newnode.next = temp.next;
      temp.next = newnode;
      newnode.prev = temp;
    }
  }

  void addLast(int element) {
    Node temp = head;
    if (temp == null) {
      addFirst(element);
      return;
    }
    while (temp.next != null) {
      temp = temp.next;
    }
    Node newnode = new Node(element);
    temp.next = newnode;
    newnode.prev = temp;
  }

  void delFirst() {
    if (head == null)
      return;
    head = head.next;
  }

  void delLast() {
    Node temp = head;
    if (head == null)
      return;
    if (head.next == null) {
      head = null;
      return;
    }
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
  }

  void delAtPosition(int position) {

    if (position > getCount() || position < 0) {
      System.out.println("envalid position");
      return;
    }
    if (position == 1) {
      delFirst();
    } else if (position == getCount()) {
      delLast();
      ;
    } else {
      Node temp = head;
      while (position - 2 != 0) {
        temp = temp.next;
        position--;
      }

      temp.next = temp.next.next;
      temp.next.prev = temp;
    }
  }

  void preElement(int index) {
    Node temp = head;
    while (index != 0) {
      temp = temp.next;
      index--;
    }
    System.out.println(temp.prev.data);
  }

}

 class code {
  public static void main(String[] args) {

    DoubleLL dll = new DoubleLL();
    char ch;
    Scanner sc= new Scanner(System.in);
    do {
      System.out.println("case 1 : addfirst ");
      System.out.println("case 2 : addLast ");
      System.out.println("case 3 : addAt position ");
      System.out.println("case 4 : delfirst ");
      System.out.println("case 5 : delLast ");
      System.out.println("case 6 : delAtPosition");
      System.out.println("case 7 : getcount Node ");
      System.out.println("case 8 : printall ");
      System.out.println("case 9 : Get preElement at position ");

      System.out.println("Enter Your choice:");
      int choice = sc.nextInt();
      switch (choice) {
        case 1: {
          System.out.println("enter the value to add :");
          dll.addFirst(sc.nextInt());
        }
          break;
        case 2: {
          System.out.println("enter the value to add:");
          dll.addLast(sc.nextInt());
        }
          break;
        case 3: {
          System.out.println("enter the value to add:");
          int x = sc.nextInt();
          System.out.println("enter the value to add Position:");
          int y = sc.nextInt();
          dll.addAtPosition(y, x);
        }
          break;
        case 4: {
          dll.delFirst();
        }
          break;
        case 5: {
          dll.delLast();
        }
          break;
        case 6: {
          System.out.println("enter the value to delet Position:");
          int x = sc.nextInt();
          dll.delAtPosition(x);
        }
          break;
        case 7: {
          System.out.println(dll.getCount());
        }
          break;
        case 8: {
          dll.printall();
        }
          break;
        default: {
          System.out.println("wrong choice chutiye:");
        }
        case 9: {
          System.out.println("Enter position of the element which pre u wnt:");
          int x = sc.nextInt();
          dll.preElement(x);
        }
      }
      System.out.println("is you wnt to continue if yes get Y|y or N|n:");
      ch = sc.next().charAt(0);
    } while (ch == 'y' || ch == 'Y');
  }
}

