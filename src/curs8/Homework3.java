package curs8;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {

	public static void main(String[] args) {
		// verificare arrayList1 se afla in arrayList2
		
		List<String> list1 = new ArrayList<String>() ;
		
		list1.add("Product1");
		list1.add("Product2");
		list1.add("Product3");
		list1.add("Product4");
		list1.add("Product5");
		
		List<String> list2 = new ArrayList<String>() ;
		
		list2.add("Product1");
		list2.add("Product2");
		list2.add("Product6");
		list2.add("Product4");
		list2.add("Product8");
		
		List<String> result = new ArrayList<String>();
			
		for(String elem :list1) {
			if(list2.contains(elem)){ result.add("Yes");}
			else result.add("No");
		}
		
		System.out.println(result);
				
	}
}
