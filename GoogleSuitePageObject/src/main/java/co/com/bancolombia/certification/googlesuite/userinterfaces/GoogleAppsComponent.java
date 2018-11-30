package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent implements Task {
	
	public static final Target GOOGLE_CANCEL = Target.the("Google cancel buttom").located(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div/div/div[2]/div/a[1]"));

	//mapeo de objetos en screnPlay 
	//Mapeo para darle click a la pagina principal
	
	public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));	
	public static final Target GOOLE_TRANSLATE = Target.the("Google translate app option").located(By.id("gb51"));

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
	}

}
