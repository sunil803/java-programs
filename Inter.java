package CIE;
import java.util.*;

public class Inter{
	Scanner sc = new Scanner(System.in);
	public String name,usn;
	public int sem;
	public Inter(){
		System.out.println("Enter details:");
		System.out.print("Name:");
		name = sc.nextLine();
		System.out.print("USN:");
		usn = sc.nextLine();
		System.out.print("Semester:");
		sem = sc.nextInt();
	}
	
}


