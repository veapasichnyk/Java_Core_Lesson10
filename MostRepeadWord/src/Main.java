import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {

        System.out.println ( "This program find the word that is most common in the sentence." +
                             " Please, enter some sentence: " );

        Scanner sc   = new Scanner ( System.in );
        String  sentence = sc.nextLine ( );

        MostRepeadWord mostRepeadWord = new MostRepeadWord ();

        System.out.println ( mostRepeadWord.findWord ( sentence ) + " is a  most frequent word ");

    }
}
