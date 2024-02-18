package java_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_from_list {
	
	public static void main(String[] args) {
		
		ArrayList <String> name = new ArrayList<>();
		
		name.add("harsh");
		name.add("sourabh");
		name.add("harsh");
		name.add("sourabh");
		
		Set<String> duplicates = new HashSet<>();
		
		for(String names : name) 
		{
			if(duplicates.add(names)==false)	
			System.out.println(names);
	}

}
}