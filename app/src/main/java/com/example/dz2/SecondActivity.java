package com.example.dz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView ticketID;
    private Button button2;

    private TicketStructure user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ticketID = findViewById(R.id.ticketID);
        button2 = findViewById(R.id.button2);

        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) {

            user = (TicketStructure) bundleIntent.getSerializable(TicketStructure.class.getSimpleName());

            ticketID.setText("ID пассажира " + user.getName() + "\n"
            + "Время прибытия поезда " + user.getTime()+ "\n"
            + "Время отправления поезда " + user.getTime2() + "\n"
            + "Стоимость билета " + user.getTicket());
        }

        button2.setOnClickListener(listener);

    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(getApplicationContext(), MainActivity.class);

            startActivity(intent);

        }


    };
}