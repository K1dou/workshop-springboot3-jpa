package com.educandoweb.curso.services.exceptions;

import java.io.Serial;

public class DatabaseException extends  RuntimeException{
    @Serial
    private static final long serialVersionUID = -6090936060607618211L;

    public DatabaseException(String message) {
        super(message);
    }
}


