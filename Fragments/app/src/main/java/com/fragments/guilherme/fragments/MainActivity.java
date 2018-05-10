package com.fragments.guilherme.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn2;
    Exemplo fragment;
    Exemplo2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        fragment = Exemplo.newInstance();
        fragment2 = Exemplo2.newInstance();
    }
    //limpa a view do LinearLayout e add um fragment Exemplo a mesma view
    public void puxarFragment(View v){
        LinearLayout ll = findViewById(R.id.l1);
        ll.removeView(view);

        LayoutInflater li = getLayoutInflater();
        view = fragment.onCreateView(li, null, null);
        ll.addView(view);
    }
    //limpa a view do LinearLayout e add um fragment Exemplo2 a mesma view
    public void puxarFragment2(View v){
        LinearLayout ll = findViewById(R.id.l1);
        ll.removeView(view);

        LayoutInflater li = getLayoutInflater();
        view = fragment2.onCreateView(li, null, null);
        ll.addView(view);
    }
    View view;
}