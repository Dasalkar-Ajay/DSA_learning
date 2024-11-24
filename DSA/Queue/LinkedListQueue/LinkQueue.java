import java.util.*;

class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
	}
}

class Queue{
	Node front,rear=null;
	
	void enqueue(int data){
		if(front==rear && front==null){
			Node newnode=new Node(data);
			front=newnode;
			rear=newnode;
		}else{
			Node newnode=new Node(data);
			rear.next=newnode;
			rear=newnode;
		}
	}
	void printAll(){
		Node temp=front;
		if(temp==null){
			System.out.println("The queue is empty");
			return;
		}
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	int front(){
	if(front==null) return -1;

	return front.data;
	}
	int rear(){
		if(rear==null) return -1;
		
		return rear.data;
	}
	int dequeue(){
		if(front==null) {
			System.out.println("The queue is empty");
			return -1;
		}else{
		int value=front.data;
		front=front.next;
		System.out.println(value+"  value dequeue");
		return value;
		}
	}
	boolean empty(){
		if(front==null)
			return true;
		else
			return false;
	}
}

class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Queue q=new Queue();
		char ch;

		do{
			System.out.println("1. for enqueue");
			System.out.println("2. for dequeue");
			System.out.println("3. for empty");
			System.out.println("4. for front ");
			System.out.println("5. for rear");
			System.out.println("6. for printAll");
			
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the no you want to enter");
					int data=sc.nextInt();
					q.enqueue(data);
					break;
				case 2:
					q.dequeue();
					break;
				case 3:
					if(q.empty())System.out.println("The queue is empty");
					else System.out.println("queue is not empty");
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					q.printAll();
					break;
				default:
					System.out.println("Enter the valid choice");
			}

			System.out.println("Enter y for continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
	}
}
