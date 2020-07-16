package com.example.exintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String qString = extras.getString("qString");
        final TextView textView = (TextView)
                findViewById(R.id.textView1);
        textView.setText(qString);    }
    public void finish() {
        Intent data = new Intent();
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        String returnString = editText1.getText().toString();
        data.putExtra("returnData", returnString);
        setResult(RESULT_OK, data);
        super.finish();
    }
    public void onClickB(View view) {
        finish();
    }
}
