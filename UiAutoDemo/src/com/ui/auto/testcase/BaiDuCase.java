package com.ui.auto.testcase;

import com.ui.auto.publicM.BrowerDriver;
import com.ui.auto.step.BaiDuStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Welcome hello!
 *
 * @author admin
 * @DATE 2019-03-19
 * @PROJECT_NAME hello
 */

public class BaiDuCase {
    WebDriver driver;

    Logger logger = LogManager.getLogger(BaiDuCase.class);
    BrowerDriver browerDriver = new BrowerDriver(driver);

    @Test
    public void runBD() throws InterruptedException{
        BaiDuStep baiDuStep = new BaiDuStep( driver );
        baiDuStep.BaiDuStep();
    }

    @BeforeTest
    public void beforeTest() {
        driver = browerDriver.openDriver();
    }


    @AfterTest
    public void afterTest() {
        browerDriver.closeBrower();
    }
}
