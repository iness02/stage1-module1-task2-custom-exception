package com.epam.mjc;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class CustomIllegalArgumentException extends IllegalArgumentException{

    public CustomIllegalArgumentException() {
    }

    public CustomIllegalArgumentException(String s) {
        super(s);
    }

    public CustomIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomIllegalArgumentException(Throwable cause) {
        super(cause);
    }
}
