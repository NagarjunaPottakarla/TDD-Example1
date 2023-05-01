import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.FizzBuzz;




public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}
	@Test
	public void testNumber() {
		int number = 1;
		String numberReturn = fizzBuzz.play(number);
		Assert.assertEquals("1", numberReturn);
	}

	@Test
	public void testFizz() {

		int number = 3;
		String numberReturn = fizzBuzz.play(number);
		Assert.assertEquals("Fizz", numberReturn);
	}

	@Test
	public void testFizzDivisibleBy3() {
		int number = 6;
		String numberReturn = fizzBuzz.play(number);
		Assert.assertEquals("Fizz", numberReturn);
	}

	@Test
	public void testBuzz() {
		int number = 5;
		String numberReturn = fizzBuzz.play(number);
		Assert.assertEquals("Buzz", numberReturn);
	}

	@Test
	public void testBuzzDivisibleBy5() {
		int number = 10;
		String numberReturn = fizzBuzz.play(number);
		Assert.assertEquals("Buzz", numberReturn);
	}
}
