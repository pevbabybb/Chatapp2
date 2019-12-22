package com.example.chatapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.chatapp.Fragments.ProfileFragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StatusActivity extends AppCompatActivity  {
    private Button mSavebtn;
    TextInputEditText mStatus;

    private DatabaseReference mStatusDatabase;
    private FirebaseUser mCurrentUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        mCurrentUser = FirebaseAuth.getInstance().getCurrentUser();
        String current_uid = mCurrentUser.getUid();

        mStatusDatabase = FirebaseDatabase.getInstance().getReference().child("Users").child(current_uid);




        mStatus =  (TextInputEditText) findViewById(R.id.status_input);
        mSavebtn = (Button)findViewById(R.id.status_btn);
        mSavebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String status = mStatus.getText().toString();
                mStatusDatabase.child("line_status").setValue(status).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if( task.isSuccessful()){
                            Toast.makeText(StatusActivity.this,"Your status will be change",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(StatusActivity.this,Main2Activity.class));
                        }else {
                            Toast.makeText(getApplicationContext(),"There war some error in saving changes",Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });


        }
    }

