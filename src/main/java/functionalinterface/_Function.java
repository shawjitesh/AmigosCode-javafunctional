package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Function - takes one argument and produces one result
        int increment1 = incrementByOne(0);
        System.out.println(increment1);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        // Function chaining
        Function<Integer, Integer> incrementByOneAndThenMultiplyByTenFunction = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(incrementByOneAndThenMultiplyByTenFunction.apply(1));

        // BiFunction - takes two arguments and produces one result
        System.out.println(incrementByOneAndMultiply(2, 10));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(2, 10));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numberToMultiplyBy) {
        return (number + 1) * numberToMultiplyBy;
    }
}
