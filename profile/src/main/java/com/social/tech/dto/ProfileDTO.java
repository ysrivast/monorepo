package com.social.tech.dto;

import java.io.Serializable;

import com.social.tech.entity.Profile;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(staticName = "of", access = AccessLevel.PRIVATE)
@Setter
@Getter
public class ProfileDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userName;
	private String name;
	private String phone;
	private String email;

	public static ProfileDTO of(Profile user) {
		return of(user.getId(), user.getUserName(), user.getName(), user.getPhone(), user.getEmail());

	}
}
