package com.example.android.tictactoe;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class tictactoe extends AppCompatActivity {
    ImageView bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9;
    int turn;
    int win[]={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe);
        bn1 = findViewById(R.id.btn1);
        bn2 = findViewById(R.id.btn2);
        bn3 = findViewById(R.id.btn3);
        bn4 = findViewById(R.id.btn4);
        bn5 = findViewById(R.id.btn5);
        bn6 = findViewById(R.id.btn6);
        bn7 = findViewById(R.id.btn7);
        bn8 = findViewById(R.id.btn8);
        bn9 = findViewById(R.id.btn9);
        turn=0;
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn==0) {
                    bn1.setImageResource(R.drawable.circle);
                    turn=1;
                    win[0]=0;
                }
                else {
                    bn1.setImageResource(R.drawable.cross);
                    turn=0;
                    win[0]=1;
                }
                win();
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn==0) {
                    bn2.setImageResource(R.drawable.circle);
                    turn=1;
                    win[1]=0;
                }
                else {
                    bn2.setImageResource(R.drawable.cross);
                    turn=0;
                    win[1]=1;
                }
                win();
            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn==0) {
                    bn3.setImageResource(R.drawable.circle);
                    turn=1;
                    win[2]=0;
                }
                else {
                    bn3.setImageResource(R.drawable.cross);
                    turn=0;
                    win[2]=1;
                }
                win();
            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn==0) {
                    bn4.setImageResource(R.drawable.circle);
                    turn=1;
                    win[3]=0;
                }
                else {
                    bn4.setImageResource(R.drawable.cross);
                    turn=0;
                    win[3]=1;
                }
                win();
            }
        });
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn==0) {
                    bn5.setImageResource(R.drawable.circle);
                    turn=1;
                    win[4]=0;
                }
                else {
                    bn5.setImageResource(R.drawable.cross);
                    turn=0;
                    win[4]=1;
                }
                win();
            }
        });
        bn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn==0) {
                    bn6.setImageResource(R.drawable.circle);
                    turn=1;
                    win[5]=0;
                }
                else {
                    bn6.setImageResource(R.drawable.cross);
                    turn=0;
                    win[5]=1;
                }
                win();
            }
        });
        bn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn==0) {
                    bn7.setImageResource(R.drawable.circle);
                    turn=1;
                    win[6]=0;
                }
                else {
                    bn7.setImageResource(R.drawable.cross);
                    turn=0;
                    win[6]=1;
                }
                win();
            }
        });
        bn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn==0) {
                    bn8.setImageResource(R.drawable.circle);
                    turn=1;
                    win[7]=0;
                }
                else {
                    bn8.setImageResource(R.drawable.cross);
                    turn=0;
                    win[7]=1;
                }
                win();
            }
        });
        bn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn==0) {
                    bn9.setImageResource(R.drawable.circle);
                    turn=1;
                    win[8]=0;
                }
                else {
                    bn9.setImageResource(R.drawable.cross);
                    turn=0;
                    win[9]=1;
                }
                win();
            }
        });


    }

    public void win() {
        int a,b,c,d,e,f,g,h,i;
        a=win[0];
        b=win[1];
        c=win[2];
        d=win[3];
        e=win[4];
        f=win[5];
        g=win[6];
        h=win[7];
        i=win[8];

        if(a==b && a==c) {
            if (a==0) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 1 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
            else if (a==1){
                Toast toast = Toast.makeText(getApplicationContext(),"Player 2 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        if(d==e && d==f) {
            if (d==0) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 1 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
            else if (d==1) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 2 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        if(g==h && g==i) {
            if (g==0) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 1 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
            else if (g==1) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 2 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        if(a==d && a==g) {
            if (a==0) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 1 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
            else if (a==1) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 2 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        if(b==e && b==h) {
            if (b==0) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 1 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
            else if (b==1) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 2 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        if(c==f && c==i) {
            if (c==0) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 1 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
            else if (c==1) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 2 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        if(a==e && a==i) {
            if (a==0) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 1 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
            else if (a==1) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 2 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        if(c==e && c==g) {
            if (c==0) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 1 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
            else if (c==1) {
                Toast toast = Toast.makeText(getApplicationContext(),"Player 2 Wins",Toast.LENGTH_LONG);
                toast.show();
            }
        }

    }

}