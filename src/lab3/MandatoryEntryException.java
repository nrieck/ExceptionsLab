/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author nrieck
 */
public class MandatoryEntryException extends Exception{
    private final static String MSG = "You must enter a value for all input fields";
    private Exception cause;

    public MandatoryEntryException() {
        super(MSG);
    }

    public MandatoryEntryException(String message) {
        super(MSG);
    }

    public MandatoryEntryException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public MandatoryEntryException(Throwable cause) {
        super(MSG);
    }

    public MandatoryEntryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(MSG, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
