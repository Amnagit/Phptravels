package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePhp {
	WebDriver driver;

	public LoginPagePhp(WebDriver driver) { // c connector
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='username']")
	private WebElement username;
     
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	private WebElement password;
	
	
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	private WebElement login;
	
    
	@FindBy(how = How.XPATH, using = "\"//*[@title='home']")
	private WebElement homebtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='select2-drop']/div/input")
	private WebElement Dubai;
	
	@FindBy(how = How.XPATH, using = "//*[@class='text-secondary']")
	private WebElement Allprice;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='btn btn-primary btn-sm btn-wide'])[2]")
	private WebElement DBtn;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='custom-control-label text-left go-left'])[1]")
	private WebElement FirstRS;
	
	public WebElement getFirstRS() {
		return FirstRS;
	}

	public void setFirstRS(WebElement firstRS) {
		FirstRS = firstRS;
	}

	@FindBy(how = How.XPATH, using = "//*[@class='book_button btn btn-success btn-block btn-lg chk']")
	private WebElement Book;
	@FindBy(how = How.XPATH, using = "//*[@class='text-main absolute-right']")
	private WebElement RPrice;
	
	public WebElement getRPrice() {
		return RPrice;
	}

	public void setRPrice(WebElement rPrice) {
		RPrice = rPrice;
	}

	public WebElement getBook() {
		return Book;
	}

	public void setBook(WebElement book) {
		Book = book;
	}

	public WebElement getDBtn() {
		return DBtn;
	}

	public void setDBtn(WebElement dBtn) {
		DBtn = dBtn;
	}

	public WebElement getAllprice() {
		return Allprice;
	}

	public void setAllprice(WebElement allprice) {
		Allprice = allprice;
	}

	public WebElement getDubai() {
		return Dubai;
	}

	public void setDubai(WebElement dubai) {
		Dubai = dubai;
		
		
	}
      
	public WebElement getHomebtn() {
		return homebtn;
	}

	public void setHomebtn(WebElement homebtn) {
		this.homebtn = homebtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
}
