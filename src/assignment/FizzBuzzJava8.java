package assignment;

public class FizzBuzzJava8 {
	
	public static void main(String[] args) {
		java.util.stream.IntStream.rangeClosed(1, 100).mapToObj(index -> index % 15 == 0 ? "FizzBuzz" : (
			index % 3 == 0 ? "Fizz" : 
			index % 5 == 0 ? "Buzz" : 
			Integer.toString(index))
		).forEach(System.out::println);
	}

}
