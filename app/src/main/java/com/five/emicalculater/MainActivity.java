package com.five.emicalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

          EditText amt,intrest,mnt;
          Button cal;
          TextView  e1,tamt2,iamt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amt=findViewById(R.id.amt);
        intrest=findViewById(R.id.intrest);
        mnt=findViewById(R.id.mnt);
        cal=findViewById(R.id.cal);
        e1= findViewById(R.id.e1);
        intrest=findViewById(R.id.intrest);
        tamt2=findViewById(R.id.tamt2);
        iamt2=findViewById(R.id.iamt2);
        

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amount = Integer.parseInt(amt.getText().toString());
                double intrestrate = Double.parseDouble(intrest.getText().toString());
                int month= Integer.parseInt(mnt.getText().toString());


                double r = intrestrate/(12*100);
                double cal = 1;
                for (int i=0;i<month;i++) {
                    cal *= (1 + r);
                }

                double ans = amount * r * (cal/cal-1);


                e1.setText("Emi="+ans);
                double total = ans*month;
                tamt2.setText("total amt= "+total);
                double intrest  = total- amount;
                iamt2.setText("intest amt = +intrest");




            }
        });

    }
}