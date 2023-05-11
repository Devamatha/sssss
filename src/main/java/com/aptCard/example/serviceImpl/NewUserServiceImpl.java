package com.aptCard.example.serviceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aptCard.example.entity.NewUser;
import com.aptCard.example.repository.NewUserRepository;
import com.aptCard.example.service.NewUserService;

@Service
public class NewUserServiceImpl implements NewUserService {

	@Autowired
	private NewUserRepository newUserRepository;

	@Override
	public NewUser saveUser(NewUser user) {
		return newUserRepository.save(user);
	}

	@Override
	public List<NewUser> getAllUsers() {
		return newUserRepository.findAll();
	}

	@Override
	public void deleteUserById(int id) {
		newUserRepository.deleteById(id);
	}

	@Override
	public NewUser findById(int id) {
		Optional<NewUser> person = newUserRepository.findById(id);
		return person.orElse(null);
	}

	@Override
	public List<NewUser> findByFullName(String fullName) {
		return newUserRepository.findByFullName(fullName);
	}

	@Override
	public List<NewUser> findByDesignation(String designation) {
		return newUserRepository.findByDesignation(designation);
	}

	@Override
	public List<NewUser> findByPhoneNumber(String phoneNumber) {
		return newUserRepository.findByPhoneNumber(phoneNumber);
	}

	@Override
	public List<NewUser> findByWhatsappNumber(String whatsappNumber) {
		return newUserRepository.findByWhatsappNumber(whatsappNumber);
	}

	@Override
	public List<NewUser> findByEmail(String email) {
		return newUserRepository.findByEmail(email);
	}

	@Override
	public List<NewUser> findByWebsiteUrl(String websiteUrl) {
		return newUserRepository.findByWebsiteUrl(websiteUrl);
	}

	@Override
	public List<NewUser> findByInstagramUrl(String instagramUrl) {
		return newUserRepository.findByInstagramUrl(instagramUrl);
	}

	@Override
	public List<NewUser> findByFacebookUrl(String facebookUrl) {
		return newUserRepository.findByFacebookUrl(facebookUrl);
	}

	@Override
	public List<NewUser> findByPinterestUrl(String pinterestUrl) {
		return newUserRepository.findByPinterestUrl(pinterestUrl);
	}

	@Override
	public List<NewUser> findByLinkedinUrl(String linkedinUrl) {
		return newUserRepository.findByLinkedinUrl(linkedinUrl);
	}

	@Override
	public List<NewUser> findByYoutubeUrl(String youtubeUrl) {
		return newUserRepository.findByYoutubeUrl(youtubeUrl);
	}

	@Override
	public List<NewUser> findByTwitterUrl(String twitterUrl) {
		return newUserRepository.findByTwitterUrl(twitterUrl);
	}

	@Override
	public void updateUser(int id, MultipartFile file, NewUser newUser) throws IOException {
		NewUser existingUser = newUserRepository.findById(id).orElseThrow();

		existingUser.setFullName(newUser.getFullName());
		existingUser.setDesignation(newUser.getDesignation());
		existingUser.setPhoneNumber(newUser.getPhoneNumber());
		existingUser.setWhatsappNumber(newUser.getWhatsappNumber());
		existingUser.setEmail(newUser.getEmail());
		existingUser.setWebsiteUrl(newUser.getWebsiteUrl());
		existingUser.setInstagramUrl(newUser.getInstagramUrl());
		existingUser.setFacebookUrl(newUser.getFacebookUrl());
		existingUser.setPinterestUrl(newUser.getPinterestUrl());
		existingUser.setLinkedinUrl(newUser.getLinkedinUrl());
		existingUser.setYoutubeUrl(newUser.getYoutubeUrl());
		existingUser.setTwitterUrl(newUser.getTwitterUrl());
		existingUser.setAboutUs(newUser.getAboutUs());
		if (file != null) {
			byte[] pictureBytes = file.getBytes();
			existingUser.setLogo(pictureBytes);
		}
		newUserRepository.save(existingUser);
	}

}