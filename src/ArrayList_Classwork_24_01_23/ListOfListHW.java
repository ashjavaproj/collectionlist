package ArrayList_Classwork_24_01_23;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfListHW {

	public static void main(String[] args) {
		
		List mh=new ArrayList();
			mh.add("pune");
			mh.add("Mumbai");
			mh.add("Kolhapur");
			mh.add("satara");
			mh.add("sangali");

		List gj=new ArrayList();
			gj.add("Surat");
			gj.add("Ahemdabad");
			gj.add("vadodara");
			gj.add("gandhinagar");
			gj.add("Bhuj");
			
		List jh=new ArrayList();
			jh.add("Ranchi");
			jh.add("Lohardaga");
			jh.add("Jamshedpur");
			jh.add("JhumriTelaiya");
			jh.add("Hazaribagh");
			
			List india=new ArrayList();
		    india.add(mh); 
		    india.add(gj); 
		    india.add(jh); 
		    
		List state1=new ArrayList();
		   state1.add("city1");
		   state1.add("city2");
		   state1.add("city3");
		   
	   List state2=new ArrayList();
		   state2.add("city4");
		   state2.add("city5");
		   state2.add("city6");
		   
	   List state3=new ArrayList();
		   state3.add("city7");
		   state3.add("city8");
		   state3.add("city9");
		 
	  List usa=new ArrayList();
	       usa.add(state1);
	       usa.add(state2);
	       usa.add(state3);
	       
	   List world=new ArrayList();
	      world.add(india);
	      world.add(usa);
	    
	      Iterator itr=world.iterator();
	      while(itr.hasNext())
	      {
	    	 List a=(List) itr.next();
	    	 Iterator itr1=a.iterator();
	    	 while(itr1.hasNext())
	    	 {
	    		 List a1=(List) itr1.next();
	    		 Iterator itr3=a1.iterator();
	    		 while(itr3.hasNext())
	    		 {
	    			 String a2=(String) itr3.next();
	    			 System.out.print("     "+a2);
	    			 
	    		 }

	    		 System.out.println();
	    	 }
	    	 System.out.println();
	      }	
	      
	      
	      }
	      }
