package ArrayList_ClassWork_23_01_23;


	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	public class A_primitive
	
	{ 
		public static void main(String args[])
		{
			List al=new ArrayList();
			al.add(45);
			al.add(46);
			al.add(47);
			Iterator itr=al.iterator();
			while(itr.hasNext())
			{
				Integer a=(Integer) itr.next();
				System.out.println(a);
			}
			
			
		}

	}
	


