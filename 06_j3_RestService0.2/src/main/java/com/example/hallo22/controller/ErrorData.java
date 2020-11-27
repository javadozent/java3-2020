package com.example.hallo22.controller;



import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.Serializable;

/**
 * Klasse für Fehlermeldungen im json-Format
 */
public class ErrorData  implements Serializable {
    private String errorMessage;

    public ErrorData(String errrorMessage) {
        this.errorMessage = errrorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrrorMessage(String errrorMessage) {
        this.errorMessage = errrorMessage;
    }



}
