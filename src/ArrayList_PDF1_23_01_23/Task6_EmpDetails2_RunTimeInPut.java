package ArrayList_PDF1_23_01_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task6_EmpDetails2_RunTimeInPut {
	
	int en;
	List al=new ArrayList();
	public List setdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Total Number of Employee");
		en=sc.nextInt();
		
		Task6_Employee em=new Task6_Employee();
		
		Task6_Employee ary[]=new Task6_Employee[en];
		
		for(int i=0;i<ary.length;i++)
		{
		System.out.println("Enter"+(i+1)+" Employee Details");
		System.out.print("Employee ID =");
		em.setEmpid(sc.nextInt());
		System.out.print("Employee Name =");
		em.setEmpname(sc.next());
		System.out.print("Employee Designation =");
		em.setEmpdesig(sc.next());
		System.out.print("Employee Salary =");
		em.setEmpsalary(sc.nextDouble());
		ary[i]=em;
		al.add(ary[i]);
		}
		return al;
	}
	
		public void getdetails()
	
	{
			Task6_EmpDetails2_RunTimeInPut o=new Task6_EmpDetails2_RunTimeInPut();
		List data=o.setdetails();
		Iterator itr=data.iterator();
		System.out.println("EmpID   EmpName    EmpDesig      EmpSalary ");
		System.out.println("--------------------------------------------------");
		while(itr.hasNext())
		{
			
			
			Task6_Employee a=(Task6_Employee) itr.next();
			
			System.out.print(" "+a.getEmpid());
			System.out.print("    "+a.getEmpname());
			System.out.print("        "+a.getEmpdesig());
			System.out.print("            "+a.getEmpsalary());
			System.out.println();
			

	}
}
	
	}
