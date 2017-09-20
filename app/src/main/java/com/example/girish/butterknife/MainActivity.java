package com.example.girish.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
// Binding the text view
    @BindView(R.id.textView)
    TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Use this to bind the activity
        ButterKnife.bind(this);
        t1.setText("Hello am ButterKnife");


        }

    @OnClick(R.id.button)
    public void submit(){
        Toast.makeText(getApplicationContext(), " ButterKnife button", Toast.LENGTH_LONG).show();
    }
}
