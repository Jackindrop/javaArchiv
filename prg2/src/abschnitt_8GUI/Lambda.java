package abschnitt_8GUI;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {
        BinaryOperator<Double> fsum= (x, y) -> x + y ;
        System.out.println(fsum.apply(3.5, 6.5)); // prints 9.0

        Consumer<String> printer= s -> System.out.println(s);
        printer.accept("Hello"); // prints Hello

        Supplier<Double> r = () -> Math.random() ;
        System.out.println(r.get());
// prints 0.20374821418062938 or other random value
    }
}
