package com.LibraryManagementSystem.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryManagementSystem.DTO.Users_DTO_Request;
import com.LibraryManagementSystem.security.UserService;

@RestController
@RequestMapping("/api")
public class UsersController {
	private final UserService userService;
	
	public UsersController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/signup")
	public String NewUser(@RequestBody Users_DTO_Request user) {
		if(user!=null) {
			userService.NewUser(user);
		}else {return " this data equal null";}
		
		return "done";
	}

}
