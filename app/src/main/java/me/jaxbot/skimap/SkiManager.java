package me.jaxbot.skimap;



import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import static me.jaxbot.skimap.MountainModel.h;

/**
 * Created by nickscrivani on 5/2/18.
 */

public class SkiManager {
Gson gson = new Gson();

    public void getSkiIds(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://skimap.org/SkiAreas/view/3261.json");
                    URLConnection uc = url.openConnection();
                    BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
                    SkiModel sm = gson.fromJson(in, SkiModel.class);
                    System.out.println(sm);


                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();

    }
}
