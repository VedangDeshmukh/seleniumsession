package WebDriverBasic;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		 br.init_Browser("chrome");
		 br.launchUrl("https://www.amazon.in/");
		 
		String title = br.getPageTitle();
		if(title.contains("Amazon.in")) {
			System.out.println("Title of the page conatin Amazon");
		}else {
			System.out.println("Title of the page  not conatin Amazon");

		}
		
		
		
		System.out.println("Url of the page is:"+br.getPageUrl());
		
	}

}
