import functionalInterface.IsValidText;
import functionalInterface.MyFunctionalInterface;

import java.util.function.Predicate;

public class Play {
    public static void main(String[] args) {
        Play p = new Play();
        p.PLAY_functionalInterface();
        p.PLAY_predicateWithLambda();
    }

    public void PLAY_functionalInterface() {
        MyFunctionalInterface m = () -> System.out.println("Hello World!");
        IsValidText<String> validator = t -> t != null && !t.isEmpty();

        m.function();

        String text = "Frog";
        System.out.println("Text is valid? "+validator.function(text));
        text = null;
        System.out.println("Text 2 is valid? "+validator.function(text));
    }

    public void PLAY_predicateWithLambda() {
        String name = "Fire God";
        System.out.println("Is "+name+" an elemental god? "+ check(name, n -> n.endsWith("God")));
        name = "Fire Lord";
        System.out.println("Is "+name+" an elemental god? "+ check(name, n -> n.endsWith("God")));
    }

    public static <T> boolean check(T t, Predicate<T> lambda) {
        return lambda.test(t);
    }
}
