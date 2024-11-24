import java.util.*;
class Demo{
	static int fun(int num){
		int count= 0;
		for(int i= 1;i<=100;i++){
			
			if(num/i==i){
				System.out.println("The square of num "+num+"is "+i);
			
		count++;
			}	
		}
		return count;
	}
		public static void main(String [] args ){
			Scanner sc =new Scanner(System.in);
			int num = sc.nextInt();
			fun(num);
		}
	
}
