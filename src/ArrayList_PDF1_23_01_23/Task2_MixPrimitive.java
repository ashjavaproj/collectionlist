package ArrayList_PDF1_23_01_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2_MixPrimitive {

	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(73.30f);
		al.add(256.39d);
		al.add(11);
		al.add(77l);
		al.add(79.10);
		al.add(87D);
		al.add(581);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
	        Object o=itr.next();
	         if(o instanceof Integer)
	        {
	        	Integer a=(Integer)o;
	        	System.out.println(a);
	        }
	         else if(o instanceof Float)
	        {
	        	Float a=(Float)o;
	        	System.out.println(a);
	        }
	        else if(o instanceof Double)
	        {
	        	Double a=(Double)o;
	        	System.out.println(a);
	        }
	        else if(o instanceof Long)
	        {
	        	Long a=(Long)o;
	        	System.out.println(a);
	        }
		    }
	}
}