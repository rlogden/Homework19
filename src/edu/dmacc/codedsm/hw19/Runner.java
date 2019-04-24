package edu.dmacc.codedsm.hw19;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {

    public static Function<String, Integer> myFunction = s -> s.length();
    public static BiFunction<String, String, Integer> myBiFunction = (a, b) -> a.length() + b.length();
    public static Consumer<String> myConsumer = x -> System.out.println(x);
    public static Supplier<String> mySupplier = () -> "Hello!";

    public static void main(String[] args) {
        System.out.println(myFunction.apply("First"));
        System.out.println(myBiFunction.apply("Second", "Third"));
        myConsumer.accept("Fourth");
        System.out.println(mySupplier.get());
    }
}
