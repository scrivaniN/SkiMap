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
import com.google.firebase.auth.FirebaseUser;

public class LogIn extends AppCompatActivity {
    mountainManager m = new mountainManager();

    private EditText name;
    private EditText password;
    private Button login;
    private TextView signup;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        name = (EditText)findViewById(R.id.editName);
        password = (EditText)findViewById(R.id.editPassword);
        login = (Button)findViewById(R.id.logInBtn);
        signup = (TextView)findViewById(R.id.registerTxtView);

        m.getRegion();
        firebaseAuth = FirebaseAuth.getInstance();

        FirebaseUser user = firebaseAuth.getCurrentUser();

//        if(user != null){
//            finish();
//            startActivity(new Intent(LogIn.this, MainMenu.class));
//        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn(name.getText().toString(), password.getText().toString());
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogIn.this, Register.class);
                startActivity(intent);
            }
        });
    }
    private void signIn(String userName, String userPassword){
        firebaseAuth.signInWithEmailAndPassword(userName,userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    startActivity(new Intent(LogIn.this, MainMenu.class));
                    Toast.makeText(LogIn.this,"Login Successful", Toast.LENGTH_SHORT).show();


                }else{
                    Toast.makeText(LogIn.this,"Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
