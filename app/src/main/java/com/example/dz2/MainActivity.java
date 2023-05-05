package com.example.dz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameIn;
    private EditText timetable;
    private EditText timetable2;
    private EditText ticketprice;
    private Button button;

    private String name;
    private String time;
    private String time2;
    private String ticket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameIn = findViewById(R.id.nameIn);
        timetable = findViewById(R.id.timetable);
        timetable2 = findViewById(R.id.timetable2);
        ticketprice = findViewById(R.id.ticketprice);
        button = findViewById(R.id.button);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            name = nameIn.getText().toString();
            time = timetable.getText().toString();
            time2 = timetable2.getText().toString();
            ticket = ticketprice.getText().toString();

            TicketStructure user = new TicketStructure(name, time, time2, ticket);


            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            intent.putExtra(TicketStructure.class.getSimpleName(), user);

            startActivity(intent);

        }


    };
}


