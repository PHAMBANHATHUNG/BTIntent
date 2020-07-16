package com.example.exintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data)
    {
        if ((requestCode == REQUEST_CODE) && (resultCode == RESULT_OK)) {
            TextView textView1 =
                    (TextView) findViewById(R.id.textView1);
            String returnString = data.getExtras().getString("returnData");
            textView1.setText(returnString);
        }
    }
    public void onClickA(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        final EditText editText1 = (EditText)
                findViewById(R.id.editText1);
        String myString = editText1.getText().toString();
        i.putExtra("qString", myString);
        startActivityForResult(i, REQUEST_CODE);
        //startActivity(i);

    }

}
