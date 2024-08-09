package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Locators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kimdongwoo/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // 암묵적 딜레이 설정 - 3초
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("dongwoo");
        driver.findElement(By.name("inputPassword")).sendKeys("dongwoo");
        driver.findElement(By.className("signInBtn")).click();

        // HTML 태그 중 <a> 태그를 아래와 같이 사용한다. 해당 a태그에 들어있는 텍스트 값을 넣으면 된다.
        driver.findElement(By.linkText("Forgot your password?")).click();


        // Css Selector
        // Class name -> tagname.classname ->  button.signInBtn -> p.error
        // Id -> tagname#id -> input#inputUsername
        // 만약 HTML에 클래스 name이나 id가 없으면? -> Tagname[attribute='value']
        // Input[placeholder='Username']
//        driver.quit();
    }
}
