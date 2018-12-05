package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * link tutorial
 * https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 * 
 * 
 * @author QINC1
 *
 */
public class CollectionStream {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("hoho");
		al.add("haha");
		al.add("heyhey");
		al.add("coucou");
		
		al
		.stream()
		.filter(s -> s.startsWith("h"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println)
		;
		
		Arrays.asList("a1", "a2", "a3")
	    .stream()
	    .findFirst()
	    .ifPresent(System.out::println);
		
		Stream.of("a1", "a2", "a3")
	    .findFirst()
	    .ifPresent(System.out::println); 
		
		IntStream.range(1, 4)
	    .forEach(System.out::println);
		
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .average()
	    .ifPresent(System.out::println);
		
		Stream.of(1.0, 2.0, 3.0)
	    .mapToInt(Double::intValue)
	    .mapToObj(i -> "a" + i)
	    .forEach(System.out::println);
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
	}
	
}
