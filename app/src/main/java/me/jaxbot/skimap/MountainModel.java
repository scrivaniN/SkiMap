package me.jaxbot.skimap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
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
    PersonalNoteView pn;

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
        gson = new Gson();
    }

    public void save() throws IOException {
        ArrayList<String> review = new ArrayList();
        String getInput = pn.editText.getText().toString() ;
        String getName = pn.mountainName.getText().toString();
        String getDate = pn.date.getText().toString();
        review.add(getName);
        review.add(getDate);
        review.add(getInput);

        String Note = gson.toJson(review);


        File f = new File("personal_notes.json");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Note);
        bw.close();

    }
//    public void loadNotes() throws FileNotFoundException {
//        File fc = new File("personal_notes.json");
//        Reader rNotes = new FileReader(fc);
//        review = new ArrayList();
//
//
//        ArrayList<String> review = new ArrayList();
//        review = gson.fromJson(rNotes,);
//    }
}
