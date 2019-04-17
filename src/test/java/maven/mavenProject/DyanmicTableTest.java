package maven.mavenProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DyanmicTableTest {
	
	public static WebDriver driver ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rajani\\Downloads\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> col = driver.findElements(By.xpath("//div[@id = 'content']/table/thead[1]/tr[1]/th"));
		List<WebElement> row = driver.findElements(By.xpath("//div[@id = 'content']/table/tbody/tr/th"));

		System.out.println(col.size());

System.out.println(row.size());
for(int j = 1 ; j< col.size() ; j++) {
	
for (int i = 0; i< row.size();i++) {
	
String rowval = 	driver.findElement(By.xpath("//div[@id = 'content']/table/tbody/tr["+ (i+1) +"]/td["+j+"]")).getText();
System.out.println(rowval);
	
}
}
	
	}*/
/*driver.get("http://demo.guru99.com/test/web-table-element.php");
int cols = driver.findElements(By.xpath("//*[@id = 'leftcontainer']/table[1]/thead[1]/tr[1]/th")).size();

int rows = driver.findElements(By.xpath("//*[@id = 'leftcontainer']/table[1]/tbody/tr/td[1]")).size();

System.out.println(cols);
System.out.println(rows);

for (int i = 0 ; i< rows ; i++) {
	
	for (int j = 0 ; j< cols ; j++) {
		
		String val = driver.findElement(By.xpath("//*[@id = 'leftcontainer']/table[1]/tbody/tr["+(i+1)+"]/td["+(j+1)+"]")).getText();
	
		System.out.println(val);
	}
	

}

	}*/
		
		driver.get("http://demo.guru99.com/test/web-table-element.php"); 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement baseTable = driver.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
         String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
		    driver.close();
    }
}
	
