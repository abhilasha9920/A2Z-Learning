package com.example.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b;
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        b   = findViewById(R.id.b1);
        tv3 = findViewById(R.id.tv3);

        Intent aaya = getIntent();
        String one = aaya.getStringExtra("pehla");
        String two = aaya.getStringExtra("doosra");
        et1.setText(one);
        et2.setText(two);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et2.getText().toString());
                int k = i + j;
                tv3.setText("Result is : " + k);
                Toast.makeText(MainActivity.this, "You got answer" + k , Toast.LENGTH_LONG).show();
                Intent it = new Intent(MainActivity.this, SideActivity.class);
                it.putExtra("pehla",et1.getText().toString());
                it.putExtra("doosra",et2.getText().toString());
                startActivity(it);
            }
        });
    }
    public void doing(View V) {
        int i = Integer.parseInt(et1.getText().toString());
        int j = Integer.parseInt(et2.getText().toString());
        int k = i + j;
        tv3.setText("Result is : " + k);
    }
}
