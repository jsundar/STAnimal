package com.interview.singtel.animal.exception;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
@Builder
public class ErrorMessage {

	private String id;

	private Date timestamp;

	private String errorDescription;

	private String exceptionErrorMsg;

	public static ErrorMessage of(ApplicationException e) {
		return ErrorMessage.builder().timestamp(new Date()).id(e.getId().toString())
				.errorDescription(e.getErrorMessage()).errorDescription(e.getMessage()).build();
	}

	public static ErrorMessage of(ApplicationError error) {
		return ErrorMessage.builder().timestamp(new Date()).id(UUID.randomUUID().toString())
				.errorDescription(error.getMessage()).build();
	}

}
