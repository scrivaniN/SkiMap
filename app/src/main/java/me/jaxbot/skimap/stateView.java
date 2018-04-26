package me.jaxbot.skimap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by nickscrivani on 4/18/18.
 */

public class stateView extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_state);
    }
    public void buttonOnClick(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }

}





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




