package com.social.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.tech.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
