import functionalInterface.IsValidText;
import functionalInterface.MyFunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Play {
    public static void main(String[] args) {
        Play p = new Play();
//        p.PLAY_functionalInterface();
//        p.PLAY_predicateWithLambda();
//        p.PLAY_Predicate();
        p.PLAY_BiPredicate();
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

    /**
     * Predicates always use the function '.test(t)'
     */
    public void PLAY_Predicate() {
        Predicate<String> isSamurai = p -> p.equals("samurai");
        String t1 = "centurion";
        System.out.println("Is "+t1+" an oriental warrior? "+ isSamurai.test(t1));
        t1 = "samurai";
        System.out.println("Is "+t1+" an oriental warrior? "+ isSamurai.test(t1));
    }

    public void PLAY_BiPredicate() {
        BiPredicate<String, Integer> bp = (s, i) -> s.startsWith(i.toString());

        String warrior = "1warrior";
        System.out.println(bp.test(warrior, 1));
        System.out.println(bp.test(warrior, 5));
    }


    public static <T> boolean check(T t, Predicate<T> lambda) {
        return lambda.test(t);
    }
}
