package me.jaxbot.skimap;


import android.os.AsyncTask;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

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
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


/**
 * Created by nickscrivani on 4/12/18.
 * this is a model
 */



 public class mountainManager{
    String placeName;
    String longitude;
    String state;
    String stateAbbr;
    String latitude;
    int id;



    public mountainManager(){

    }

     //returns xml but i need to retrun an object to populate map
    public void getRegion() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://skimap.org/Regions/view/282.xml");
                    DocumentBuilderFactory builder = DocumentBuilderFactory.newInstance();
                    DocumentBuilder db = builder.newDocumentBuilder();
                    Document doc = db.parse(new InputSource(url.openStream()));
                    doc.getDocumentElement().normalize();


                    NodeList nodeList = doc.getElementsByTagName("skiArea");

                    for(int i =0; i < nodeList.getLength(); i++){
                        Node p = nodeList.item(i);
                        if(p.getNodeType()==Node.ELEMENT_NODE){
                            Element skiArea = (Element) p;
                            Element line = (Element) nodeList.item(i);
                           String id = skiArea.getAttribute("id");
                            System.out.println("SkiArea id " + id + " Name: " + getCharacterElement(line));
                        }
                    }
                    // Your implementation goes here
                    //String out = new Scanner(new URL("https://skimap.org/Regions/view/282.xml").openStream(), "UTF-8").useDelimiter("\\A").next();
                   // System.out.println(out);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();


    }
        //https://stackoverflow.com/questions/8489151/how-to-parse-xml-for-cdata
    private static String getCharacterElement(Element e){
        Node child = e.getFirstChild();
        if(child instanceof CharacterData){
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return " ";
    }






}


