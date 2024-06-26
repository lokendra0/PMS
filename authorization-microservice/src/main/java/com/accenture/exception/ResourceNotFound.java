package com.accenture.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResourceNotFound extends RuntimeException {

	private static final long serialVersionUID = 210649836231358204L;
	private String message;
	public ResourceNotFound() {
		super();
	}
	public ResourceNotFound(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
