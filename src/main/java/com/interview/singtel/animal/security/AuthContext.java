package com.interview.singtel.animal.security;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthContext {

	String username;

	String accessToken;

}
