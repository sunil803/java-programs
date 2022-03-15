package SEE;
import java.util.*;
import CIE.Inter;
import CIE.internals;

public class External extends Inter{
	Scanner sc = new Scanner(System.in);
	public int seemarks[] = {0,0,0,0,0};
	public External(){
		super();
		System.out.println("Enter marks in Sem End Exam");
		for(int i=0;i<5;i++){
			System.out.print("Marks in subject "+(i+1)+":");
			seemarks[i]=sc.nextInt();
		}
	}
}