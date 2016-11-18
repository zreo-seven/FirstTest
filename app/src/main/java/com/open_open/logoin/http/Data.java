package com.open_open.logoin.http;

import com.open_open.logoin.Apis;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ${yong} on 2016/11/18.
 */

public class Data extends Thread {
    private String username;
    private String password;
    @Override
    public void run() {
        try {
            URL url = new URL(Apis.LOGIN+"?username="+username+"&password="+password);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(5000);
            conn.setConnectTimeout(5000);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Charset", "UTF-8");
            conn.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
            conn.connect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
