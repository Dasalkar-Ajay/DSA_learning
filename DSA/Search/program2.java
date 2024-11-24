import java.util.*;
class Recursion_BinarySearch{

                int R_BinarySearch(int[] arr,int Search,int start,int end){
  int mid=(start+end)/2;
  if(start>end)
          return -1;
  if(arr[mid]==Search){
          return mid;
  }
          if(Search<arr[mid]){
                  start=start;
                  end=mid-1;
          }else{
                  start=mid+1;
                  end=end;
          }

          if(R_BinarySearch(arr,Search,start,end)!= -1){
                  return R_BinarySearch(arr,Search,start,end);

          }

          return -1;
          }
  public static void main(String[] args){
          int[] arr=new int[] {4,11,35,45,67,76,87};
          Scanner sc=new Scanner(System.in);
          int Search=sc.nextInt();
          Recursion_BinarySearch Rb=new Recursion_BinarySearch();
          int start=0;
          int end=arr.length;
          int ret=Rb.R_BinarySearch(arr,Search,start,end);
          if(ret==-1){
                  System.out.println("Elemtnt not found");
          }else{
                  System.out.println("Element at position of the index:"+ret);
          }
  }
}
