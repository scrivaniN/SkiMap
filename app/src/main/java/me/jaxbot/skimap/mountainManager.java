package me.jaxbot.skimap;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import static me.jaxbot.skimap.MountainModel.h;
import static me.jaxbot.skimap.MountainModel.mountains;


/**
 * Created by nickscrivani on 4/12/18.
 * this is a model
 */



 public class mountainManager{


    /**
     *
     * Parses Xml based off which MountainID. Then adds it to my arrayList to create mountain objects.
     */

    public void getRegion() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int mID : MountainModel.mountainIDs) {

                        URL url = new URL("https://skimap.org/Regions/view/" + String.valueOf(mID) + ".xml");
                        DocumentBuilderFactory builder = DocumentBuilderFactory.newInstance();
                        DocumentBuilder db = builder.newDocumentBuilder();
                        Document doc = db.parse(new InputSource(url.openStream()));
                        doc.getDocumentElement().normalize();


                        NodeList nodeList = doc.getElementsByTagName("skiArea");

                        for (int i = 0; i < nodeList.getLength(); i++) {
                            Node p = nodeList.item(i);
                            Node l = nodeList.item(i);
                            if (p.getNodeType() == Node.ELEMENT_NODE) {
                                Element skiArea = (Element) p;
                                Element line = (Element) l;
                                String id = skiArea.getAttribute("id");


                                MountainModel.mountains.add(new MountainModel(id, getCharacterElement(line), h.get(mID)));

                                System.out.println("SkiArea id " + id + " Name: " + getCharacterElement(line));


                            }
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


