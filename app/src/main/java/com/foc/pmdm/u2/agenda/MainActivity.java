package com.foc.pmdm.u2.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Persona []lista={ new Persona("Antonio","Fernandez",10),
            new Persona("Jose","Perez",10),
            new Persona("Federico","Garcia",12),
            new Persona("Lorenzo","Lopez",30)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);

        MyAdapter ma=new MyAdapter(this,lista);

        listView.setAdapter(ma);
    }
}
