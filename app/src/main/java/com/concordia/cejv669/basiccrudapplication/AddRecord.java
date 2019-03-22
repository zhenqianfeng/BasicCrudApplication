package com.concordia.cejv669.basiccrudapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class AddRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        Button b_add = findViewById(R.id.btn_save);

        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DBClass dbc = new DBClass(getApplicationContext());

                EditText editId = findViewById(R.id.edit_id);
                EditText editFirst = findViewById(R.id.edit_firstname);
                EditText editLast = findViewById(R.id.edit_lastname);
                ToggleButton toggleIns = findViewById(R.id.toggleButton);

                Employee newEmp = new Employee(Integer.valueOf(editId.getText().toString()),
                        editFirst.getText().toString(),
                        editLast.getText().toString(),
                        toggleIns.isChecked());

                dbc.addEmployee(newEmp);

                Toast.makeText(getApplicationContext(),"Record added!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
