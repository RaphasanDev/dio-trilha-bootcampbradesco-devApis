package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	public List<User> getUsers() {
		return null;

	}

}
