package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HandChkBoxRadBtns {

	@Test
	public void chkRadBtns()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement radHonda=driver.findElement(By.id("hondaradio"));
		radHonda.click();
		boolean isRadHondaSel=radHonda.isSelected();
		if(isRadHondaSel==true)
		{
			System.out.println("Radio button Honda is selected..");
		}
		else
		{
			System.out.println("Radio button Honda is not selected..");
		}
		WebElement chkBMW=driver.findElement(By.id("bmwcheck"));
		chkBMW.click();
		WebElement chkBenz=driver.findElement(By.id("benzcheck"));
		chkBenz.click();
		
		if(chkBMW.isSelected() && chkBenz.isSelected())
		{
			System.out.println("BMW and Benz are checked..");
		}
		else
		{
			System.out.println("BMW and Benz are not checked..");
		}
		driver.quit();
	}
}
