import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class fizzBuzzTest {

	@Test
	public void _0is0() {
		assertThat(FizzBuzz.of(0), is("0"));
	}

	@Test
	public void _1is1() {
		assertThat(FizzBuzz.of(1), is("1"));
	}

	@Test
	public void _3isFizz() {
		assertThat(FizzBuzz.of(3), is("Fizz"));
	}

	@Test
	public void _5isBuzz() {
		assertThat(FizzBuzz.of(5), is("Buzz"));
	}

	@Test
	public void _6isFizz() {
		assertThat(FizzBuzz.of(6), is("Fizz"));
	}

	@Test
	public void _10isBuzz() {
		assertThat(FizzBuzz.of(10), is("Buzz"));
	}

	@Test
	public void _15isFizzBuzz() {
		assertThat(FizzBuzz.of(15), is("FizzBuzz"));
	}

}
