package speedOfTrain;
import java.util.Scanner;
public class SpeedOfTrain {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int trainLen=sc.nextInt();
	 int manSpeed=5;
	 int trainTime=sc.nextInt();
	 
	 int trainSpdRelativeToMan = (trainLen*18)/(trainTime*5);
	 int trainSpeed = trainSpdRelativeToMan+manSpeed;
	 System.out.print(trainSpeed);
 }
}
