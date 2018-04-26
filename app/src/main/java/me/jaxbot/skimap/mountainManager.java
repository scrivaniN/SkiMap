package me.jaxbot.skimap;


import android.os.AsyncTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


/**
 * Created by nickscrivani on 4/12/18.
 * this is a model
 */



 public class mountainManager{ //extends AsyncTask<Object, String, Integer> {
    String placeName;
    String longitude;
    String state;
    String stateAbbr;
    String latitude;
    int id;



    public mountainManager(){

    }

    // returns xml but i need to retrun an object to populate map
    public void getRegion() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Your implementation goes here
                    String out = new Scanner(new URL("https://skimap.org/Regions/view/282.xml").openStream(), "UTF-8").useDelimiter("\\A").next();
                    System.out.println(out);
                    // for loop to get ski areas.
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }




}


