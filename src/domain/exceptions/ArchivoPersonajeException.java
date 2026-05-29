package domain.exceptions;

public class ArchivoPersonajeException extends Exception{
    public ArchivoPersonajeException(
        final String mensaje,
        final Throwable causa
        ){
        super(mensaje,causa);
    }
}
