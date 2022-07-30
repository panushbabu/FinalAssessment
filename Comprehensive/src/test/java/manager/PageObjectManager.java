package manager;

public class PageObjectManager extends WebDriverManager {
	private pageobject.ShopProductPage ShopProductPage;
	private pageobject.PacePage PacePage;
	private pageobject.OurcommitmentPage OurcommitmentPage;
	private pageobject.HowtowashclothesPage HowtowashclothesPage;

	public pageobject.ShopProductPage getShopProductPage() {
		return (ShopProductPage == null) ? ShopProductPage = new pageobject.ShopProductPage() : ShopProductPage;
	}

	public pageobject.PacePage getPacePage() {
		return (PacePage == null) ? PacePage = new pageobject.PacePage() : PacePage;
	}

	public pageobject.OurcommitmentPage getOurcommitmentPage() {
		return (OurcommitmentPage == null) ? OurcommitmentPage = new pageobject.OurcommitmentPage() : OurcommitmentPage;
	}
	
	public pageobject.HowtowashclothesPage getHowtowashclothesPage() {
		return (HowtowashclothesPage == null) ? HowtowashclothesPage = new pageobject.HowtowashclothesPage() : HowtowashclothesPage;
	}
}
