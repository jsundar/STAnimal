package com.interview.singtel.animal.exception;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ApplicationException extends RuntimeException {

	private final UUID id;

	private final String code;

	private final String errorMessage;

	public ApplicationException(ApplicationError error) {
		this.id = UUID.randomUUID();
		this.code = error.getCode();
		this.errorMessage = error.getMessage();
	}

	public ApplicationException(ApplicationError error, Throwable e) {
		super(e);
		this.id = UUID.randomUUID();
		this.code = error.getCode();
		this.errorMessage = error.getMessage();

	}

}
