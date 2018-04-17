package me.jaxbot.skimap;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by nickscrivani on 4/12/18.
 *  this is the controller class
 */

public class Brain {
    private Gson gson;

    public Brain(){
    }

    public void getRequest() throws IOException {
        URL u = new URL("https://skimap.org/SkiAreas/view/");
        URLConnection uc = u.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

        Mountain m =gson.fromJson(in,Mountain.class);

    }
}


