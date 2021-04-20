package com.social.tech.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.tech.dto.ProfileDTO;
import com.social.tech.entity.Profile;
import com.social.tech.service.ProfileService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/profiles")
@Slf4j
@Validated
public class ProfileController {

	@Autowired
	private ProfileService userService;

	@PutMapping(path = "/{userId}/photo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> create(@NotNull @RequestBody final ProfileDTO profileDTO) {
		log.info("create user request");
		userService.create(Profile.of(profileDTO));
		return ResponseEntity.ok().build();
	}
}
