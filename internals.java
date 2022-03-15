package CIE;
import java.util.*;

public class internals{
	public int marks[] = {0,0,0,0,0};
	Scanner sc = new Scanner(System.in);

	public internals(){
		System.out.println("Enter Marks in CIE");
		for(int i=0;i<5;i++){
			System.out.print("Enter Marks in subject"+(i+1)+":");
			marks[i] = sc.nextInt();
		}
	}
}
