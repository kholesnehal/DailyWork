package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AdharNoWithPartyMap {

	public static void main(String[] args) {
		HashMap<String,String>str=new HashMap<String,String>();
		
		str.put("84655427465", "BJP");
		str.put("76545678967", "Congress");
	    str.put("37555678953", "Rastravadi");
	    str.put("98765432108", "BJP");
	    str.put("86538653845", "Congress");
	    
	    HashMap<String,Integer>m=new HashMap<>();
//	    Collection c=str.values();
//	    Iterator<String>itr=c.iterator();
//	    while(itr.hasNext())
//	    {   int count=0;
//	    	String st=itr.next();
//	    	Collection c1=str.values();
//	    	Iterator<String>itr1=c1.iterator();
//	    	while(itr1.hasNext())
//	    	{
//	    	
//	    		String st1=itr1.next();
//	    		if(st.equals(st1))
//	    		{
//	    			count++;
//	    		}
//	    	}
//	    	m.put(st, count);
//	    }
//	    //
	    Set<Map.Entry<String, String>>entryset=str.entrySet();
	    Iterator<Map.Entry<String,String>>itrr=entryset.iterator();
	    while(itrr.hasNext())
	    {
	    	Map.Entry<String, String> entry=itrr.next();
	    	String sp1=entry.getValue();
	    	int count=0;
	    	Set<Map.Entry<String,String>>entry1=str.entrySet();
		    Iterator<Map.Entry<String,String>>itrr1=entryset.iterator();
		    while(itrr1.hasNext())
		    {
		    	 Map.Entry<String, String> entry12=itrr1.next();
		    	 String sp2=entry12.getValue();
		    	if(sp1.equals(sp2))
		    	{
		    		count++;
		    	}
		    	
		    }
		    m.put(sp1, count);
	    	
	    }
		for(Map.Entry<String, Integer>e:m.entrySet())
		{
			System.out.println(e.getKey()+"="+e.getValue());

		}
		

	}

}
