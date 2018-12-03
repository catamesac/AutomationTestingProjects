package com.exito.certification.models;

/*Clase que almacena los datos de usuario (username) y contraseña (password)a ingresar 
en la pagina de login definidos en el feature 
 */

public class LoginData {
	private String username;
	private String password;
	
	public void loginData(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	
}
