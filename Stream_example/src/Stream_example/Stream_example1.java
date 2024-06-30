package Stream_example;
import java.util.*;
import java.util.stream.*;

public class Stream_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream <Integer> s = Stream.of(1,2,3,4,5);
		
		s.forEach(System.out::println);
		
		Integer [] arr1 = {11,12,13,14,15};
		Stream sarr = Arrays.stream(arr1);
	    System.out.println(  sarr.count());
		
		Arrays.stream(arr1).forEach(System.out::println);

	}

}
