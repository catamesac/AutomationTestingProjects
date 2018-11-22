package co.com.cinemark.certificacion.compra.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


import org.openqa.selenium.By;

public class CineMarkPantallaDeCompra {
	public static final Target CINE_HORA = Target.the("hora funcion").located(By.xpath("//*[text()=\"21:50\"]"));
	public static final Target BOTON_SELECCIONAR = Target.the("Seleccionar hora funcion").located(By.xpath("//*[text()=\" Seleccionar\"]"));
	public static final Target CONTINUAR_COMO_USUARIO = Target.the("continuar como usuario boton").located(By.xpath("//*[text()=\"Continuar como invitado\"]"));
	public static final Target NOMBRE = Target.the("Nombre").located(By.name("firstname"));
	public static final Target APELLIDO = Target.the("Apellido").located(By.name("lastname"));
	public static final Target EMAIL = Target.the("Email").located(By.name("email"));
	public static final Target PHONE = Target.the("Phone").located(By.name("phone"));
	public static final Target DOCUMENTO = Target.the("Documento").located(By.name("docu"));
	public static final Target BOTON = Target.the("Boton comprar").located(By.xpath("//*[@id=\"buy-inner\"]/div/div/div[2]/div[2]/div[1]/div[2]/button[1]"));
	public static final Target NRO_BOLETAS = Target.the("Seleccionar numero de boletas").located(By.xpath("//*[@id=\"buy-inner\"]/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]"));
	public static final Target NRO_BOLETAS2 = Target.the("Seleccionar numero de boletas").located(By.xpath("//*[@id=\"buy-inner\"]/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/select/option[2]"));
	public static final Target BOTON_CONTINUAR1 = Target.the("Seleccionar silla").located(By.xpath("//*[@id=\"buy-inner\"]/div/div/div[2]/div[2]/div[1]/div[2]/button[2]"));
	public static final Target SILLA = Target.the("Seleccionar silla").located(By.xpath("//*[@id=\"room\"]/div/div/div[1]/div/button[9]"));
	public static final Target BOTON_CONTINUAR = Target.the("Seleccionar silla").located(By.xpath("//*[@id=\"buy-inner\"]/div/div/div[2]/div[2]/div[1]/div[2]/button[2]"));

}