package baidu;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class baidu1 {
		@Test
		public void open() throws InterruptedException {
			//�򿪹ȸ������
			System.setProperty("webdriver.chrome.driver","./lianxi/chromedriver.exe");//��·��
			WebDriver driver=new ChromeDriver();
			String url="https://www.baidu.com";
			driver.get(url);
			WebElement input=driver.findElement(By.id("kw"));//��ȡλ��
			input.sendKeys("selenium");//����ֵ
			WebElement buton=driver.findElement(By.id("su"));//��ȡλ��
			buton.click();//���*/	
		}
	}

