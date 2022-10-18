package com.interview.singtel.animal.security;

import io.jsonwebtoken.lang.Assert;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class AuthContextHolder {

	private AuthContext authContext;

	public AuthContext getAuthContext() {
		if (authContext == null) {
			throw new NullPointerException();
		}
		return authContext;
	}

	public void setContext(AuthContext context) {
		Assert.notNull("AuthContext can not be null");
		this.authContext = authContext;
	}

}
