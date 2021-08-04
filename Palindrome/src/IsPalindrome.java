import java.util.Scanner;
public class IsPalindrome {
    public String word;

    public IsPalindrome () {

    }

    public void checkWord ( String word ) {
        try {
            checkAgruments ( word );
        }
        catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static String reverse (String word) {
        String reverce = "";
        reverce = new StringBuilder(word).reverse ().toString ();
        return reverce;
    }

    public void isPalindrome (String word) {
        if (word.equalsIgnoreCase ( reverse ( word ) )){
            System.out.println ("This word is palidrome" );
        } else {
            System.out.println ("This word isn`t palidrome" );
        }
    }

    public void checkAgruments ( String word ) throws MyException {
        if ( ( word.length ( ) < 5 ) || ( word.length ( ) > 5 ) ) {
            throw new IllegalArgumentException ( "You entered word length is more than 5 or less than 5 characters" );
        } else {
            reverse ( word );
            isPalindrome ( word);
        }
    }
}
