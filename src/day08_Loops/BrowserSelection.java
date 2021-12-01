package day08_Loops;

public class BrowserSelection {

	public static void main(String[] args) {
		
String targetBrowser = "Chrome";
		
		switch (targetBrowser) {
		case "Chrome":
			//WebDriver driver = new ChromeDriver();
			System.out.println("Open Chrome browser");
			break;
			
		case "IE":
			//WebDriver driver = new IE();
			System.out.println("Open IE browser");
			break;
		case "SAFARI":
			//WebDriver driver = new SAFARI();
			System.out.println("Open SAFARI browser");
			break;

		default:
			break;
		}
		
		
		
	}


		
	}


