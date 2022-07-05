package com.vkt.group.ess.api.exception;
 
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
 
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException 
{
	private static final long serialVersionUID = 7140655991231184093L;

	public NotFoundException(String exception) {
        super(exception);
    }

}