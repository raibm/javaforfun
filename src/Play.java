import functionalInterface.IsValidText;
import functionalInterface.MyFunctionalInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;

public class Play {
    public static void main(String[] args) {
        Play p = new Play();
//        p.PLAY_functionalInterface();
//        p.PLAY_predicateWithLambda();
//        p.PLAY_Predicate();
//        p.PLAY_BiPredicate();
//        p.PLAY_Supplier();
//        p.PLAY_Consumer();
//        p.PLAY_BIConsumer();
//        p.PLAY_Function();
        p.PLAY_BiFunction();
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

    public void PLAY_Supplier() {
        Supplier<Double> random = Math::random;
        Supplier<String> hello = () -> "Hello World!";

        System.out.println(random.get());
        System.out.println(hello.get());
    }

    public void PLAY_Consumer() {
        List<String> list = new ArrayList<>();
        Consumer<String> consumer = System.out::println;
        list.add("First String");
        list.add("Second String");
        list.forEach(consumer);
    }

    public void PLAY_BIConsumer() {
        HashMap<String, Integer> hashMap = new HashMap<>();

        BiConsumer<String, Integer> biConsumer = (k, v) -> hashMap.put(k,v);
        biConsumer.accept("Kansas", 1);
        biConsumer.accept("Nebraska", 2);
        System.out.println(hashMap);


        BiConsumer<String, Integer> showValueAndIndex = (v, i) -> System.out.println("["+i+"] "+v);
        hashMap.forEach(showValueAndIndex);
    }

    public void PLAY_Function() {
        Function<String, Integer> stringLength = s -> s.length();
        List<String> list = new ArrayList<>();
        list.add("First String");
        list.add("Woooahh");
        list.forEach(s -> System.out.println(stringLength.apply(s)));
    }

    public void PLAY_BiFunction() {
        BiFunction<String, String, String> joinStrings = (s1, s2) -> s2.concat(s1);
        String firstName = "Nikola ";
        String lastName = "Tesla";
        String fullName = joinStrings.apply(lastName, firstName);

        System.out.println(fullName);
    }

    public static <T> boolean check(T t, Predicate<T> lambda) {
        return lambda.test(t);
    }
}
