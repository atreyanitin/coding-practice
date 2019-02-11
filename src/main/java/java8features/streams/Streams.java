package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String args[]) {
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl", "", "");
		
		//Intermediate Operation(Filter/Sorted) and Terminal operation(forEach)
		strings.stream().filter(arg -> !arg.isEmpty()).sorted().forEach(System.out::println);
		
		//Parallel
		strings.parallelStream().filter(arg -> !arg.isEmpty()).sorted().forEach(System.out::println);

		//map
		strings.stream().filter(string -> !string.isEmpty()).map(String::toUpperCase).forEach(System.out::println);
		
		//collection
		strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toMap(Function.identity(), (String v)->v)).forEach((k,v)->System.out.println("Collection :: key: " + k + " value: " + v));
		
		//Reduction
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int sum = intList.parallelStream().reduce(0, Integer::sum);
		System.out.println("Reduction: SUM : " + sum);
		
		//Function
		testFunction();	
		
	}
	
	static void testFunction() {
		System.out.println("::Testing Function::");
		Function<Integer, Integer> add = x->x+1;
		add.apply(1);
	}
	
	
	/*static void testAllMatches(List<String> strings) {
		strings.stream().allMatch(arg->arg.equals(strings));
	}*/

}
