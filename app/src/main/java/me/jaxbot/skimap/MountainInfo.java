package me.jaxbot.skimap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;


/**
 * Created by nickscrivani on 4/30/18.
 */

public class MountainInfo extends AppCompatActivity implements View.OnClickListener {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_info);
        Button one = (Button) findViewById(R.id.reviewBtn);
        one.setOnClickListener(this);

        System.out.println("Mountain info");
        textView = (TextView) findViewById(R.id.myTextView);
        Intent i = getIntent();

        ArrayList<String> mn = i.getStringArrayListExtra("value");



        for (String item : mn) {
            textView.append(item + "\n");
        }
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.reviewBtn:
                Intent intent = new Intent(this, PersonalNoteView.class);
                System.out.println("Button was clicked");
                startActivity(intent);
                break;
        }
    }
}
