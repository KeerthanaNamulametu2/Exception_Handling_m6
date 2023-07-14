package com.company;

import java.io.IOException;

public class ProcessDataException extends RuntimeException {

    private String errorValue;

    public ProcessDataException() {
        super();
    }

    public ProcessDataException(String message) {
        super(message);
    }

    public ProcessDataException(Exception e) {
        super(e);
    }

    public String getErrorValue() {
        return errorValue;
    }

    public void setErrorValue(String errorValue) {
        this.errorValue = errorValue;
    }
}