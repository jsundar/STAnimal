package com.interview.singtel.animal.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApplicationError {

	BAD_REQUEST("400", "Invalid inputs."), UN_AUTHORIZED("401", "UnAuthorized request"),
	FORBIDDEN("403", "User does not have permission"), INTERNAL_SERVER_ERROR("500", "Internal server Error");

	private final String code;

	private final String message;

}
