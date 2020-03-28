package chapter.android.aweme.ss.com.homework;

import android.app.Application;

/*************homework************/
public class AppContext extends Application {
    public static final int NETTYPE_WIFI = 0x01;
    public static final int NETTYPE_CMWAP = 0x02;
    public static final int NETTYPE_CMNET = 0x03;

    public static final int PAGE_SIZE = 20;
    private static final int CACHE_TIME = 10 * 60000;

    private String logInfo;

    public String getLogInfo(){
        return logInfo;
    }

    public void setLogInfo(String s){
        this.logInfo = s;
    }

    @Override
    public void onCreate(){
    super.onCreate();
    setLogInfo("");
    }
}
/*********************************/

