package rubix.exeptions;

public class RetardException extends Exception {

    public RetardException(String message) {
        super("you are retarded: " + message);
    }
}
