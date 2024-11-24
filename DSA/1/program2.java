import java.util.*;

class FactorDemo{
	
	static int Factors(int x){
		int count=0;
		for (int i=1;i<=x/2;i++){
			if(x%i==0){
				System.out.println(i);
				if(i==1){
					System.out.println(i);
				}
			count++;
			}
		
		}
		return count+1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the value of x");

		int x= sc.nextInt();

		System.out.println(Factors( x));

	}
}
