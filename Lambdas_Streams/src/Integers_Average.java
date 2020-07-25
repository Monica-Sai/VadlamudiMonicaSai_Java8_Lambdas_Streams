import java.util.*; 
import java.util.stream.IntStream; 

public class Integers_Average {
	 public static void main(String[] args) 
	    {
		 	int a[]= {11,2,5,44,6,7,88,9};
	        IntStream stream = IntStream.of(a); 
	        OptionalDouble obj = stream.average(); 
	        if (obj.isPresent()) { 
	            System.out.println(obj.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}