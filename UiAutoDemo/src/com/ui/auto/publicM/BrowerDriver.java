package com.ui.auto.publicM;

import org.openqa.selenium.WebDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Welcome !
 *
 * @DATE 2019-03-19
 */

public class BrowerDriver {
    WebDriver driver;
    //打印
    Logger logger = LogManager.getLogger(BrowerDriver.class);
    runDriver runDriver = new runDriver();

    public WebDriver openDriver(){
        logger.info( "打开浏览器" );
        System.setProperty( "webdriver.chrome.driver",runDriver.pathChromeDriver );
        this.driver = new ChromeDriver(  );
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );
        driver.manage().window().maximize();
        logger.info( "使浏览器最大化" );
        return driver;
    }

    public WebDriver closeBrower(){
        this.driver.quit();
        logger.info( "操作结束，关闭浏览器" );
        return null;
    }

    // 构造函数初始化元素
    public BrowerDriver(WebDriver driver) {
        this.driver = driver;
    }
}
