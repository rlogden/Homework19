package edu.dmacc.codedsm.hw19;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {

    public static void main(String[] args) {

        Function<String, Integer> myFunction = s -> s.length();
        BiFunction<String, String, Integer> myBiFunction = (a, b) -> a.length() + b.length();
        Consumer<String> myConsumer = x -> System.out.println(x);
        Supplier<String> mySupplier = () -> "Hello!";

        System.out.println(myFunction.apply("First"));
        System.out.println(myBiFunction.apply("Second", "Third"));
        myConsumer.accept("Fourth");
        System.out.println(mySupplier.get());

    }
}
