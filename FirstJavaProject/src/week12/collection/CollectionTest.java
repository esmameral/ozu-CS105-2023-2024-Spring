package week12.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		
		//arrayListExample();
		
		setExample();
		

	}
	public static void setExample() {
		Set<String> names =new HashSet<String>();
		names.add("Ali");
		names.add("ayse");
		names.add("zeki");
		for (String aName : names) {
			System.out.println(aName);
			
		}
	}
	
	public static void arrayListExample() {
		ArrayList<String> names =new ArrayList<String>();
		names.add("Ali");
		names.add("ayse");
		names.add(0,"zeki");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			
		}
	}

}
