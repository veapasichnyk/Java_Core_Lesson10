public class MostRepeadWord {

    public String findWord ( String s ) {

        String [] str      = s.split ( "\\W+" );

        int [] howMuch  = new int[ str.length ];
        int maxCount = 0;
        int index    = 0;

        for ( int i = 0 ; i < str.length ; i++ )

            for ( int j = 0 ; j < str.length ; j++ )

                if ( str[ i ].equals ( str[ j ] ) ) howMuch[ i ]++;

        for ( int i = 0 ; i < howMuch.length ; i++ )
            if ( howMuch[ i ] > maxCount ) {
                maxCount = howMuch[ i ];
                index    = i;
            }
            System.out.print ( maxCount + " - " );

        return str[ index ];

    }
}
