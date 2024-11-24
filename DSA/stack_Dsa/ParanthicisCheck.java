import java.util.Scanner;
import java.util.Stack;


class Checker{
        Stack<Character> s=new Stack<>();
        boolean Checking(String str){

        for(int i=0;i<str.length();i++){
		char x=str.charAt(i);
		if(x=='{' || x=='[' || x=='('){
			s.push(x);
		}else{
			if(!s.empty()){
			if((x==')'&&s.peek()=='(')||
				(x==']' && s.peek()=='[')||
				(x=='}' && s.peek()=='{')){
					s.pop();
				}else{
					return false;
				}
		}else{
			return false;
		}
		}
	}
	

	if(s.empty()) {
		return true;
	}

	return false;
	}
}

class CheckCall{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Paranthisis Pattern");
		String str=sc.next();

		Checker ch=new Checker();
		boolean out=ch.Checking(str);

		if(out==true) {
			System.out.println("Balanced");
		}else{
		       	System.out.println("Unbalanced");
		}
	}
}

