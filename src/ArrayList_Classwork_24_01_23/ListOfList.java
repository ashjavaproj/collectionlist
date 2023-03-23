package ArrayList_Classwork_24_01_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfList {
	public static void main(String[] args) {
		List mh=new ArrayList();
		mh.add("pune");
		mh.add("Mumbai");
		
		List gj=new ArrayList();
		gj.add("Surat");
		gj.add("Ahemdabad");
		
		List india=new ArrayList();
		india.add(mh);
		india.add(gj);
		
		Iterator itr1=india.iterator();
		while(itr1.hasNext())
		{
			List a=(List) itr1.next();
		Iterator itr2=a.iterator();
			while(itr2.hasNext())
			{
			String	aa=(String) itr2.next();
			System.out.println(aa);
			
		    }
		}
		
			
			
	}
	

}



