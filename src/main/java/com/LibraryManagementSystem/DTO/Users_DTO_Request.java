package com.LibraryManagementSystem.DTO;

public class Users_DTO_Request {
	private String username;
	private String password;
	private String roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Users_DTO_Request [username=" + username + ", password=" + password + ", roles=" + roles + "]";
	}

}
