import java.util.*;
class sumOf{
	static int  sum(int num){
		int add=0;
		add = num*(num+1)/2;
		return add;
	}
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(sum(num));
	}
}

		

