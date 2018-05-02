package me.jaxbot.skimap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static me.jaxbot.skimap.MountainModel.mountainIDs;
import static me.jaxbot.skimap.MountainModel.mountains;


/**
 * Created by nickscrivani on 4/30/18.
 */

public class MountainInfo extends AppCompatActivity {
    ExpandableListView mountainList;
    ExpandableListAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_info);
        System.out.println("Mountain info");


//        List<String> listDataHeader = new ArrayList<>();
//        HashMap<String,List<String>> listDataChild;
//        int counter = 0;
//        for(MountainModel m : MountainModel.mountains){
//            listDataHeader.add(m.name);
//
//        }

        for(MountainModel m : mountains) {
//            // display information on screen
//            //System.out.println(m.ID);

            //ArrayAdapter adapter = new ArrayAdapter<MountainModel>(this,R.layout.activity_mountain_info, mountains);


            //ListView listView = (ListView) findViewById(R.id.myListView);
            //listView.setAdapter(adapter);
            TextView mytext = (TextView) findViewById(R.id.TxtView1);
           //Button myButton = new Button(this);

            mytext.append(m.ID);
            mytext.append("\n");
            mytext.append(m.name);
            mytext.append("\n");
//           // myButton.setText(m.name);
//
//

        }

    }

}
