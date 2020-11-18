package com.stepdef;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PhpTravelsStep {
	WebDriver driver;
	WebDriverWait wait;
	LoginPagePhp loginpagephp;
	@Given("^user open browser and go to the php travels home page$")
	public void user_open_browser_and_go_to_the_php_travels_home_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chrome\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("https://www.phptravels.net/home");
		   driver.manage().window().maximize();
		   loginpagephp   =	PageFactory.initElements(driver, LoginPagePhp.class);
	   
	  
	}

	@Given("^user able to click on the Home button on the top left and verify page title$")
	public void user_able_to_click_on_the_Home_button_on_the_top_left_and_verify_page_title() throws Throwable {
		Thread.sleep(3000);
		String actual = driver.getTitle();
		String expected = "PHPTRAVELS | Travel Technology Partner";
		Assert.assertTrue("This Tittle is Wrong", actual.contains(expected));
		Thread.sleep(3000);
		
	  
	}

	@Then("^user enter a valid username and password$")
	public void user_enter_a_valid_username_and_password() throws Throwable {
		driver.findElement(By.xpath("(//*[@id='dropdownCurrency'])[2]")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='dropdown-item active tr']")).click();
		loginpagephp.getUsername().sendKeys("user@phptravels.com");// user name
		loginpagephp.getPassword().sendKeys("demouser");// password

	}

	@Then("^user able to click login button$")
	public void user_able_to_click_login_button() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
		login.click();


	  
	}

	@Then("^user click on the home button$")
	public void user_click_on_the_home_button() throws Throwable {
	   
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='home']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		// wait.until(ExpectedConditions.visibilityOf(homeBtn));


	}

	@Then("^user select destination as Dubai, United Arab Emirates$")
	public void user_select_destination_as_Dubai_United_Arab_Emirates() throws Throwable {
	   
		WebElement selectt = driver.findElement(By.xpath("//div[@id='s2id_autogen16']/a"));
	    selectt.click();
		selectt.sendKeys("Dubai");
		Thread.sleep(3000);
        WebElement dubai = driver.findElement(By.xpath("//*[@id='select2-drop']/div/input"));
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(dubai));
		selectt.sendKeys(Keys.ENTER);
		

	}

	@Then("^user check-in next month date (\\d+)th and check out next month (\\d+)th$")
	public void user_check_in_next_month_date_th_and_check_out_next_month_th(int arg1, int arg2) throws Throwable {
		
		Thread.sleep(3000);
		WebElement check = driver.findElement(By.xpath("//*[@id='checkin']"));
	check.click();
		
//		wait = new WebDriverWait(driver, 15);
//	    wait.until(ExpectedConditions.visibilityOf(check));
  //  Thread.sleep(4000);
	WebElement checkym = driver.findElement(By.xpath("//*[@data-action='next']"));
		checkym.click();
		
	//Thread.sleep(3000);
		
	WebElement checkdate = driver.findElement(By.xpath("(//*[@data-date='20'])[1]"));
	checkdate.click();
	//	Thread.sleep(3000);
		WebElement next = driver.findElement(By.xpath("//*[@id='checkout']"));
		next.click();
		WebElement nextym = driver.findElement(By.xpath("(//*[@data-action='next'])[2]"));
		nextym.click();
		//Thread.sleep(3000);
		WebElement nextdate = driver.findElement(By.xpath("(//*[@data-date='20'])[2]"));
		
		nextdate.click();
	
}

	@Then("^user able to select adult (\\d+) and child (\\d+) button$")
	public void user_able_to_select_adult_and_child_button(int arg1, int arg2) throws Throwable {
	   
		WebElement Kids= driver.findElement(By.xpath("(//*[@type='button'])[5]"));
		Kids.click();
    	
		Thread.sleep(3000);
	}

	@Then("^user able to click SEARCH button$")
	public void user_able_to_click_SEARCH_button() throws Throwable {
		 WebElement Srch = driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
	       Srch.click();
	       Thread.sleep(3000);

	  
	}

	@Then("^user able to Print all price in descending order$")
	public void user_able_to_Print_all_price_in_descending_order() throws Throwable {
		 JavascriptExecutor AA =(JavascriptExecutor) driver;
			AA.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
			

	List<WebElement> AllPrice = driver.findElements(By.xpath("//*[@class='text-secondary']"));

	ArrayList<String> NewList = new ArrayList<String>();

	for(int i=0; i<AllPrice.size();i++) {
	NewList.add(AllPrice.get(i).getText().toString());
	}
	// Collections.sort(NewList,Collections.reverseOrder());
	System.out.println("List of Price: "+NewList);
	String SecondPrice = NewList.get(1);
	System.out.println("Price of The Second Hotel: "+ SecondPrice);
	JavascriptExecutor AM =(JavascriptExecutor) driver;
	AM.executeScript("window.scrollBy(500,0)");
	Thread.sleep(3000);
}

	@Then("^user select teh second hotel from teh list by clicking the DETAILS button$")
	public void user_select_teh_second_hotel_from_teh_list_by_clicking_the_DETAILS_button() throws Throwable {
		WebElement select= driver.findElement(By.xpath("(//*[@class='btn btn-primary btn-sm btn-wide'])[2]"));
//		wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.visibilityOf(select));
			select.click();
			Thread.sleep(3000);
}

	@Then("^user able to click on see price and date button on the top right and select the first room and remember the price$")
	public void user_able_to_click_on_see_price_and_date_button_on_the_top_right_and_select_the_first_room_and_remember_the_price() throws Throwable {
	   
		WebElement PrDt =driver.findElement(By.xpath("//*[@class='anchor btn btn-primary btn-wide mt-5']"));
        wait = new WebDriverWait(driver, 15);
 		wait.until(ExpectedConditions.visibilityOf(PrDt));
        PrDt.click();
   	 
   	 WebElement FirstR= driver.findElement(By.xpath("(//*[@class='number text-secondary'])[1]"));
        wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(FirstR)); 
        FirstR.click();
        WebElement FirstRS= driver.findElement(By.xpath("(//*[@class='custom-control-label text-left go-left'])[1]"));
        wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(FirstRS));
		FirstRS.click();
	}

	@When("^user able to click BOOK NOW button and checkout$")
	public void user_able_to_click_BOOK_NOW_button_and_checkout() throws Throwable {
	   
		JavascriptExecutor AA =(JavascriptExecutor) driver;
 		AA.executeScript("window.scrollBy(0,550)");
         WebElement Book= driver.findElement(By.xpath("//*[@class='book_button btn btn-success btn-block btn-lg chk']"));
         
		 wait = new WebDriverWait(driver, 15);
	 		wait.until(ExpectedConditions.visibilityOf(Book));
		Book.click();
	}

	@Then("^on teh next page verify Total Amount is greater than Room price$")
	public void on_teh_next_page_verify_Total_Amount_is_greater_than_Room_price() throws Throwable {
	   String actualstotalamount = "actualstotalamount";
	   String expectedtotalamount = driver.findElement(By.xpath("//*[@class='text-main absolute-right']")).getText();
	   System.out.println("This expected price is:"+expectedtotalamount);
	   Assert.assertFalse(actualstotalamount.equals(expectedtotalamount));
	  
	}


}	