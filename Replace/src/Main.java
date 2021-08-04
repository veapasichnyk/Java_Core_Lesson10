import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {

        System.out.println ("Please, enter some sentence: " );
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        Replace replace = new Replace ();

        System.out.println ( replace.checkSentence ( sentence ) );

    }
}
