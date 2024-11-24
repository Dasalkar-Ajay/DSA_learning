
import java.io.*;

class Demo{

	static int count(int num1,int num2){
		int count=1;

		if(num1<num2){
			for(int x=num1;x<num2;x++){
				count++;
			}
		}else{
			for( int x=num2;x<num1;x++){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		System.out.println(count(num1,num2));
		System.out.println(num1-num2+1);
	}
}
