package me.jaxbot.skimap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by nickscrivani on 4/18/18.
 */

public class State extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_state);
    }
}

//        LinearLayout layout = new LinearLayout(this);
//        layout.setOrientation(LinearLayout.VERTICAL);
//
//        TextView name[];
//
//        try {
//            URL url = new URL("https://skimap.org/Regions/view/282.xml");
//            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//            DocumentBuilder db = dbf.newDocumentBuilder();
//            Document doc = db.parse(new InputSource(url.openStream()));
//            doc.getDocumentElement().normalize();
//
//            NodeList nodeList = doc.getElementsByTagName("region");
//
//            name = new TextView[nodeList.getLength()];
//
//            for (int i = 0; i < nodeList.getLength(); i++) {
//                Node node = nodeList.item(i);
//                name[i] = new TextView(this);
//
//                Element fstElmnt = (Element) node;
//                NodeList nameList = fstElmnt.getElementsByTagName("name");
//                Element nameElement = (Element) nameList.item(0);
//                nameList = nameElement.getChildNodes();
//                name[i].setText("Name = " + ((Node) nameList.item(0)).getNodeValue());
//                layout.addView(name[i]);
//            }
//        } catch (Exception e) {
//            System.out.println("XML Parsing Exception = " + e);
//        }
//    }






//    ArrayList<mountainManager> mountains = new ArrayList();
//
//
//    public void runLoop(){
//        for(int i = 0; i < mountains.size(); i++){
//            // get all attribute and populate from json/xml request
//        }
//        for(mountainManager mountain: mountains){
//
//        }
//    }




