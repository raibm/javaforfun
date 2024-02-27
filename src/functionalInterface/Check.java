package functionalInterface;

import java.util.function.Predicate;

@FunctionalInterface
public interface Check<T> {
    boolean f(T t, Predicate<T> lambda);
}
