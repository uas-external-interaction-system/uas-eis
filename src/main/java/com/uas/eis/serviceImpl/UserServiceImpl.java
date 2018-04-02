package com.uas.eis.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.uas.eis.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	@Override
	public Map<String, Object> getUser(String username){
		return jdbcTemplate.queryForMap("select * from user where username = ?",username);
	}
	
}
