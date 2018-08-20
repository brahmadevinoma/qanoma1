import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testcase5 
{
	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		
		Actions a=new Actions(driver);
		
		WebDriverWait wait=new WebDriverWait(driver, 60);
		
		
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		
		// verify home page
		
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("homepage displayed");
		}
		else
		{
			System.out.println("homepage failed to display");
		}
		
		//verify user name,password,login and clear
		
		WebElement loginname=driver.findElement(By.xpath("//table[@id='Table_01'][@width='717']/descendant::td[@class='bodyTXT']")); 
			String logname=loginname.getText();
		
		if(logname.equals("Login Name :"))  
		{
			System.out.println("login name is verified");
		}
		else
		{
			System.out.println("login name is not verifed");
		}
		
		WebElement password=driver.findElement(By.xpath("//table[@id='Table_01'][@width='717']/descendant::td[@class='bodyTXT'][2]"));
		String pwd=password.getText();
		
		if(pwd.equals("Password :"))
		{
			System.out.println("password verifed");
		}
		else
		{
			System.out.println("passeord not verifed");
		}
		
		WebElement login=driver.findElement(By.xpath("//table[@id='Table_01'][@width='717']/descendant::td/input[@type='Submit']"));
		
		if(login.isDisplayed())
		{
			System.out.println("submit verifed");
		}
		else
		{
			System.out.println("submit not verifed");
		}
		
		WebElement clear=driver.findElement(By.xpath("//table[@id='Table_01'][@width='717']/descendant::td[@align='center'][2]/input"));
		
		if(clear.isDisplayed())
		{
			System.out.println("clear verified"); 
		}
		else
		{
		    System.out.println("verify is failed");
		}
		
		
		// enter valid user name,password and login
		
		
		WebElement UN=driver.findElement(By.name("txtUserName"));
		 UN.sendKeys("qaplanet1");
		 
		 
		 WebElement PWD=driver.findElement(By.name("txtPassword"));
		 PWD.sendKeys("lab1");
		 
		 login.click();
		 
		 // home page verified after login
		 
			if(driver.getTitle().equals("OrangeHRM"))
			{
				System.out.println("homepage displayed");
			}
			else
			{
				System.out.println("homepage failed to display");
			}
			
			// verify welcome qaplanet1
			
			String wq=driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
			
			if(wq.equals("Welcome qaplanet1"))
			{
				System.out.println("Welcome qaplanet1 is displayed");
			}
			else
			{
				System.out.println("Welcome not disaplayed");
			}
		// verify change password and logout
			
			 WebElement CP=driver.findElement(By.linkText("Change Password"));
			 CP.getText();
			 if(CP.isDisplayed())
			 {
				 System.out.println("change password displayed");
			 }
			 else
			 {
				 System.out.println("change password not displayed");
			 }
		     

				//Create webElement for ADMIN
				WebElement ADMIN=driver.findElement(By.id("admin"));
				
				//Mouse over on ADMIN
				a.moveToElement(ADMIN).perform();
				
				// verify on company info,job,qualification and skills
				boolean companyINFO=driver.findElement(By.linkText("Company Info")).isDisplayed();
				if(companyINFO)
				{
					System.out.println("company info displayed");
				}
				else
				{
					System.out.println("company info not displayed");
				}
				
				boolean JOB=driver.findElement(By.linkText("Job")).isDisplayed();
				 if(JOB)
				 {
					 System.out.println("job displayed");
				 }
				 else
				 {
					 System.out.println("job not displayed");
				 }
				boolean QUALI=driver.findElement(By.linkText("Job")).isDisplayed();
				if(QUALI)
				{
					System.out.println("QUALI displayed");
				}
				else
				{
					System.out.println("QUALI not displayed");
				}
				
				boolean SKILLS=driver.findElement(By.linkText("Skills")).isDisplayed();
				if(SKILLS)
				{
					System.out.println("SKILLS displayed");
				}
				else
				{
					System.out.println("SKILLS not displayed");
				}
			
				Thread.sleep(2000);
				
		         // move over admin
				a.moveToElement(ADMIN).perform();
				
				// WebElement for company info
				
				WebElement CMPYINFO=driver.findElement(By.linkText("Company Info"));
				a.moveToElement(CMPYINFO).perform();
				System.out.println(CMPYINFO);
				
				// verify general,location,structure,property
				// create WebElement for general
			    WebElement GEN=driver.findElement(By.linkText("General"));
				a.moveToElement(GEN).perform();
				System.out.println(GEN);
				
				//  create WebElement for location
				WebElement LOC=driver.findElement(By.linkText("Locations"));
				a.moveToElement(LOC).perform();
				System.out.println(LOC);
			   
				//  create WebElement for company structure
				WebElement STR=driver.findElement(By.linkText("Company Structure"));
				a.moveToElement(STR).perform();
				System.out.println(STR);
	
				// create WebElement for property 
				WebElement PRO=driver.findElement(By.linkText("Company Property"));
				a.moveToElement(PRO).perform();
				System.out.println(PRO);
			
				// click on location
				LOC.click();
				
				// switch to frame
				
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu")); 
				
				// verify location
				

				//Verify Company Info : Locations
				if(driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Company Info : Locations"))
				{
					System.out.println("Company Info : Locations displayed");
				}
				
				// verify search by,search edit box,search button,reset button,add,delete
				
			WebElement SEARCH=driver.findElement(By.name("loc_code"));
			WebElement SEARCHEDIT=driver.findElement(By.name("loc_name"));
			if(SEARCH.isDisplayed()&&SEARCHEDIT.isDisplayed())
			{
				System.out.println("del and reset are present");
			}
			
				
			WebElement SSEARCHBUTTON=driver.findElement(By.xpath("//input[@type='button'][@value='Search']"));
			WebElement RESET=driver.findElement(By.xpath("//input[@type='button'][@value='Search']/following-sibling::input"));
			WebElement ADD=driver.findElement(By.xpath("//input[@type='button'][@value='Add']"));
			WebElement DELETE=driver.findElement(By.xpath("//input[@type='button'][@value='Delete']"));
			if(SSEARCHBUTTON.isEnabled()&&RESET.isEnabled()&&ADD.isEnabled()&&DELETE.isEnabled())
			{
				System.out.println("Sbutton and reset and add and delete is displayed");
			}
			

				
				// click on add
				
				ADD.click();
				Thread.sleep(2000);
			
				// click on save
				
				WebElement SAVE=driver.findElement(By.xpath("//input[@value='Save']"));
				SAVE.click();
				
				Alert A=wait.until(ExpectedConditions.alertIsPresent());
				
				String AB=driver.switchTo().alert().getText();
				System.out.println(AB);
				
				
			
				if(AB.equals("Please correct the following\n\n\t- Location Name has to be specified\n\t- Country should be selected!\n\t- Address should be specified\n\t- Zip Code should be specified\n"))
				{
					System.out.println("AB is displayed");
					
					A.accept();
				}
			
				Thread.sleep(2000);
				
				// write name
				
				WebElement NAME=driver.findElement(By.name("txtLocDescription"));
				NAME.clear();
				NAME.sendKeys("noma");
				SAVE.click();
				Thread.sleep(2000);
				// verify alert
				
				Alert A1=wait.until(ExpectedConditions.alertIsPresent());
				String AB1=driver.switchTo().alert().getText();
				System.out.println(AB1);
				

				if(AB1.equals("Please correct the following\n\n\t- Country should be selected!\n\t- Address should be specified\n\t- Zip Code should be specified\n"))
				{
					System.out.println("AB1 is displayed");
					A1.accept();
				}
				
				// select country and save
				
				WebElement select=driver.findElement(By.xpath("//select"));
				
				select.click();
				
				WebElement select1=driver.findElement(By.xpath("//select[@id='cmbCountry']/descendant::option[contains(text(),'India')][2]"));
				select1.click();
				SAVE.click();
				
		      // verify alert
				
				Alert A2=wait.until(ExpectedConditions.alertIsPresent());
				String AB2=driver.switchTo().alert().getText();
				System.out.println(AB2);
				

				if(AB2.equals("Please correct the following\n\n\t- Address should be specified\n\t- Zip Code should be specified\n"))
			     {
					System.out.println("AB2 is displayed");
					A2.accept();
				}
				
				// enter address and click on save
				
				WebElement ADDR=driver.findElement(By.id("txtAddress"));
				ADDR.clear();
				ADDR.sendKeys("sec-bad");
				SAVE.click();
				
				Alert A3=wait.until(ExpectedConditions.alertIsPresent());
				String AB3=driver.switchTo().alert().getText();
				System.out.println(AB3);
				
				if(AB3.equals("Please correct the following\n\n\t- Zip Code should be specified\n"))
			     {
					System.out.println("AB3 is displayed");
					A3.accept();
				}
				
				// enter zip code and click on save
				
				WebElement ZIP=driver.findElement(By.id("txtZIP"));
				ZIP.clear();
				ZIP.sendKeys("500015");
				SAVE.click();
		
				Thread.sleep(2000);
				
			// verify that location is successfully added
				
				WebElement SUCCADDED=driver.findElement(By.xpath("//div[@class='messagebar']/span"));
				if(SUCCADDED.getText().equals("Successfully Added"))
				{
					System.out.println("Successfully Added is displayed");
				}
				else
				{
					System.out.println("Successfully Added is not displayed");
				}

				// switch to parrent frame
				
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				
				// click on logout
				
		        driver.findElement(By.xpath("//ul[@id='option-menu']/descendant::li/a[contains(text(),'Logout')]")).click();;
			
					driver.close();
					driver.quit();
				
}
}