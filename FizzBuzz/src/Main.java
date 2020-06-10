
public class Main {
	
	public String fizzBuzz(int i) {
		if (i%3==0 || i%5==0) {
			if (i%3==0 && i%5==0) {
				return("FizzBuzz");
			}
			else if (i%3==0) {
				return("Fizz");
			}
			else {
				return("Buzz");
			}
		}
		else {
			return(Integer.toString(i));
		}
	}

}
