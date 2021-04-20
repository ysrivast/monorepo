package com.social.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.tech.entity.Profile;
import com.social.tech.repository.ProfileRepository;

import lombok.extern.slf4j.Slf4j;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public void createInBatch(List<Profile> users) {
		profileRepository.saveAll(users);
	}

	@Override
	public Profile create(Profile profile) {
		return profileRepository.save(profile);
	}

}
