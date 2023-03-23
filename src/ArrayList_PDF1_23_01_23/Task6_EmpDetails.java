package ArrayList_PDF1_23_01_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task6_EmpDetails {
	

	public List setdetails()
	{
		Scanner sc=new Scanner(System.in);
		Task6_Employee em=new Task6_Employee();
		System.out.println("Enter Employee Details");
		System.out.print("Employee ID =");
		em.setEmpid(sc.nextInt());
		System.out.print("Employee Name =");
		em.setEmpname(sc.next());
		System.out.print("Employee Designation =");
		em.setEmpdesig(sc.next());
		System.out.print("Employee Salary =");
		em.setEmpsalary(sc.nextDouble());
		List al=new ArrayList();
		al.add(em);
		return al;
	}
	
	/*public void getdetails()
	
	{
		Task6_EmpDetails o=new Task6_EmpDetails();
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
			

	}
}*/
	public void getdetails()
	
	{
		Task6_EmpDetails o=new Task6_EmpDetails();
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
			

	}
}
	
	}
