package com.aptCard.example.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aptCard.example.entity.NewUser;
import com.aptCard.example.serviceImpl.NewUserServiceImpl;

@RestController
public class NewUserController {

	@Autowired
	private NewUserServiceImpl newUserServiceImpl;

	@PostMapping("/upload")
	public ResponseEntity<?> uploadResume(@RequestParam("file") MultipartFile file,
			@RequestParam("fullName") String fullName, @RequestParam("designation") String designation,
			@RequestParam("phoneNumber") String phoneNumber, @RequestParam("whatsappNumber") String whatsappNumber,
			@RequestParam("linkedinUrl") String linkedinUrl, @RequestParam("location") String location,
			@RequestParam("email") String email, @RequestParam("websiteUrl") String websiteUrl,
			@RequestParam("instagramUrl") String instagramUrl, @RequestParam("facebookUrl") String facebookUrl,
			@RequestParam("pinterestUrl") String pinterestUrl, @RequestParam("youtubeUrl") String youtubeUrl,
			@RequestParam("twitterUrl") String twitterUrl, @RequestParam("yahooUrl") String yahooUrl,
			@RequestParam("aboutUs") String aboutUs) {
		try {
			NewUser newUser = new NewUser();
			newUser.setFullName(fullName);
			newUser.setDesignation(designation);
			newUser.setPhoneNumber(phoneNumber);
			newUser.setWhatsappNumber(whatsappNumber);
			newUser.setLinkedinUrl(linkedinUrl);
			newUser.setLocation(location);
			newUser.setEmail(email);
			newUser.setWebsiteUrl(websiteUrl);
			newUser.setInstagramUrl(instagramUrl);
			newUser.setFacebookUrl(facebookUrl);
			newUser.setPinterestUrl(pinterestUrl);
			newUser.setYoutubeUrl(youtubeUrl);
			newUser.setTwitterUrl(twitterUrl);
			newUser.setYahooUrl(yahooUrl);
			newUser.setAboutUs(aboutUs);
			newUser.setLogo(file.getBytes());

			// Save candidate details with resume file
			newUserServiceImpl.saveUser(newUser);

			return ResponseEntity.ok().body("logo uploaded successfully!");
		} catch (IOException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload logo");
		}
	}

	@GetMapping("/allusers")
	public ResponseEntity<List<NewUser>> getAllUsers() {
		List<NewUser> newUser = newUserServiceImpl.getAllUsers();
		return ResponseEntity.ok().body(newUser);
	}

	// Add this delete method to delete a user by ID
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable int id) {
		newUserServiceImpl.deleteUserById(id);
		return ResponseEntity.ok().body("User with ID " + id + " has been deleted.");
	}

	@GetMapping("/{id}")
	public ResponseEntity<NewUser> findById(@PathVariable int id) {
		NewUser newUser = newUserServiceImpl.findById(id);
		if (newUser == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/fn")
	public ResponseEntity<List<NewUser>> findByFullName(@RequestParam(required = false) String fullName) {
		List<NewUser> newUser = newUserServiceImpl.findByFullName(fullName);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/")
	public ResponseEntity<List<NewUser>> findByDesignation(@RequestParam(required = false) String designation) {
		List<NewUser> newUser = newUserServiceImpl.findByDesignation(designation);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/ph")
	public ResponseEntity<List<NewUser>> findByPhoneNumber(@RequestParam(required = false) String phoneNumber) {
		List<NewUser> newUser = newUserServiceImpl.findByPhoneNumber(phoneNumber);
		return ResponseEntity.ok(newUser);
	}

	//

	@GetMapping("/w")
	public ResponseEntity<List<NewUser>> findByWhatsappNumber(@RequestParam(required = false) String whatsappNumber) {
		List<NewUser> newUser = newUserServiceImpl.findByWhatsappNumber(whatsappNumber);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/e")
	public ResponseEntity<List<NewUser>> findByEmail(@RequestParam(required = false) String email) {
		List<NewUser> newUser = newUserServiceImpl.findByEmail(email);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/web")
	public ResponseEntity<List<NewUser>> findByWebsiteUrl(@RequestParam(required = false) String websiteUrl) {
		List<NewUser> newUser = newUserServiceImpl.findByWebsiteUrl(websiteUrl);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/in")
	public ResponseEntity<List<NewUser>> findByInstagramUrl(@RequestParam(required = false) String instagramUrl) {
		List<NewUser> newUser = newUserServiceImpl.findByInstagramUrl(instagramUrl);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/fs")
	public ResponseEntity<List<NewUser>> findByFacebookUrl(@RequestParam(required = false) String facebookUrl) {
		List<NewUser> newUser = newUserServiceImpl.findByFacebookUrl(facebookUrl);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/pi")
	public ResponseEntity<List<NewUser>> findByPinterestUrl(@RequestParam(required = false) String pinterestUrl) {
		List<NewUser> newUser = newUserServiceImpl.findByPinterestUrl(pinterestUrl);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/ln")
	public ResponseEntity<List<NewUser>> findByLinkedinUrl(@RequestParam(required = false) String linkedinUrl) {
		List<NewUser> newUser = newUserServiceImpl.findByLinkedinUrl(linkedinUrl);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/yt")
	public ResponseEntity<List<NewUser>> findByYoutubeUrl(@RequestParam(required = false) String youtubeUrl) {
		List<NewUser> newUser = newUserServiceImpl.findByYoutubeUrl(youtubeUrl);
		return ResponseEntity.ok(newUser);
	}

	@GetMapping("/tw")
	public ResponseEntity<List<NewUser>> findByTwitterUrl(@RequestParam(required = false) String twitterUrl) {
		List<NewUser> newUser = newUserServiceImpl.findByTwitterUrl(twitterUrl);
		return ResponseEntity.ok(newUser);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateUser(@PathVariable int id, @RequestParam("file") MultipartFile file,
			@RequestParam("fullName") String fullName, @RequestParam("designation") String designation,
			@RequestParam("phoneNumber") String phoneNumber, @RequestParam("whatsappNumber") String whatsappNumber,
			@RequestParam("linkedinUrl") String linkedinUrl, @RequestParam("location") String location,
			@RequestParam("email") String email, @RequestParam("websiteUrl") String websiteUrl,
			@RequestParam("instagramUrl") String instagramUrl, @RequestParam("facebookUrl") String facebookUrl,
			@RequestParam("pinterestUrl") String pinterestUrl, @RequestParam("youtubeUrl") String youtubeUrl,
			@RequestParam("twitterUrl") String twitterUrl, @RequestParam("yahooUrl") String yahooUrl,
			@RequestParam("aboutUs") String aboutUs) {

		NewUser newUser = new NewUser();
		newUser.setFullName(fullName);
		newUser.setDesignation(designation);
		newUser.setPhoneNumber(phoneNumber);
		newUser.setWhatsappNumber(whatsappNumber);
		newUser.setLinkedinUrl(linkedinUrl);
		newUser.setLocation(location);
		newUser.setEmail(email);
		newUser.setWebsiteUrl(websiteUrl);
		newUser.setInstagramUrl(instagramUrl);
		newUser.setFacebookUrl(facebookUrl);
		newUser.setPinterestUrl(pinterestUrl);
		newUser.setYoutubeUrl(youtubeUrl);
		newUser.setTwitterUrl(twitterUrl);
		newUser.setYahooUrl(yahooUrl);
		newUser.setAboutUs(aboutUs);
		try {
			newUserServiceImpl.updateUser(id, file, newUser);
			return ResponseEntity.ok().build();
		} catch (IOException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
