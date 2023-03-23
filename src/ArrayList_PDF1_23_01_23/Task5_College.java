package ArrayList_PDF1_23_01_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_College {
	public List m1()
	{
		
		Scanner sc=new Scanner(System.in);
		Task5_Student s=new Task5_Student();
		System.out.println("Enter First Student Information");
		s.setRollno(sc.nextInt());
		s.setName(sc.next());
		
		Task5_Student s1=new Task5_Student();
		System.out.println("Enter Second Student Information");
		s1.setRollno(sc.nextInt());
		s1.setName(sc.next());
		
		List al=new ArrayList();
		al.add(s);
		al.add(s1);
		return al;
		
	}

}
