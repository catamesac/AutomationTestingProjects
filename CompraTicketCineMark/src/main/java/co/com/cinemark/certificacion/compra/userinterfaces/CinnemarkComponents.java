package co.com.cinemark.certificacion.compra.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CinnemarkComponents {
	
	
	public static final Target SELECT_MOVIE_MENU_BUTTON = Target.the("Movie button").located(By.xpath("//*[@id=header]/div[4]/div/div[3]/ul/li[1]/a"));
	public static final Target SELECT_MOVIE_HORARY_BUTTON	 = Target.the("Movie button").located(By.xpath("//*[@id=page-billboard]/div[1]/div[3]/div/div/div[1]/a"));
	public static final Target CANCEL_HOME_BOX = Target.the("Cancel Button").located(By.xpath("//*[@id='homeModal']/div/div/button"));
	public static final Target SELECT_MOVIE_TEXTBOX_HOME_PAGE = Target.the("Movie Select Box Home Page").located(By.xpath("//*[@id='header']/div[4]/div/div[3]/ul/li[1]/a"));
	public static final Target ACCEPT_BUTTOM_HOME_PAGE = Target.the("Acept Buttom").located(By.xpath("//*[@id='modal-theatre-select']/div/div[3]/div[2]/button"));
	public static final Target PELICULA = Target.the("Seleccionar pelicula").located(By.xpath("//*[text()=\"Una entrevista con Dios\"]"));
	
}
