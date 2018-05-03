package me.jaxbot.skimap;

import org.w3c.dom.Element;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nickscrivani on 4/30/18.
 */

public class MountainModel {
    String ID;
    String name;
    String state;

    public static ArrayList<MountainModel> mountains = new ArrayList();

    public static  final int [] mountainIDs = new int[] {282, 294, 296,304,314,320};
    public static final HashMap<Integer,String> h = new HashMap();
    static{
        h.put(282, "Connecticut");
        h.put(294, "Maine");
        h.put(296, "Massachusetts");
        h.put(304, "New Hampshire");
        h.put(314, "Rhode Island");
        h.put(320, "Vermont");
    }



    public MountainModel(String ID, String name, String state) {
        this.ID = ID;
        this.name = name;
        this.state = state;
    }
    // static method add mountain
    @Override
    public String toString() {
        return this.ID + ". Name: " + this.name;
    }

//    public static String stateLookUp(int id){
//
//        h.get(id);
//        return string;
//    }

}
