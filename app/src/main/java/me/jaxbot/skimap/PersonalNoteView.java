package me.jaxbot.skimap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class PersonalNoteView extends AppCompatActivity {

    EditText editText;
    Button save;
    EditText mountainName;
    EditText day;

    private FirebaseDatabase mDatabase;
    private DatabaseReference mDataBaseRef;

    private TextView TextView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_note_view);

        editText = (EditText) findViewById(R.id.myEditText);
        mountainName = (EditText) findViewById(R.id.nameEditText);
        day = (EditText) findViewById(R.id.dateEditText);
        save = (Button) findViewById(R.id.postReviewBtn);
        TextView5 = (TextView) findViewById(R.id.textView5);


        mDatabase = FirebaseDatabase.getInstance();

        mDataBaseRef = mDatabase.getReference("Note");


        mDataBaseRef.child("Notes");


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getName = mountainName.getText().toString();
                String getInput = editText.getText().toString();
                String getDate = day.getText().toString();

                String userNote = mDataBaseRef.push().getKey();


                UserData user = new UserData();

                user.setDate(getDate);
                user.setMountainName(getName);
                user.setNote(getInput);
                mDataBaseRef.child(userNote).setValue(user);

                mountainName.setText("");
                day.setText("");
                editText.setText("");


                Toast.makeText(PersonalNoteView.this, "Note Saved", Toast.LENGTH_SHORT).show();


            }
        });


    }
}


