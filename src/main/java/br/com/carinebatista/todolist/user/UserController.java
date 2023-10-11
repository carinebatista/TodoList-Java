package br.com.carinebatista.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	/**
	 * String (texto)
	 * integer (int) números inteiros
	 * Float (float) numeros 0.000
	 * Double (double) numeros 0.0000
	 * char (A C)
	 * Date (Data)
	 * void
	 */

	/*
	 * Body
	 */
	@PostMapping("/")
	public void create(@RequestBody UserModel userModel) {
		System.out.println(userModel.name);
	}
}
