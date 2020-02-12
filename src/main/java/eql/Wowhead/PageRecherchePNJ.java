package eql.Wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageRecherchePNJ {

	public PagePNJ recherche_larder_mort(WebDriver driver) {
	   WebElement lardeur_mort = driver.findElement(By.xpath("//td/a[@href=\"/npc=46254/lardeur\"]"));
	   lardeur_mort.click();
		return PageFactory.initElements(driver, PagePNJ.class);
	}
}
