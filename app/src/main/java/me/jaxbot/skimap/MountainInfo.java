package me.jaxbot.skimap;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    //ExpandableListView mountainList;
    //ExpandableListAdapter listAdapter;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_info);
       // ListView lv = (ListView) findViewById(R.id.myListView);
        //lv.setAdapter(new MyListAdapter(this,R.layout.activity_mountain_info,));
        System.out.println("Mountain info");
        textView = (TextView) findViewById(R.id.myTextView);
        Bundle bundle = getIntent().getExtras();
        String sl = bundle.getString("value");
        //Intent i = getIntent();
        //String sl = i.getStringExtra("value");

        textView.setText(sl);
        //textView.append(sl);




//        List<String> listDataHeader = new ArrayList<>();
//        HashMap<String,List<String>> listDataChild;
//        int counter = 0;
//        for(MountainModel m : MountainModel.mountains){
//            listDataHeader.add(m.name);
//
//        }

       // for(MountainModel m : mountains) {
//            // display information on screen
//            //System.out.println(m.ID);

            //ArrayAdapter adapter = new ArrayAdapter<MountainModel>(this,R.layout.activity_mountain_info, mountains);


            //ListView listView = (ListView) findViewById(R.id.myListView);
            //listView.setAdapter(adapter);
            //TextView mytext = (TextView) findViewById(R.id.myTextView);
           //Button myButton = new Button(this);

            //mytext.append(m.ID);
            //mytext.append("\n");
            //mytext.append(m.name);
            //mytext.append("\n");
//           // myButton.setText(m.name);
//
//

     //   }

    }

//    private class MyListAdapter extends ArrayAdapter<String>{
//        private int layout;
//         private MyListAdapter(Context context, int resource, List<String> objects){
//             super(context, resource, objects);
//             layout = resource;
//         }
//
//        @NonNull
//        @Override
//        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//            ViewHolder mainViewhodler = null;
//            if(convertView == null){
//                LayoutInflater inflater = LayoutInflater.from(getContext());
//                convertView = inflater.inflate(layout, parent, false);
//                ViewHolder viewholder = new ViewHolder();
//                viewholder.title = (TextView) convertView.findViewById(R.id.myTextView);
//                viewholder.button = (Button) convertView.findViewById(R.id.list_item_btn);
//                convertView.setTag(viewholder);
//            }
//            else{
//                mainViewhodler = (ViewHolder) convertView.getTag();
//               // mainViewhodler.title.setText((CharSequence) getItem(position));
//            }
//            //return super.getView(position, convertView, parent);
//            return convertView;
//        }
//    }
//    public class ViewHolder{
//        TextView title;
//        Button button;
//    }

}
