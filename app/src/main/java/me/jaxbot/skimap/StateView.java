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
    mountainManager m  = new mountainManager();

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
//              Intent i = new Intent(this, MountainInfo.class);
//              i.putExtra("location",view.getId());
              //locationID = 282;



              break;
          case R.id.maineBtn:
              //System.out.println("Maine button pressed");


//              //intent.putExtra("location",294);
             // for(MountainModel m : mountains){
                  // display information on screen
                  //System.out.println(m.ID);
                   // if (m.state == "Maine") {
//                        TextView mytext = (TextView) findViewById(R.id.TxtView1);
//                        // Button myButton = (Button) findViewById(R.id.TxtView1);
//                        mytext.append(m.ID);
//                        mytext.append("\n");
//                        mytext.append(m.name);
//                        mytext.append("\n");
//                        // myButton.setText(m.name);
 //                       System.out.println(m.ID);
                       // System.out.println(m.name);


              //      }
              //}
               // break;
          case R.id.massBtn:
              System.out.println("Mass button pressed");
              //intent.putExtra("location",296);
              locationID = 296;
              break;
          case R.id.NHBtn:
              System.out.println("NH button pressed");
              //intent.putExtra("location",304);
              locationID = 304;
              break;
          case R.id.rhodeBtn:
              System.out.println("rhode button pressed");
              //intent.putExtra("location",314);
              locationID = 314;
              break;
          case R.id.vermontBtn:
              System.out.println("vermont button pressed");
              //intent.putExtra("location",320);
              locationID = 320;
      }
        //m.getRegion(locationID);
        startActivity(intent);
        //m.getRegion(locationID);

    }
}









