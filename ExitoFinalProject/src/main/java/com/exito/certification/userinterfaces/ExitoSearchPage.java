package com.exito.certification.userinterfaces;

/*
 * Clase que hace los target a la página de búsqueda
 */
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com/products/0003089748927955/tv-led-55x757f-uhd-134-cms-55-pulgadas-4k-smartandroid-tv")

public class ExitoSearchPage {
	
	
	public static final Target EXITO_SEARCH_BOX = Target.the("Exito search box").located(By.id("tbxSearch"));
	public static final Target EXITO_SEARCH_BUTTON = Target.the("Exito search buttom").located(By.id("btnSearch"));	
	//public static final Target EXITO_SELECT_ITEM_TABLE = Target.the("Exito select item table").located(By.id("productList"));
	public static final Target EXITO_ONE_ITEM  = Target.the("Exito one item").located(By.id("prd0003089748927955"));
	public static final Target ADD_ONE_MORE_ARTICLE = Target.the("Add one more article").located(By.xpath("//div/div/a[2]/span"));
	public static final Target ADD_TO_SHOPPING_CART = Target.the("Add to shopping cart").located(By.buttonText("Añadir al carrito"));
	public static final Target EXITO_WISEPOP_CLOSE = Target.the("Exito wisepop close").located(By.id("close-wisepop-123971"));
	/*se hace Target del nombre de la clase que reconoce el nombre de los productos,
	por medio del .name me obtiene todos los productos que la búsqueda arroja*/
	public static final Target EXITO_SELECT_ITEMS= Target.the("Exito select itms").located(By.cssSelector(".name"));
	
	

	
	
}
