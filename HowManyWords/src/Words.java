public class Words {

    public int HowManyWords (String text) {
        int count = 0;
        if (text.length () != 0) {
            count++;
            for (int i = 0; i < text.length (); i++) {
                if (text.charAt (i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }
}
