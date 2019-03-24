package com.ui.auto.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Welcome hello!
 *
 * @author admin
 * @DATE 2019-03-19
 * @PROJECT_NAME hello
 */

public class testBaiDuElement {
    @FindBy(xpath = ".//*[@id='u1']/a[7]")
    public WebElement logBtn;

    @FindBy(xpath = ".//*[@id='kw']")
    public WebElement iuputEle;

    @FindBy(xpath = ".//*[@id='su']")
    public WebElement btnEle;
    //构造函数初始化元素
    public testBaiDuElement(WebDriver driver ){
        PageFactory.initElements(driver,this);
    }
}
