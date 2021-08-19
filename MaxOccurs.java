package maxOccur;
import java.util.Scanner;
public class MaxOccurs {
	public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int[] arr=new int[10];
    	int[] occur=new int[10];
        int max=0;
    	for(int i=0;i<10;i++) {
    		arr[i]=sc.nextInt();
    		occur[arr[i]]++;
    		if(occur[arr[i]]>max) max=occur[arr[i]];
    	}
    	System.out.print(max);
    }
}
