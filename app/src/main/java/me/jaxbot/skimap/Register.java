package me.jaxbot.skimap;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    private EditText username, userPassword, userEmail;
    private Button regButton;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText)findViewById(R.id.editUserName);
        userPassword = (EditText)findViewById(R.id.editTextPassword);
        userEmail = (EditText)findViewById(R.id.editTextEmail);
        regButton = (Button)findViewById(R.id.registerBtn);

        firebaseAuth = FirebaseAuth.getInstance();

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if( signUp()){
                   //Register to DataBase
                   String user_email = userEmail.getText().toString().trim();
                   String user_password = userPassword.getText().toString().trim();

                   firebaseAuth.createUserWithEmailAndPassword(user_email,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                       @Override
                       public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isComplete()){
                            Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Register.this, LogIn.class));
                        }else{
                            Toast.makeText(Register.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                        }
                       }
                   });
               }
            }
        });



    }
    private Boolean signUp(){
        Boolean result = false;

        String name = username.getText().toString();
        String password = userPassword.getText().toString();
        String email = userEmail.getText().toString();

        if(name.isEmpty() && password.isEmpty() && email.isEmpty()){
            Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show();
        }else{
            result = true;
        }
        return result;
    }
}
