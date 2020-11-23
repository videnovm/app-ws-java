package com.app.ws.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ws.UserRepository;
import com.app.ws.io.entity.UserEntity;
import com.app.ws.shared.dto.UserDto;
import com.app.ws.shared.dto.Utils;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils utils;
	@Override
	public UserDto createUser(UserDto user) {
		
		//UserEntity storedUserDetails = userRepository.findUserByEmail(user.getEmail());
		if(userRepository.findUserByEmail(user.getEmail()) != null) throw new RuntimeException("Record already exists"); 

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		String publicUserId = utils.generateUserId(30);
		userEntity.setEncryptedPassword("test");
		userEntity.setUserId(publicUserId);
		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		 
		return returnValue;
	}

}
