package com.social.tech.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "of")
public class FieldViolation {

	private String field;
	private String description;
}
