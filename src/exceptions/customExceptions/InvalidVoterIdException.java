package exceptions.customExceptions;

import java.awt.*;

public class InvalidVoterIdException extends Exception {
    public InvalidVoterIdException(String message) {
        super(message);
    }
}

