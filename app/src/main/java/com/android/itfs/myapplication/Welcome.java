package com.android.itfs.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.itfs.myapplication.dialog.LoginDialog;


public class Welcome extends AppCompatActivity {


    private com.crust87.texturevideoview.widget.TextureVideoView videoview ;

    private Button login;
    private Button signup;

    private Dialog loginDialog;
    private Button accediDialog;
    private Button esploraB;
    private EditText mail;
    private EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        videoview = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName()+"/"+ R.raw.foodvid);
        videoview.setVideoURI(uri);
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        esploraB = (Button)findViewById(R.id.esploraB);
        esploraB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openEsplora = new Intent(Welcome.this, Esplora.class);
                startActivity(openEsplora);



            }
        });


        login = (Button) findViewById(R.id.signin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginDialog= new Dialog(view.getContext());
                loginDialog.setContentView(R.layout.activity_login);
                loginDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));


                mail = (EditText) loginDialog.findViewById(R.id.mail);
                pwd = (EditText) loginDialog.findViewById(R.id.pwd);

                //eventualmente imposta come shared preferences

                accediDialog = (Button) loginDialog.findViewById(R.id.accediDialog);
                accediDialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(view.getContext(), "apro dialog login", Toast.LENGTH_LONG).show();


                        final String email = mail.getText().toString().trim();
                        final String password = pwd.getText().toString().trim();

                        if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                            if(password.length()>6){

                                LoginDialog ld = new LoginDialog(view.getContext());
                                ld.Login(email, password);


                            }
                        }
                    }
                });


                loginDialog.show();
            }
        });

        signup = (Button)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(view.getContext(), Registrazione.class);
                startActivity(i);

                };
        });


        videoview.start();



    }



}
