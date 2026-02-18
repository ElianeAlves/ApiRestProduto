package com.eliane.fullstack.exception;

import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.List;
import java.util.stream.Collectors;

@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException exception) {

        List<String> erros = exception.getConstraintViolations()
                .stream()
                .map(v -> v.getMessage())
                .collect(Collectors.toList());

        return Response.status(Response.Status.BAD_REQUEST)
                .entity(erros)
                .build();
    }
}
