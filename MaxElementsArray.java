package maxElementInArray;
import java.util.Scanner;
public class MaxElementsArray {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int[] arr=new int[25];
	  int sum=0;
	  for(int i=0;i<25;i++) {
		  arr[i]=sc.nextInt();
		  if(arr[i]>sum) sum=arr[i]; 
	  }
	  System.out.print(sum);
 }
}
