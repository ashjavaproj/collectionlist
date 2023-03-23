package ArrayList_PDF1_23_01_23;

import java.util.Iterator;
import java.util.List;

public class Task5_UniversityTest {

	public static void main(String[] args) {
		Task5_College c=new Task5_College();
        List data=c.m1();
		/*Iterator itr=data.iterator();
		System.out.println("  Rollno           Name        ");
		while(itr.hasNext())
		{
			
			
			Task5_Student a=(Task5_Student) itr.next();
			
			System.out.print("   "+a.getRollno());
			System.out.print("               "+a.getName());
			System.out.println();

	}*/
        for(Task5_Student a:data)
		{
			
			System.out.println(a);
		}


}
	
}