package com.social.tech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.social.tech.dto.ProfileDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "USERS")
public class Profile extends Auditable<String>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	private String userName;
	private String name;
	private String phone;
	private String email;
	
	public static Profile of(ProfileDTO userRequest) {
		Profile user =  new Profile();
		user.setName(userRequest.getName());
		user.setPhone(userRequest.getPhone());
		return user;
	}
}
