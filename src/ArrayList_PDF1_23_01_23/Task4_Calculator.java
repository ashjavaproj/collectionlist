package ArrayList_PDF1_23_01_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4_Calculator {
	int a=60,b=6,c=0;
	
	   public int add(){
		   c=a+b;
		   return c;
		   
	   }
	   public int sub(){
		   c=a-b;
		   return c;
	   }
	  public int mul(){
		  c=a*b;
		  return c;
	   }
	   public int div(){
		   c=a/b;
		   return c;
	   }
	   public static void main(String args[]){
	    
	      Task4_Calculator c=new Task4_Calculator();
	       //call all methods here
	     int x=c.add();
	      int y=c.sub();
	     int z=c.mul();
	     int q=c.div();
	      //add to the list
	      List al=new ArrayList();
	     al.add(x);
	     al.add(y);
	     al.add(z);
	     al.add(q);
	      //iterator list using iterator
	     Iterator itr=al.iterator();
			while(itr.hasNext())
			{
				int a=(int) itr.next();
				 System.out.println(a);
				
			}
	    }
	}



