package com.ui.auto.step;

import com.ui.auto.element.testBaiDuElement;
import com.ui.auto.publicM.ReadPreperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Welcome hello!
 *
 * @author admin
 * @DATE 2019-03-19
 * @PROJECT_NAME hello
 */

public class BaiDuStep {
    public WebDriver driver;

    //构造函数
    public BaiDuStep(WebDriver driver){
        this.driver = driver;
    }

    public void BaiDuStep() throws InterruptedException
    {
        Logger log = LogManager.getLogger(BaiDuStep.class);
        testBaiDuElement eles = new testBaiDuElement(driver);
        log.info( "【=====================开始搜索==================】" );
        driver.get( ReadPreperties.readPro( "weburl" ) );
      //  Thread.sleep( 3000 );
        eles.iuputEle.sendKeys( "selenium" );
        Thread.sleep( 3000 );
        eles.btnEle.click();
        log.info( "【=====================搜索结束==================】"+"\n" );
    }
}
