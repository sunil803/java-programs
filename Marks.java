import CIE.Inter;
import CIE.internals;
import SEE.External;
import java.util.*;

public class Marks{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("How many students are there?:");
		n = sc.nextInt();

		internals stdcie[] = new internals[n];
		External stdsee[] = new External[n];

		for(int i=0;i<n;i++){
			stdsee[i] = new External();
			stdcie[i] = new internals();
		}

		for(int i=0;i<n;i++){
			int total=0;
			for(int j=0;j<5;j++){
				total = total +(stdsee[i].seemarks[j]/2 + stdcie[i].marks[j]);
			}
			System.out.println("Total marks:"+total);
		}

		
		








/*		for(int i=0;i<n;i++){
			Inter stdint[] = new Inter[n];
			internals stdcie[] = new internals[n];
			External stdext[] = new External[n];
		}

		for(int j=0;j<n;j++){
			int total=0;
			for(int k=0;k<5;k++){
				total = total+stdcie[j].marks[k]+stdext[j].seemarks[k];
			}
		System.out.println("Final marks of student"+(j+1)+":"+total);
		} */
			
		
	}
}