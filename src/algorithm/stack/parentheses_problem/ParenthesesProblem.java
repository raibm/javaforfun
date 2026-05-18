package algorithm.stack.parentheses_problem;

/**
 * A ideia aqui é usar um esquema de Pilha. Quando encontro um valor que seja de abertura, eu o armazeno
 * em um objeto chamado StackItem. Essa classe armazenará o char (valor de abertura) e uma referência ao
 * próximo item. Quando encontro um valor que seja de fechamento, verifico se meu StackItem atual é compatível,
 * se sim, eu deixo o programa prosseguir, trocando o topo atual pelo próximo item que ele o próprio topo armazena;
 * Se não, uso um break e interrompo o laço.
 */
public class ParenthesesProblem {

    public static void main(String[] args) {
        String values = "([)]";
        StackItem currentTop = new StackItem('0');
        boolean isValidParenheses = true;
        for (char value : values.toCharArray()) {
            if (isOpenning(value)) {
                StackItem newTop = new StackItem(value, currentTop);
                currentTop = newTop;
            } else {
                if (currentTop.isStackEmpty() || !isValidPair(value, currentTop.getValue())) {
                    isValidParenheses = false;
                    break;
                }
                currentTop = currentTop.getNextItem();
            }
        }
        isValidParenheses = isValidParenheses && currentTop.isStackEmpty();

        System.out.println("Is the parentheses combination valid? " + isValidParenheses);
    }

    private static boolean isOpenning(char value) {
        switch (value) {
            case '(':
            case '{':
            case '[':
                return true;
            default:
                return false;
        }
    }

    private static boolean isValidPair(char currentValue, char topValue) {
        switch (currentValue) {
            case ')':
                return topValue == '(';
            case '}':
                return topValue == '{';
            case ']':
                return topValue == '[';
            default:
                return false;
        }
    }
}
