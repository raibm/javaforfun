import functionalInterface.IsValidText;
import functionalInterface.MyFunctionalInterface;

import java.util.function.Predicate;

public class Play {

    public static void main(String[] args) {
        MyFunctionalInterface m = () -> System.out.println("Hello World!");
        m.function();

        String text = "Frog";
        String text2 = null;
        IsValidText<String> validator = t -> t != null && !t.isEmpty();

        System.out.println("Text is valid? "+validator.function(text));
        System.out.println("Text 2 is valid? "+validator.function(text2));

        String name = "Fire God";
        System.out.println("Is "+name+" an elemental god? "+ check(name, n -> n.endsWith("God")));
        name = "Fire Lord";
        System.out.println("Is "+name+" an elemental god? "+ check(name, n -> n.endsWith("God")));
    }

    public static <T> boolean check(T t, Predicate<T> lambda) {
        return lambda.test(t);
    }
}
