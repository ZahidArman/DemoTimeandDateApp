package sg.edu.rp.c346.id21005622.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.display_date);
        btnDisplayTime = findViewById(R.id.display_time);
        btnReset = findViewById(R.id.buttonReset);
        tvDisplay = findViewById(R.id.textDisplay);


        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            int Hour = tp.getCurrentHour();
            int Minute = tp.getCurrentMinute();
            String smallMinute;
            if(Minute < 10){
                smallMinute = "0" + Minute;
                tvDisplay.setText("Time is "+Hour+":"+smallMinute);
            }
            else{
                tvDisplay.setText("Time is "+Hour+":"+Minute);
            }



            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            int day = dp.getDayOfMonth();
            int month = dp.getMonth() + 1;
            int year = dp.getYear();

            tvDisplay.setText("Date is "+day+"/"+month+"/"+year);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);

                dp.updateDate(2020,0,01);
            }
        });






    }





}