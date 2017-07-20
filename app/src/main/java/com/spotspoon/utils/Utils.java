package com.spotspoon.fragment;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by android on 20/7/17.
 */

public class Utils {

    /**
     * read json file from asset package
     *
     * @return
     */
    public static String readJSONFromAsset(Context context, String jsonFileName) {
        String json = null;
        try {
            InputStream inputStream = context.getAssets().open(jsonFileName);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
