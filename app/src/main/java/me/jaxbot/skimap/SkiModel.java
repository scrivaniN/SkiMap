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
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by nickscrivani on 4/30/18.
 */

public class SkiModel {
        //String state;
        String name;
        String liftCount;
        String runCount;
        String operatingStatus;
        //String OpeningYear;
        //String longestRun;
        //String topElevation;
        //String bottomElevation;


    public static ArrayList<SkiModel> skiModels = new ArrayList();

    public SkiModel(String name, String liftCount, String runCount, String operatingStatus) {
        this.name = name;
        this.liftCount = liftCount;
        this.runCount = runCount;
        this.operatingStatus = operatingStatus;
    }


    //    public SkiModel(String state,String name, String liftCount, String runCount, String openingYear, String longestRun, String topElevation, String bottomElevation) {
//        this.state = state;
//        this.name = name;
//        this.liftCount = liftCount;
//        this.runCount = runCount;
//        OpeningYear = openingYear;
//        this.longestRun = longestRun;
//        this.topElevation = topElevation;
//        this.bottomElevation = bottomElevation;
//    }


}
