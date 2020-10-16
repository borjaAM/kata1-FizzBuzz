package org.example;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_Test {

    private FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void should_return_number_when_is_not_3_or_5_multiple(){
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void should_return_Fizz_when_is_multiple_of_3(){
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(9)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_when_is_multiple_of_5(){
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_FizzBuzz_when_is_multiple_of_15(){
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.of(30)).isEqualTo("FizzBuzz");
    }

}
