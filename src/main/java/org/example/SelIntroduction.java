package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

    public static void main(String[] args) {
        // 사용하고자 하는 webdriver를 설정한다. 키-밸류 값으로 되어있고, 드라이버가 설치되어있는 장소에 넣는다.
        System.setProperty("webdriver.chrome.driver", "/Users/kimdongwoo/chromedriver-mac-arm64/chromedriver");
        // 드라이버를 시스템에 설정해뒀으면 객체를 하나 생성해줌.
        WebDriver driver = new ChromeDriver();

        // 내가 들어가고자하는 브라우저의 url을 입력하기
        driver.get("https://www.naver.com");

        // 설정한 url의 페이지 Title을 얻을 땐 getTitle
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        // 시스템 메모리를 절약하기 위해 테스트 창을 끔
        // close <-> quit 으로 종료함. close -> 해당url창만, quit -> 해당 브라우저 전부다 종료
        // 그럼 언제 사용 ?  -> 스크립트를 통해 다수의 창을 여는 뭔가가 있다면 quit을 선택하고,
        // 단일 브라우저 창을 연다면 close를 선택하여 해당 브라우저 창만을 종료할 것이다.
        driver.close();
//        driver.quit();
//        <input type="text" placeholder="Username" id="inputUsername" value="">
    }
}
