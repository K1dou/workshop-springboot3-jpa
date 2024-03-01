package com.educandoweb.curso.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -6077540139511684477L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. id "+id);
    }
}
