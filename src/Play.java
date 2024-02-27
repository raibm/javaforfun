import functionalInterface.MyFunctionalnterface;

public class Play {

    public static void main(String[] args) {
        MyFunctionalnterface m = () -> {System.out.println("Hello World!");};
        m.function();
    }
}
