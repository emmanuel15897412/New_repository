package eql.Wowhead;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Tests {
	
	
	
	@Test
	public void monPremierTest() throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fr.wowhead.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement bouton_cookies = driver.findElement(By.xpath("//button[@class='as-oil__btn-optin as-js-optin as-oil__btn-initial']"));
		bouton_cookies.click();
		PageAcceuil page_acceuil = PageFactory.initElements(driver,PageAcceuil.class);
		PageRecherchePNJ page_recherche_pnj = page_acceuil.recherche_larder(driver); 
		PagePNJ page_pnj = page_recherche_pnj.recherche_larder_mort(driver);
		PageItem page_item = page_pnj.recherche_item(driver, "Chahuteurs de cadavre");
	    driver.navigate().back();
 }
}