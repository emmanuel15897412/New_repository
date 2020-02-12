package eql.Wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class PageAcceuil {
	
	
	public PageRecherchePNJ recherche_larder(WebDriver driver) {
		   WebElement champ_recherche = driver.findElement(By.xpath("//input[@placeholder='Rechercher des guides, des infos, ou dans la base de données…']"));
		   WebElement bouton_loupe = driver.findElement(By.xpath("//a[@class=\"header-search-button fa fa-search\"]"));
		   champ_recherche.sendKeys("Lardeur");
		   bouton_loupe.click();
		   return PageFactory.initElements(driver, PageRecherchePNJ.class);
	}

}
