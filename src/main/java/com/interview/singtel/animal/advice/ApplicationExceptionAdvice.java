package com.interview.singtel.animal.advice;

import com.interview.singtel.animal.exception.ApplicationError;
import com.interview.singtel.animal.exception.ApplicationException;
import com.interview.singtel.animal.exception.ErrorMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@Slf4j
@RestControllerAdvice
public class ApplicationExceptionAdvice {

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorMessage handleIllegalArgumentException(IllegalArgumentException e, WebRequest request) {
		return ErrorMessage.of(new ApplicationException(ApplicationError.BAD_REQUEST, e));
	}

	@ExceptionHandler(ApplicationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorMessage handleApplicationException(ApplicationException e, WebRequest request) {
		return ErrorMessage.of(ApplicationError.BAD_REQUEST);
	}

}
