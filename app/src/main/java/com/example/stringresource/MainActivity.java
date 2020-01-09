package com.example.stringresource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText mEditTextAcc, mEditTextPass;
    Button mBtn;
    TextView mTvDislay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextAcc = findViewById(R.id.edittextTaikhoan);
        mEditTextPass = findViewById(R.id.edittextMatkhau);
        mBtn = findViewById(R.id.buttonDangnhap);
        mTvDislay = findViewById(R.id.textviewThongtin);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String acc = mEditTextAcc.getText().toString();
                String pass = mEditTextPass.getText().toString();

                if (acc.equals("quang") && pass.equals("123")) {
                    String lableAcc = getResources().getString(R.string.lable_show_acc);
                    String lablePass = getResources().getString(R.string.lable_show_pass);

                    mTvDislay.setText(lableAcc+": " + acc + "\n" + lablePass+": " + pass);
                }
                else {

                    Toast.makeText(MainActivity.this,"Wrong info",Toast.LENGTH_SHORT);
                }
            }
        });


    }
}
