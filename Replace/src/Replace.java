public class Replace {

    public String checkSentence ( String sentence) {
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ( (chars[i] == 'e') || (chars[i] == 'o') || (chars[i] == 'a')
                 || (chars[i] == 'y') || (chars[i] == 'i') || (chars[i] == 'u')
                 || (chars[i] == 'E') || (chars[i] == 'O') || (chars[i] == 'A')
                 || (chars[i] == 'Y') || (chars[i] == 'I') || (chars[i] == 'U')) {

                chars[i] = '-';
            }
        }

        return new String(chars);
    }
}
