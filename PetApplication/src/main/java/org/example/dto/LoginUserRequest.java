package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginUserRequest {

	@JsonProperty
	private String username;

	@JsonProperty
	private String password;
}
