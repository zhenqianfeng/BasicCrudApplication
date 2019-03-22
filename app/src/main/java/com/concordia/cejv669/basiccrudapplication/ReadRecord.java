package com.concordia.cejv669.basiccrudapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReadRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_record);

        Button b_FetchData = findViewById(R.id.btn_read_get);
        Button b_GoToMain = findViewById(R.id.btn_read_back);

        b_GoToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        b_FetchData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputId = findViewById(R.id.edit_empid);
                TextView viewFirst = findViewById(R.id.text_read_first);
                TextView viewLast = findViewById(R.id.text_read_last);
                TextView viewInsured = findViewById(R.id.text_read_ins);

                DBClass dbc = new DBClass (getApplicationContext());

                Employee e = dbc.getEmployee(Integer.valueOf(inputId.getText().toString()));

                viewFirst.setText(e.getFirstName());
                viewLast.setText(e.getLastName());
                viewInsured.setText(e.isInsured()? "Insured" : "Not Insured");
            }
        });
    }
}
