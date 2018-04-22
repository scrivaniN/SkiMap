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

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


/**
 * Created by nickscrivani on 4/12/18.
 * this is a model
 */



 public class mountainManager extends AsyncTask<Object, String, Integer> {
//    String placeName;
//    String longitude;
//    String state;
//    String stateAbbr;
//    String latitude;
//    int id;



    public mountainManager(){

    }

    @Override
    protected Integer doInBackground(Object[] objects) {
        try {
            URL url = new URL("https://skimap.org/Regions/view/282.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new InputSource(url.openStream()));
            doc.getDocumentElement().normalize();




        } catch (Exception e) {
            e.printStackTrace();
        }

        return null; // not going to return anything
    }

    protected void onPostExecute(){
        //do something with the url and xml parse.
    }



    public void getRegion(){
        String url = "https://skimap.org/Regions/view/282.xml";
        System.out.println(url);
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL(url).openStream());
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("region");

            for(int i =0; i < nodeList.getLength(); i++){
                Node node =nodeList.item(i);
            }

            System.out.println("we have opened the url");

//            NodeList errNodes = doc.getElementsByTagName("region");
//            if(errNodes.getLength() > 0){
//                Element err = (Element)errNodes.item(0);
//                System.out.println("name: " + err.getElementsByTagName("name").item(0).getTextContent());
//            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}


