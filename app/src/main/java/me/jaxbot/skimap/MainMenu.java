package me.jaxbot.skimap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {
    mountainManager m = new mountainManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        System.out.println("Hello World!");
    }
    public void buttonOnClick(View v) {
        Intent intent = new Intent(this, stateView.class);
        startActivity(intent);
        m.getRegion();

    }



}
