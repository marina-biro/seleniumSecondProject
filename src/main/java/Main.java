import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {



            public static void main(String[] args) throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raven\\Desktop\\QA\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();

                //  driver.manage().window().maximize();
                driver.get(" https://www.stealmylogin.com/demo.html");
                WebElement username =  driver.findElement(By.xpath("//input[@name='username']"));
                username.sendKeys("Marina");

                WebElement password =  driver.findElement(By.xpath("//input[@type='password']"));
                password.sendKeys("12345");

                WebElement submit =  driver.findElement(By.xpath("//input[@type='submit']"));
                submit.click();

                String strUrl = driver.getCurrentUrl();
                if(strUrl.equals("https://example.com/")){
                    System.out.println("Nice.");
                }else{
                    System.out.println("Not nice.");
                }

            }
        }


