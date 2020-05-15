package com.mybook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mybook.domain.RegisterUser;
import com.mybook.domain.User;
import com.mybook.repository.UserRepository;

@RestController
@RequestMapping("")
public class UserApiController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/check_user/{id}")
	@CrossOrigin
	public User checkUser(@PathVariable("id") String id) {
		User user = userRepository.findById(id);
		return user;
	}
	
	
	@RequestMapping(value="/register_user",method = {RequestMethod.POST})
	@CrossOrigin
	public User registerUser(@RequestBody RegisterUser ru) {
		System.out.println(ru);
		User user = new User();
		user.setName(ru.getDisplayName());
		user.setUserId(ru.getUid());
		user.setEmail(ru.getEmail());
		user.setImagePath(ru.getPhotoURL());
		user.setPassword(null);
		user.setProfile(null);
		userRepository.insert(user);
		System.out.println("ユーザー登録完了："+user);
		return user;
	}

}
