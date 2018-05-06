package me.jaxbot.skimap;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static me.jaxbot.skimap.MountainModel.mountains;


/**
 * Created by nickscrivani on 4/18/18.
 */

public class StateView extends AppCompatActivity implements View.OnClickListener{
        //MountainModel m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_state);
        System.out.println("Hello World!");
        Button one = (Button) findViewById(R.id.connBtn);
        one.setOnClickListener(this);
        Button two = (Button) findViewById(R.id.maineBtn);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.massBtn);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.NHBtn);
        four.setOnClickListener(this);
        Button five = (Button) findViewById(R.id.rhodeBtn);
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.vermontBtn);
        six.setOnClickListener(this);


    }

    /**
     *
     * @param view
     * This method grabs all mountains in the specific state based off buttonClick,
     * and send it to the next activity.
     */
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MountainInfo.class);
        ArrayList<String> names = new ArrayList<>();
      switch(view.getId()){

          case R.id.connBtn:
              for(MountainModel m : mountains){
                  if(m.state == "Connecticut"){
                      names.add(m.name);
                  }
              }
              intent.putStringArrayListExtra("value", names);
              break;
          case R.id.maineBtn:
              for(MountainModel m : mountains){
                  if (m.state == "Maine") {
                      names.add(m.name);
                    }
              }
              intent.putStringArrayListExtra("value", names);
              break;
          case R.id.massBtn:
              System.out.println("Mass button pressed");
              for(MountainModel m : mountains){
                  if(m.state == "Massachusetts"){
                      names.add(m.name);
                  }
              }
              intent.putStringArrayListExtra("value", names);
              break;
          case R.id.NHBtn:
              System.out.println("NH button pressed");
              for(MountainModel m : mountains){
                  if(m.state == "New Hampshire"){
                      names.add(m.name);
                  }
              }
              intent.putStringArrayListExtra("value", names);
              break;
          case R.id.rhodeBtn:
              System.out.println("rhode button pressed");
              for(MountainModel m : mountains){
                  if(m.state == "Rhode Island"){
                      names.add(m.name);
                  }
              }
              intent.putStringArrayListExtra("value", names);
              break;
          case R.id.vermontBtn:
              System.out.println("vermont button pressed");
              for(MountainModel m : mountains){
                  if(m.state == "Vermont"){
                      names.add(m.name);
                  }
              }
              intent.putStringArrayListExtra("value", names);


      }
        startActivity(intent);
    }
}









