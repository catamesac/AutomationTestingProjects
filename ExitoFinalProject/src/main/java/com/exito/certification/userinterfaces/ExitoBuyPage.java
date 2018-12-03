package com.exito.certification.userinterfaces;

/*
 * Clase que hace los target a la página de compra
 */
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ExitoBuyPage {
	public static final Target EXITO_ITEM_AMOUNT = Target.the("Exito item amount").located(By.xpath("//*[@id=\"prd0003027919903011\"]/div[3]/div[2]/div[1]/div/a[2]/span"));
	public static final Target EXITO_SHOPPING_CART_ICON = Target.the("Exito shopping cart icon").locatedBy(".badge");	
	public static final Target EXITO_ADD_TO_SHOPPING_CART = Target.the("Exito add to the shopping cart").located(By.xpath("//*[@id=\"plp\"]/div[4]/div[2]/div[2]"));	
	public static final Target EXITO_SHIPPING_BUTTON_SELECT = Target.the("Exito shipping button select").located(By.id("selectShippingInfoFromSummary"));
	public static final Target EXITO_CONTINUE_BUTTON = Target.the("Exito continue button").located(By.id("continue-delivery-two"));
	public static final Target EXITO_SHIPPING_ADDRESS_SELECT = Target.the("Exito shipping address select").located(By.id("selectShippingInfoFromSummary"));
	public static final Target EXITO_PAYMENT_BUTTON_SELECT = Target.the("Exito payment button select").located(By.xpath("//*[@id=\"shipping-page\"]/div[1]/div[2]/div[2]/div/button"));
	public static final Target EXITO_CREDIT_CARD_CHOOSE = Target.the("Exito credit card choose").located(By.xpath("//a[2]/div"));
	public static final Target EXITO_CARD_ID_BOX = Target.the("Exito card id box").located(By.name("exitoCardId"));
	public static final Target EXITO_CARD_DUES = Target.the("Exito card dues").located(By.name("exitoCardDues"));
	public static final Target EXITO_CARD_NUMBER_BOX = Target.the("Exito car number box").located(By.name("exitoCardNumber"));
	public static final Target EXITO_PAYMENT_CONFIRMATION_BUTTON = Target.the("Exito payment confirmation button").located(By.xpath("//div[3]/div[2]/div/button"));
	public static final Target EXITO_PAYMENT_CONFIRMATION = Target.the("Exito paymente confirmation").located(By.xpath("//*[@id=\"review-page\"]/div[1]/div/h3"));
	



}
