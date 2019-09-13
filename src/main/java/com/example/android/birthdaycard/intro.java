package com.example.android.birthdaycard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class intro extends AppCompatActivity {

    String uName;
    String fName;
    public final static String EXTRA_MESSAGE = "com.example.android.birthdaycard";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void create(View v) {
        getUrName();
        getFriendName();

//
        String hbdMsg = "Happy Birthday to you, " + fName;
//        hbd.setText(hbdMsg);

//        TextView coming = (TextView) findViewById(R.id.from);
        String fromMsg = "From, " + uName;
//        coming.setText(fromMsg);

        Intent intent = new Intent(this, MainActivity.class);
        Bundle b = new Bundle();
        b.putString("userName", fromMsg);
        b.putString("friendName", hbdMsg);
        intent.putExtras(b);

        startActivity(intent);

    }

    private void getUrName() {
        EditText userName = (EditText) findViewById(R.id.userName);
        uName = userName.getText().toString();
    }

    private void getFriendName() {
        EditText friendName = (EditText) findViewById(R.id.friendName);
        fName = friendName.getText().toString();
    }
}
