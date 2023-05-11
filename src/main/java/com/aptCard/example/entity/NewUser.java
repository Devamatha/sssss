package com.aptCard.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "new_UserDetails")
public class NewUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	@Column(name = "full_Name")
	private String fullName;

	@Column(name = "designation")
	private String designation;

	@Column(name = "phone_Number", length = 10)
	private String phoneNumber;

	@Column(name = "whatsapp_Number", length = 10)
	private String whatsappNumber;

	@Column(name = "Location", length = 100)
	private String location;

	@Column(name = "email")
	private String email;

	@Column(name = "website_Url")
	private String websiteUrl;

	@Column(name = "instagram_Url")
	private String instagramUrl;

	@Column(name = "facebook_Url")
	private String facebookUrl;

	@Column(name = "pinterest_Url")
	private String pinterestUrl;

	@Column(name = "linkedin_Url")
	private String linkedinUrl;

	@Column(name = "youtube_Url")
	private String youtubeUrl;

	@Column(name = "twitter_Url")
	private String twitterUrl;

	@Column(name = "yahoo_Url")
	private String yahooUrl;

	@Lob
	private byte[] logo;

	@Column(name = "about_Us", length = 65535, columnDefinition = "TEXT")
	private String aboutUs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWhatsappNumber() {
		return whatsappNumber;
	}

	public void setWhatsappNumber(String whatsappNumber) {
		this.whatsappNumber = whatsappNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getInstagramUrl() {
		return instagramUrl;
	}

	public void setInstagramUrl(String instagramUrl) {
		this.instagramUrl = instagramUrl;
	}

	public String getFacebookUrl() {
		return facebookUrl;
	}

	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}

	public String getPinterestUrl() {
		return pinterestUrl;
	}

	public void setPinterestUrl(String pinterestUrl) {
		this.pinterestUrl = pinterestUrl;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public String getYoutubeUrl() {
		return youtubeUrl;
	}

	public void setYoutubeUrl(String youtubeUrl) {
		this.youtubeUrl = youtubeUrl;
	}

	public void setTwitterUrl(String twitterUrl) {
		this.twitterUrl = twitterUrl;
	}

	public String getTwitterUrl() {
		return twitterUrl;
	}

	public String getYahooUrl() {
		return yahooUrl;
	}

	public void setYahooUrl(String yahooUrl) {
		this.yahooUrl = yahooUrl;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getAboutUs() {
		return aboutUs;
	}

	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}

	public NewUser(int id, String fullName, String designation, String phoneNumber, String whatsappNumber,
			String location, String email, String websiteUrl, String instagramUrl, String facebookUrl,
			String pinterestUrl, String linkedinUrl, String youtubeUrl, String twitterUrl, String yahooUrl, byte[] logo,
			String aboutUs) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.designation = designation;
		this.phoneNumber = phoneNumber;
		this.whatsappNumber = whatsappNumber;
		this.location = location;
		this.email = email;
		this.websiteUrl = websiteUrl;
		this.instagramUrl = instagramUrl;
		this.facebookUrl = facebookUrl;
		this.pinterestUrl = pinterestUrl;
		this.linkedinUrl = linkedinUrl;
		this.youtubeUrl = youtubeUrl;
		this.twitterUrl = twitterUrl;
		this.yahooUrl = yahooUrl;
		this.logo = logo;
		this.aboutUs = aboutUs;
	}

	public NewUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
