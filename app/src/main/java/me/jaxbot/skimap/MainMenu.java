package me.jaxbot.skimap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

/**
 * This class provides a Main Menu view
 * calls the getRegion method to grab all mountains at the start of the program.
 * store them into a mountainID array which maps them to the right state in my Hashmap.
 */

public class MainMenu extends Activity implements View.OnClickListener {
    mountainManager m = new mountainManager();
    boolean alreadyExecuted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button one = (Button)findViewById(R.id.mtnBtn);
        one.setOnClickListener(this);
        Button two = (Button)findViewById(R.id.mtnReviewBtn);
        two.setOnClickListener(this);
        System.out.println("Hello World!");
        if(alreadyExecuted != true) {
            m.getRegion();
            alreadyExecuted = true;
        }

    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.mtnBtn:
                Intent intent = new Intent(this,StateView.class );
                startActivity(intent);
                break;
            case R.id.mtnReviewBtn:
                Intent i = new Intent(this,PastNotes.class);
                startActivity(i);

        }
    }
}
