package com.exito.certification.userinterfaces;

/*
 * Clase que hace los target a la página de Login
 */
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ExitoLoginPage  {
	public static final Target EXITO_LOGIN_ICON = Target.the("Exito login icon").located(By.xpath("//div[@id='headerUserInfo']/div/a/p/b"));
	public static final Target EXITO_USERNAME_BOX = Target.the("Exito username box").located(By.id("userName"));
	public static final Target EXITO_PASSWORD_BOX = Target.the("Exito password box").located(By.id("password"));
	public static final Target EXITO_LOGIN_BUTTON = Target.the("Exito login button").located(By.id("btnLogin"));
	public static final Target EXITO_UPDATE_INFORMATION_FORM = Target.the("Exito update information form").located(By.id("updateForm"));

}
