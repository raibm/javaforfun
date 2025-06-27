package algorithm.stack.parentheses_problem;

public class StackItem {
    private char value;
    private StackItem nextItem;

    public StackItem(char value) {
        this.value = value;
    }

    public StackItem(char value, StackItem nextItem) {
        this.value = value;
        this.nextItem = nextItem;
    }

    public char getValue() {
        return value;
    }

    public StackItem getNextItem() {
        return nextItem;
    }

    public boolean isStackEmpty() {
        return value == '0';
    }
}
