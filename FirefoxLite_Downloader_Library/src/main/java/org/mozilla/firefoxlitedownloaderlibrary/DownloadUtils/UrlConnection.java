package org.mozilla.firefoxlitedownloaderlibrary.DownloadUtils;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {

    public static URLConnection establishconnection(URL url)
    {

        URLConnection connection = null;
        try {
            connection = url.openConnection();
            connection.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return connection;
    }


}
