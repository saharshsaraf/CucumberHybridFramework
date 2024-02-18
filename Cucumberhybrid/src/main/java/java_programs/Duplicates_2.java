package java_programs;

import java.util.*;
public class Duplicates_2 {

public static void main(String[]args)
{

ArrayList <String> list = new ArrayList<>();

list.add("Saharsh");
list.add("shete");
list.add("Saharsh");
list.add("sourabh");



Set<String> duplicates = new HashSet<>();

for(String names : list){
if(duplicates.add(names)==false)
	System.out.println(names);
}
}
}

