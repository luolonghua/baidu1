package baidu;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class baidu1 {
		@Test
		public void open() throws InterruptedException {
			//打开谷歌浏览器
			System.setProperty("webdriver.chrome.driver","./lianxi/chromedriver.exe");//打开路径
			WebDriver driver=new ChromeDriver();
			String url="https://www.baidu.com";
			driver.get(url);
			WebElement input=driver.findElement(By.id("kw"));//获取位置
			input.sendKeys("selenium");//输入值
			WebElement buton=driver.findElement(By.id("su"));//获取位置
			buton.click();//点击*/	
		}
	}

