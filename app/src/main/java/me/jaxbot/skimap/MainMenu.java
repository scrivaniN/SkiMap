package me.jaxbot.skimap;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {
    mountainManager m = new mountainManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        System.out.println("Hello World!");
        //m.getRegion();
    }
    public void buttonOnClick(View v) {
        Intent intent = new Intent(this, State.class);
        startActivity(intent);
        new mountainManager().execute();

    }



}
