package com.ui.auto.publicM;

import java.io.*;
import java.util.Properties;

/**
 * Welcome hello!
 *
 * @author admin
 * @DATE 2019-03-19
 * @PROJECT_NAME hello
 */

public class ReadPreperties {
    //根据Key读取Value
    public static String readPro(String keys){
        File file = new File( System.getProperty( "user.dir" )+"/src/conf/config.properties" );
        FileInputStream inpf = null;
        try {
            inpf = new FileInputStream( file );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties p = new Properties( );
        BufferedReader bf = new BufferedReader( new InputStreamReader( inpf ) );
        try {
            p.load( bf );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p.getProperty( keys );
    }
    //写入Properties信息
    public static String WriteProperties(String filePath, String pKey, String pValue) throws IOException{

        Properties ps = new Properties(  );

        InputStream in = new FileInputStream( filePath );
        ps.load( in );

        OutputStream out = new FileOutputStream( filePath );
        ps.setProperty( pKey,pValue );
        ps.store( out,"Update"+ pKey + "name" );
        return filePath;
    }
}
