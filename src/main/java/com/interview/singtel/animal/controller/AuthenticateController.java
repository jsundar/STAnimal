package com.interview.singtel.animal.controller;

import com.interview.singtel.animal.security.AuthContext;
import com.interview.singtel.animal.security.AuthContextHolder;
import com.interview.singtel.animal.security.TokenGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticateController {

	private final TokenGenerator tokenGenerator;

	private final AuthContextHolder authContextHolder;

	@GetMapping("/authenticate")
	@ResponseStatus(HttpStatus.OK)
	public String getToken(@RequestParam String username) {
		String token = tokenGenerator.generateToken(username);
		authContextHolder.setContext(AuthContext.builder().accessToken(token).username(username).build());
		return token;
	}

}
