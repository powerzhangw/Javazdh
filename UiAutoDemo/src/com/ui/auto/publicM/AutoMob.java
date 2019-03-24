package com.ui.auto.publicM;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Welcome hello!
 *
 * @author admin
 * @DATE 2019-03-19
 * @PROJECT_NAME hello
 */

public class AutoMob {
    private static String[] telFirst="134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");
    private static Logger logger  = LogManager.getLogger(AutoMob.class);
    public static int getNum(int start,int end) {
        return (int)(Math.random()*(end-start+1)+start);
    }
    public static String getTel() {
        int index=getNum(0,telFirst.length-1);
        String first=telFirst[index];
        String second=String.valueOf(getNum(1,888)+10000).substring(1);
        String third=String.valueOf(getNum(1,9100)+10000).substring(1);
        logger.info( "自动生成的手机号："+first+second+third );
        return first+second+third;
    }

}
