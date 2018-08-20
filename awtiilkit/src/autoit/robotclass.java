package autoit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class robotclass

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
		     
			
				//Create webElement for PIM
				WebElement objPIM=driver.findElement(By.id("pim"));

				//Mouse over on PIM
				a.moveToElement(objPIM).perform();
				

				//Click on add employee
				
				
				driver.findElement(By.linkText("Add Employee")).click();



				Thread.sleep(4000);

				//wait for frame and switch to it

				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));

				//Verify PIM : Add Employee
				if(driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee"))
				{
					System.out.println("PIM : Add Employee displayed");
				}
				
				
	           // fn and ln enter
				
				String ln="nomadeva rao";
				String fn="B.";
				
				
				//verify employee id
				
				String empID=driver.findElement(By.id("txtEmployeeId")).getAttribute("value");
				
				
				
				
				// click on photo
				
				WebElement PHOTO=driver.findElement(By.id("photofile"));
			
					PHOTO.click();
				
					
			
				
					Thread.sleep(1000);
				// click on photo
				
				Runtime.getRuntime().exec("C:\\Users\\QAP8\\Desktop\\nan.exe");
				Thread.sleep(2000);
			
				// click on save
				
				WebElement save=driver.findElement(By.id("btnEdit"));
				save.click();	
				
				// wait for alert
				Alert A=wait.until(ExpectedConditions.alertIsPresent());
				
				// verify alert message

				if(A.getText().equals("Last Name Empty!"))
				{
					System.out.println("LNE displayed");
					A.accept();
				}
				else
				{
					System.out.println("LNE not displayed");
				}
		        
			// enter last name
				
				driver.findElement(By.name("txtEmpLastName")).sendKeys(ln);
				
				save.click();
		
				
				
				
				// verify alert message
					if(A.getText().equals("First Name Empty!"))
							{
						System.out.println("FNE displayed");
						A.accept();
					}
					else
					{
						System.out.println("FNE not displayed");
					}
				
					
					
					
					
					// enter first name
							
							driver.findElement(By.name("txtEmpFirstName")).sendKeys(fn);
							
							save.click();
				
				
			
			
			
		
		 
		
				// wait and verify personal details
				if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']/h2"), "Personal Details")))
						{
					System.out.println("personal details is displayed");
						}
				
				else
				{
					System.out.println("personal details not displayed");
				}
			
	/*			// edit personal details
				
				driver.findElement(By.id("btnEditPers")).click();
				Thread.sleep(1000);
				
				// edit first name 
				WebElement EFN=driver.findElement(By.xpath("//input[@name='txtEmpFirstName']"));
				EFN.click();
				EFN.clear();
				EFN.sendKeys("Brahma");
				driver.findElement(By.className("savebutton")).click();  */
			
		
		
				// switch to parent frame
				driver.switchTo().parentFrame();
				Thread.sleep(3000);
				
				
				// move over emp
				a.moveToElement(objPIM).perform();
				//click on employee list information
				
				driver.findElement(By.linkText("Employee List")).click();
				Thread.sleep(2000);
				// wait for frame and switch to it
				
				driver.switchTo().frame("rightMenu");
				
				
				
			// verify employee information
				String Empinf=driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText();
				System.out.println(Empinf);
				if(Empinf.equals("Employee Information"))
				{
					System.out.println("empinf displayed");
				}
				else
				
					
				{
					System.out.println("empinf not displayed");
					
				}
				
				// 
                  // verify employee details in employee table
				
			/*	int rc=driver.findElements(By.xpath("//table/tbody/tr")).size();
				for(int n=1;n<=rc;n++)
				{
					String ID=driver.findElement(By.xpath("//table/tbody/tr["+n+"]/td[2]")).getText();
					
					String NAME=driver.findElement(By.xpath("//table/tbody/tr["+n+"]/td[3]/a")).getText();
					if(ID.equals(empID) && NAME.equals(fn+" "+ln));
					{
						System.out.println("rc displayed");
						break;
					}*/
					
				
				
			  // verify employee details in employee table
				
				String emptext=driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),'"+ empID +"')]/following-sibling::td/a")).getText();
				if(emptext.equals(fn+" "+ln))
				{
					System.out.println("emptext is displayed");
				}
	
				// click on emptext
				driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),'"+ empID +"')]/following-sibling::td/a")).click();
				Thread.sleep(2000);
			
				
				driver.findElement(By.cssSelector(".editbutton")).click();
				WebElement editFN=driver.findElement(By.xpath("//input[@class='formInputText'][3]"));
				editFN.click();
				editFN.clear();
				editFN.sendKeys("Brahma");
				driver.findElement(By.className("savebutton")).click();
				
				
				// switch to parent frame
				driver.switchTo().parentFrame();
				Thread.sleep(3000);
				
				
				// move over emp
				a.moveToElement(objPIM).perform();
				//click on employee list information
				
				driver.findElement(By.linkText("Employee List")).click();
				Thread.sleep(2000);
				// wait for frame and switch to it
				
				driver.switchTo().frame("rightMenu");
				
				// verify employee information
				String Empinf1=driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText();
				System.out.println(Empinf1);
				if(Empinf1.equals("Employee Information"))
				{
					System.out.println("empinf1 displayed");
				}
				else
				
					
				{
					System.out.println("empinf1 not displayed");
					
				}
				
				// compare previous name with edited name
				
				if(editFN.equals(fn))
				{
					System.out.println("name not edited");
				}
				else
				{
					System.out.println("name edited");
				}
				
			
				// switch to parent frame
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				
				
		
			// click on logout
				
				driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a")).click();
				driver.close();
				driver.quit();   
	                                         



}
	
	

	
	
}
	
	


