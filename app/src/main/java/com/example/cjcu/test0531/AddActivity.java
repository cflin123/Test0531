package com.example.cjcu.test0531;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    private EditText ed_date;
    private EditText ed_info;
    private EditText ed_amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        findViews();
    }

    private void findViews() {
        ed_date = findViewById(R.id.ed_date);
        ed_info = findViewById(R.id.ed_info);
        ed_amount = findViewById(R.id.ed_amount);
    }
}
