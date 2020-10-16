package org.example;

public class FizzBuzz {

    public String of(int number) {
        if (is(number).multipleOf(15)) return "FizzBuzz";
        if (is(number).multipleOf(3)) return "Fizz";
        if (is(number).multipleOf(5)) return "Buzz";
        return String.valueOf(number);
    }

    private Evaluator is(int number) {
        return factor -> number % factor == 0;
    }

    private interface Evaluator {
        boolean multipleOf(int factor);
    }
}
