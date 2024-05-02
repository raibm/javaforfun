package leetcode;

public class Challenge_ReversePrefixWord {

    public static void main(String[] args) {
        reversePrefix("afçeoçeça", 'z');
    }

    public static String reversePrefix(String word, char ch) {
        char[] chars = new char[word.length()];
        word.getChars(0, word.length(), chars, 0);
        var finalIndex = 0;
        var startIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                finalIndex = i;
                break;
            }
        }

        if (startIndex < finalIndex) {
            word = "";
            while (startIndex < finalIndex) {
                var temp = chars[finalIndex];
                chars[finalIndex] = chars[startIndex];
                chars[startIndex] = temp;
                startIndex++;
                finalIndex--;
            }
            for (int i = 0; i < chars.length; i++) {
                word = word.concat("" + chars[i]);
            }
        }

        return word;
    }


}
