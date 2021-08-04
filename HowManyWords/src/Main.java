import java.util.Scanner;

public class Main {
    public static void main ( String arg[] ) {

        System.out.println ( "This program count how many words in your text. Please, enter some text: " );

        Scanner sc   = new Scanner ( System.in );
        String  text = sc.nextLine ( );

        Words howManyWords = new Words ( );

        System.out.println ( "In your text " + howManyWords.HowManyWords ( text ) + " words" );
    }
}
