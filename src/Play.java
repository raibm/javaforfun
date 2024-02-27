import functionalInterface.Check;
import functionalInterface.IsValidText;
import functionalInterface.MyFunctionalInterface;

public class Play {

    public static void main(String[] args) {
        MyFunctionalInterface m = () -> {System.out.println("Hello World!");};
        m.function();

        String text = "Frog";
        String text2 = null;
        IsValidText<String> validator = t -> t != null && !t.isEmpty();

        System.out.println("Text is valid? "+validator.function(text));
        System.out.println("Text 2 is valid? "+validator.function(text2));

        
    }
}
