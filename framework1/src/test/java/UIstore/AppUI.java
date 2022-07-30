package UIstore;

import org.openqa.selenium.By;

public class AppUI {
	public By search = By.xpath("//*[@id='site-header']/div[2]/div/div/div/form");
	public By searchBox = By.xpath("//*[@id=\'site-header\']/div[2]/div/div/div/form/div/input");
	// public By searchButton =
	// By.xpath("//*[@id='site-heade']/div[2]/div/div/div/form/div/button/svg");
	public By searchResult = By.xpath("//*[@id='Search']");
	// ("//*[@id='site-header']/div[2]/div/div/div/form/div/button");

	public By ShopProduct = By.xpath("//*[@id='site-header']/div[3]/div/div/div/div[1]/a");
	public By Liquid = By.xpath("//*[@id='site-footer']/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/a/span");
	public By OurCommitment = By.xpath("//*[@id='site-header']/div[3]/div/div/div/div[2]/a");
	public By OurAmbition = By.xpath("//*[@id='site-content']/div/div/div/div/div[2]/div/div/div/div[1]/div/div[2]/div/a[1]/p");

	public By Howtowashclothes = By.xpath("//*[@id='site-header']/div[3]/div/div/div/div[3]/a");
	public By Howtodolaundry = By.xpath("//*[@id='site-content']/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/a[1]/p");

	public By Register = By.xpath("//*[@id='site-header']/div[1]/div/div/div/div[2]/span/a");
	public By Signupnow = By.xpath("//*[@id='site-content']/div/div/div/div/div[1]/div/div/div/div[2]/div/p[6]/a");
	// public By Firstname = By.xpath("//*[@id='name']");
	// public By Emailaddress = By.xpath("//*[@id='email']");
	// public By Password = By.xpath("//*[@id='password']");
	// public By CreateAccount =
	// By.xpath("//*[@id='scroll']/div/div/div/div/div[2]/form/div[6]/div/input");

	public By Livechat = By.xpath("//*[@id='site-header']/div[1]/div/div/div/div[2]/a[1]");
	public By Loadsofhope = By.xpath("//*[@id='site-content']/div/div/div/div/div[5]/div/div/div/div[3]/div/div[2]/div/a[1]");
	
	public By Contactus = By.xpath("//*[@id='site-header']/div[1]/div/div/div/div[2]/a[2]");
	public By Chat = By.xpath("//*[@id=\'j_id0:j_id1:j_id2:idForm:j_id36:j_id37:opMainId:2:j_id49\']");
	
	public By Whatsnew = By.xpath("//*[@id='site-header']/div[3]/div/div/div/div[4]/a");
	//public By Tideprograms = By.xpath("//*[@id='sticky-nav']/div/nav/ul/li[2]/span");
	public By Tideloads = By.xpath("//*[@id='site-content']/div/div/div/div[3]/div[4]/div/div/div/div[1]/div/div[2]/div/a[1]");
	
	public By CouponsandRewards = By.xpath("//*[@id='site-header']/div[3]/div/div/div/div[5]/a");
	public By Savenow = By.xpath("//*[@id='site-content']/div/div/div/div/div[1]/div/div/div/div[2]/div/p[6]/a");
	
	public By Language = By.xpath("//*[@id='site-header']/div[1]/div/div/div/div[2]/button");
	public By USEnglish = By.xpath("/html/body/div[3]/div/div/div/a[1");
}
