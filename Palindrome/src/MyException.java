public class MyException extends RuntimeException {

    public MyException ( ) {
        super ( );
    }

    public MyException ( String message , Throwable cause ) {
        super ( message , cause );
    }

    public MyException ( String string ) { }

}

