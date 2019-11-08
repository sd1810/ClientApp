package com.jayesh.clientapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        editText=findViewById(R.id.editText4);
        textView=findViewById(R.id.textView2);

        myDb = new DatabaseHelper(this);
    }

    public void find(View view)
    {
        String str1=editText.getText().toString();
        String str2=myDb.searchData(str1);
        textView.setText(str2);
    }
}
