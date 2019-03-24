package com.ui.auto.publicM;

import lombok.Data;

/**
 * Welcome !
 *
 * @author admin
 * @DATE 2019-03-19
 * @PROJECT_NAME hello
 */
@Data
public class runDriver {
    //谷歌浏览器启动路径
    String pathChromeDriver = System.getProperty( "user.dir" )+"\\lib\\chromedriver.exe";
    //IE浏览器启动路径
    String pathIEDriver = System.getProperty( "user.dir" ) + "\\lib\\IEDriverServer.exe";
}
