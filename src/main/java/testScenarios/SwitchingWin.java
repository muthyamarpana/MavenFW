package testScenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SwitchingWin {

	@Test
	public void switchwin()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("total windows opened="+allWinIds.size());
		String win1=null;
		String win2=null;
		Iterator<String> itr=allWinIds.iterator();
		while(itr.hasNext())
		{
			win1=itr.next();
			win2=itr.next();
		}
		System.out.println("Window1 id="+win1);
		System.out.println("Window2 id="+win2);
		System.out.println("Window1 title="+driver.getTitle());
		driver.switchTo().window(win2);
		System.out.println("Window2 title="+driver.getTitle());
		boolean chkSignUpStatus=driver.findElement(By.linkText("Sign Up")).isEnabled();
		System.out.println(chkSignUpStatus);
		if(chkSignUpStatus==true)
		{
			System.out.println("Object is enabled..");
		}
		else
		{
			System.out.println("Object is disabled..");
		}
		driver.quit();
	}
}
