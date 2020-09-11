package animal.exception;

public class NotaNoValidaException extends RuntimeException {

    public NotaNoValidaException(){
    }

    public NotaNoValidaException(String message){
        super(message);
    }
}
