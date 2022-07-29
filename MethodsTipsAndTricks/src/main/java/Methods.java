import java.util.Scanner;

public class Methods {

    protected static void run ( ) {
        while ( true ) {
            System.out.println( "waiting for input ( new or exit ) : " );
            Scanner scanner = new Scanner( System.in );
            String input = scanner.nextLine();
            handleInput( input );
        }
    }

    private static void handleInput ( String input ) {
        switch ( input ) {
            case "new" -> System.out.println( "neues Objekt wurde erstellt" );
            case "exit" -> System.exit( 0 );
            default -> System.out.println( "Falsche Eingabe" );
        }
    }

    public static void saySomething ( ) {
        System.out.println( "Something" );
    }

    public static void saySomething ( String s ) {
        System.out.println( s );
    }

    public static void saySomething ( String s, int counter ) {
        for ( int i = 0; i < counter; i++ ) {
            System.out.println( s );
        }
    }
}
