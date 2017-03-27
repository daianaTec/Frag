package com.example.root.frag;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.root.frag.R.layout.frag;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Frag fragment = new Frag();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor,fragment);

        btnf1= (Button)findViewById(R.id.btnFrag);

        btnf1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        Frag fragment = new Frag();

        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();

        transition.replace(R.id.contenedor,fragment);
        transition.commit();

    }
}
