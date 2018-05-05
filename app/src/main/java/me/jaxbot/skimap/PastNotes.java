package me.jaxbot.skimap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

import static me.jaxbot.skimap.PersonalNoteView.review;

public class PastNotes extends AppCompatActivity {
        TextView mytxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_review);
            mytxtView = (TextView)findViewById(R.id.pastReviewText);




            for(String rv : review)
            {
                mytxtView.append(rv);
                mytxtView.append("\n");

            }
    }
//    public void loadNotes() throws FileNotFoundException {
//        File fc = new File("personal_notes.json");
//        Reader rNotes = new FileReader(fc);
//        PersonalNoteView.review = new ArrayList();
//
//
//        final ArrayList<String> review = new ArrayList();
//        review = gson.fromJson(rNotes,new ArrayList<review>);
//    }

}
