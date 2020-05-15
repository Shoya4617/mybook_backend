package com.mybook.domain;

public class RegisterUser {
	
	private String uid;
	private String displayName;
	private String email;
	private String password;
	private String photoURL;
	private String profile;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhotoURL() {
		return photoURL;
	}
	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "RegisterUser [uid=" + uid + ", displayName=" + displayName + ", email=" + email + ", password="
				+ password + ", photoURL=" + photoURL + ", profile=" + profile + "]";
	}
	
	
	

}
