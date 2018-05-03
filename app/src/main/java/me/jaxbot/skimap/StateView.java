package me.jaxbot.skimap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static me.jaxbot.skimap.MountainModel.mountains;


/**
 * Created by nickscrivani on 4/18/18.
 */

public class StateView extends AppCompatActivity implements View.OnClickListener {
    //mountainManager m  = new mountainManager();

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

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MountainInfo.class);
        int locationID = 0;
      switch(view.getId()){

          case R.id.connBtn:
              for(MountainModel m : mountains){
                  if(m.state == "Connecticut"){
                      String sl = m.name;
                      intent.putExtra("value", sl);
                  }
              }



              break;
          case R.id.maineBtn:
              for(MountainModel m : mountains){
                  if (m.state == "Maine") {
                        String sl = m.name;
                        intent.putExtra("value", sl);
                    }
              }
              break;
          case R.id.massBtn:
              System.out.println("Mass button pressed");
              for(MountainModel m : mountains){
                  if(m.state == "Massachusetts"){
                      String sl = m.name;
                      intent.putExtra("value", sl);
                  }
              }

              break;
          case R.id.NHBtn:
              System.out.println("NH button pressed");
              for(MountainModel m : mountains){
                  if(m.state == "New Hampshire"){
                      String sl = m.name;
                      intent.putExtra("value", sl);
                  }
              }

              break;
          case R.id.rhodeBtn:
              System.out.println("rhode button pressed");
              for(MountainModel m : mountains){
                  if(m.state == "Rhode Island"){
                      String sl = m.name;
                      intent.putExtra("value", sl);
                  }
              }
              break;
          case R.id.vermontBtn:
              System.out.println("vermont button pressed");
              for(MountainModel m : mountains){
                  if(m.state == "Vermont"){
                      String sl = m.name;
                      intent.putExtra("value", sl);
                  }
              }
      }
        //m.getRegion(locationID);
        startActivity(intent);
        //m.getRegion(locationID);

    }
}









