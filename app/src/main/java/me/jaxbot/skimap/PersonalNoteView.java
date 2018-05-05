package me.jaxbot.skimap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class PersonalNoteView extends AppCompatActivity {

    EditText editText;
    Button save;
    EditText mountainName;
    EditText date;
    public static ArrayList<String> review = new ArrayList();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_view);

        editText = (EditText)findViewById(R.id.myEditText);
        mountainName = (EditText)findViewById(R.id.nameEditText);
        date = (EditText)findViewById(R.id.dateEditText);
        save = (Button)findViewById(R.id.postReviewBtn);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getInput = editText.getText().toString() ;
                String getName = mountainName.getText().toString();
                String getDate = date.getText().toString();
                review.add(getName);
                review.add(getDate);
                review.add(getInput);
            }
        });


    }
//    public void save(){
//        ArrayList<String> review = new ArrayList();
//        String getInput = editText.getText().toString() ;
//        String getName = mountainName.getText().toString();
//        String getDate = date.getText().toString();
//        review.add(getName);
//        review.add(getDate);
//        review.add(getInput);
//
//        String Note = gson.toJson(review);
//
//
//        File f = new File("personal_notes.json");
//        FileWriter = new FileWriter(f);
//
//
//
//
//    }

}
