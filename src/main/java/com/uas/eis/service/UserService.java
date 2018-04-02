package com.uas.eis.service;

import java.util.Map;

public interface UserService {

	public abstract Map<String, Object> getUser(String username);

}