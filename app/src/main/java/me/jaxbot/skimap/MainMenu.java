package me.jaxbot.skimap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        System.out.println("Hello World!");
        mountainManager m = new mountainManager();
        SkiManager sm = new SkiManager();
        for(int id :MountainModel.mountainIDs)
            m.getRegion(id);
        sm.getSkiIds();

    }
    public void buttonOnClick(View v) {

        Intent intent = new Intent(this, StateView.class);
        startActivity(intent);

    }



}
