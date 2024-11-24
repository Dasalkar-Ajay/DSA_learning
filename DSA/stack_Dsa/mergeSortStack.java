import java.util.*;


class mergeStack{
	Stack	mergeStacks(Stack<Integer> s1,Stack<Integer> s2){
	Stack<Integer> s3=new Stack<>();
	
	while(!s1.empty()&&!s2.empty()){
	if(s1.peek()>s2.peek()){
		s3.push(s1.pop());
	}else{
		s3.push(s2.pop());
	}
	}
	while(!s1.empty()){
		s3.push(s1.pop());
	}
	while(!s2.empty()){
		s3.push(s2.pop());
	}

	while(!s3.empty()){
	s1.push(s3.pop());
	}
	return s1;
	}
}

class mergeSortStack{
	public static void main(String[] args){
		Stack<Integer> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();
		Scanner sc=new Scanner(System.in);
		
		
		mergeStack mer=new mergeStack();

		char ch;
	
		do{

		System.out.println("1 for push data in Stack 1");
		System.out.println("2 for push data in the stack 2");
		int choice=sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Enter the data you want to push");
				s1.push(sc.nextInt());
				break;

			case 2:
				System.out.println("Enter the data you want to push");
				s2.push(sc.nextInt());
				break;
			}
		System.out.println("if you want to add again enter 'Y' ");
		ch=sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');	

			System.out.println(mer.mergeStacks(s1,s2));
		
	}
}
