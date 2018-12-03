package com.exito.certification.userinterfaces;

/*
 *  Clase que hace los target a la página inicial del Exito
 */

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ExitoHomeIcons {
	public static final Target EXITO_HOMEPAGE_ICON_VISIBLE = Target.the("Exito homepage visible").located(By.id("header"));
	public static final Target WITHOUT_CONNECTION = Target.the("Exito homepage isible").located(By.id("error-information-popup-close"));

}
