package java8features.funcp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFuncProg {
	
	public static void main(String args[]) {
		
		List<String> names = new ArrayList<>(Arrays.asList("nitin", "", "","goswami", "nitin", "kamboj", "shruti", "shruti", "shruti"));
		int count;
		
		List<String> dup = getDuplicate(names, (String p)-> p.isEmpty());
		
		//dup.forEach(p-> System.out.println("name dup:"+ p));
		
		testFreq(names);
		
		/* Set<String> set = names.stream()
            .collect(Collectors.toSet());
    		
		 
		 
		 Map map = set.stream()
            .collect(Collectors.toMap(Function.identity(),
                    str -> Collections.frequency(names, str))); 
		
		 	map.forEach((k,v)-> {
		 		System.out.println(k);
		 		System.out.println(v);
		 	});
		 	
		names.stream().filter(p->!p.equals("nitin")).collect(Collectors.toList()).forEach(p->System.out.println("Filtered: " + p));	

		
		*/
	}
	
	private static List<String> getDuplicate(List<String> names, Predicate<String> p) {
		List<String> duplicates = new ArrayList();
		for(String name: names) {
			if(!p.test(name.trim())) {
				//System.out.println("printing : "+ name);
				duplicates.add(name);
			}
		}
		
		return names;
		
	}
	
	public static void printPersonsWithPredicate(
		    List<String> roster, Predicate<String> tester ) {
		    for (String p : roster) {
		        if (!tester.test(p)) {
		           System.out.println("String empty");
		        }
		    }
		}
	
	static void testFreq(List<String> names) {
		Set<String> set = names.stream()
	            .collect(Collectors.toSet());
		set.stream().filter(s -> !s.isEmpty()).collect(Collectors.toMap(Function.identity(), o -> Collections.frequency(names, o))).
		forEach((key,v)->System.out.println("key : "+ key + " value: " + v));
		
	}
	
}
