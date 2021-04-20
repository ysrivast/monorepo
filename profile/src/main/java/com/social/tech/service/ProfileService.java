package com.social.tech.service;

import java.util.List;

import com.social.tech.entity.Profile;

public interface ProfileService {

	void createInBatch(List<Profile> users);

	Profile create(Profile profile);

}