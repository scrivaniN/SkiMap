package me.jaxbot.skimap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;


public class PastNotes extends AppCompatActivity {
    TextView mytxtView;
    private FirebaseDatabase mDatabase;
    private DatabaseReference mDataBaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_review);
        mytxtView = (TextView) findViewById(R.id.pastReviewText);


        mDatabase = FirebaseDatabase.getInstance();

        mDataBaseRef = mDatabase.getReference().child("Note");

        mDataBaseRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ArrayList<String> UserList = new ArrayList();

                for (DataSnapshot dsp : dataSnapshot.getChildren()) {
                    UserList.add(String.valueOf(dsp.getValue()));
                    ;
                    System.out.println(dsp);
                }
                for (String u : UserList) {
                    mytxtView.append(u);
                    mytxtView.append("\n");
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}


