package com.vkt.group.ess.api.exception;
 
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.vkt.group.ess.api.utils.Constants;
 
@SuppressWarnings({"unchecked","rawtypes"})
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler 
{
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
    	ex.printStackTrace();
    	ex.getMessage();
        ErrorResponse error = new ErrorResponse(Constants.SERVER_ERROR, Constants.SERVER_ERROR);
        return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
 
    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(NotFoundException ex, WebRequest request) {
    	ex.printStackTrace();
        ErrorResponse error = new ErrorResponse(Constants.RECORD_NOT_FOUND, ex.getLocalizedMessage());
        return new ResponseEntity(error, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(UnauthorizedException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(UnauthorizedException ex, WebRequest request) {
    	ex.printStackTrace();
        ErrorResponse error = new ErrorResponse(Constants.UNAUTHORIZED, ex.getLocalizedMessage());
        return new ResponseEntity(error, HttpStatus.UNAUTHORIZED);
    }
 
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String details = "";
        for(ObjectError error : ex.getBindingResult().getAllErrors()) {
        	details = error.getDefaultMessage();
        }
        ex.printStackTrace();
        ErrorResponse error = new ErrorResponse(Constants.VALIDATION_FAIL, details);
        return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
    }
}