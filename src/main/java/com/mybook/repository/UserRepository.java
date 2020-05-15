package com.mybook.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.mybook.domain.User;

@Mapper
public interface UserRepository {
	
	@Select("SELECT * FROM users")
	@Results(id="user",value= {
			@Result(column="user_id",property="userId"),
			@Result(column="name", property="name"),
			@Result(column="email",property="email"),
			@Result(column="password",property="password"),
			@Result(column="image_path",property="imagePath"),
			@Result(column="profile",property="profile")})
	List<User>findAll();
	
	@Select("SELECT * FROM users WHERE user_id = #{userId}")
	@ResultMap("user")
	User findById(String id);
	
	@Insert("INSERT INTO users (user_id,name,email,password,image_path,profile)VALUES(#{userId},#{name},#{email},#{password},#{imagePath},#{profile})")
	@ResultMap("user")
	void insert(User user);
}
