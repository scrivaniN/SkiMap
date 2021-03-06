package me.jaxbot.skimap;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nickscrivani on 4/30/18.
 */

/**
 * Mountain Model class
 * this class uses a Hashmap to map key value pairs of the different states to the right ID.
 * has a static ArrayList to store mountain objects.
 */
public class MountainModel {
     String ID;
     String name;
     String state;


    private ArrayList<String> review = new ArrayList();
    public static ArrayList<MountainModel> mountains = new ArrayList();
    private Gson gson;

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


}
