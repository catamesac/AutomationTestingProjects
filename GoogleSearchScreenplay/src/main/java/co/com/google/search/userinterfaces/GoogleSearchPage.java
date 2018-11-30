package co.com.google.search.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleSearchPage {
	
	//Mapea los campos necesarios que se usan para hacer la busqueda
	public static final Target GOOGLE_SEARCH_BOX = Target.the("Google search box").located(By.name("q"));
	public static final Target GOOGLE_SEARCH_BUTTOM = Target.the("Google search buttom").located(By.name("btnK"));
	//public static final Target GOOGLE_CANCEL = Target.the("Google cancel buttom").located(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div/div/div[2]/div/a[1]"));
	
	//public static final Target TARGET_SEARCH_TEXT_AREA = Target.the("Target search area").located(By.xpath("//*[@id=\"fkbx_crt\"]"));
}
