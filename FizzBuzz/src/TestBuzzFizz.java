import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBuzzFizz {

	@Test
	void test() {
		Main main = new Main();
		assertEquals(main.fizzBuzz(3),"Fizz");
		assertEquals(main.fizzBuzz(5),"Buzz");
		assertEquals(main.fizzBuzz(15),"FizzBuzz");
	}

}
