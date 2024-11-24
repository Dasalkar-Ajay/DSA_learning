import java.util.*;
  class BinarySearch{

	  int binarySearch(int arr[],int search){
	
		int start=0;
		int end=arr.length;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==search)
				return mid;

			if(search<arr[mid]){
				start=start;
				end=mid-1;
			}else{start=mid+1;
				end=end;
			}
		}
	return -1;
	 }
	  public static void main(String[] args){
	
		  int [] arr=new int[]{4,7,11,24,35,57,75,87};
	  Scanner sc=new Scanner(System.in);
			int search=sc.nextInt();

	BinarySearch bs=new BinarySearch();
		//System.out.println(bs.binarySearch(arr,serch));
		if(bs.binarySearch(arr,search)==-1){
			System.out.println("Element not found");
		}else{
			System.out.println("element present at indeX:"+bs.binarySearch(arr,search));
		}
	  }
  }
    

