package me.jaxbot.skimap;





import android.content.Intent;
import android.support.v7.app.AppCompatActivity;


import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.net.URL;
import java.util.HashMap;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static me.jaxbot.skimap.MountainModel.h;


/**
 * Created by nickscrivani on 4/12/18.
 * this is a model
 */



 public class mountainManager extends AppCompatActivity{


     //returns xml but i need to retrun an object to populate map
    // each url has a different id use a hashmap to specific ids all buttons work the same but return what state i am in.
    public void getRegion(final int mountainID) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {


                    //Intent intent = getIntent();
                   // int mountainID = intent.getIntExtra("location",0);
                    System.out.println(mountainID);


                    URL url = new URL("https://skimap.org/Regions/view/" + String.valueOf(mountainID) + ".xml");
                    DocumentBuilderFactory builder = DocumentBuilderFactory.newInstance();
                    DocumentBuilder db = builder.newDocumentBuilder();
                    Document doc = db.parse(new InputSource(url.openStream()));
                    doc.getDocumentElement().normalize();


                    NodeList nodeList = doc.getElementsByTagName("skiArea");

                    for(int i =0; i < nodeList.getLength(); i++){
                        Node p = nodeList.item(i);
                        Node l = nodeList.item(i);
                        if(p.getNodeType()==Node.ELEMENT_NODE){
                            Element skiArea = (Element) p;
                            Element line = (Element) l;
                            String id = skiArea.getAttribute("id");


                            MountainModel.mountains.add(new MountainModel(id, getCharacterElement(line),h.get(mountainID)));

                            System.out.println("SkiArea id " + id + " Name: " + getCharacterElement(line));


                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();


    }

    /*
     * https://stackoverflow.com/questions/8489151/how-to-parse-xml-for-cdata
     * grabs the child node from the XML and returns the plain text in between tag.
     */
    private static String getCharacterElement(Element e){
        Node child = e.getFirstChild();
        if(child instanceof CharacterData){
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return " ";
    }







}


