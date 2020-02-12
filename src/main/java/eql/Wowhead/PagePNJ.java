package eql.Wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PagePNJ {
	
	public PageItem recherche_item(WebDriver driver, String item) {
		   WebElement Lardeur = driver.findElement(By.xpath("//a[text()= '"+item+"']"));
		   Lardeur.click();
	   return PageFactory.initElements(driver, PageItem.class);
		}

}
