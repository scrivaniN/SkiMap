package me.jaxbot.skimap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import com.google.gson.Gson;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by nickscrivani on 4/30/18.
 */

public class SkiModel {
    String name;
    String liftCount;
    String runCount;
    String OpeningYear;
    String longestRun;
    String topElevation;
    String bottomElevation;



    public void getSkiAreas(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Gson gson = new Gson();
                    URL url = new URL("https://skimap.org/SkiAreas/view/493.json");
                    URLConnection uc = url.openConnection();
                    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                    //SkiModel ski = gson.fromJson()


                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }
}
