package com.example.usuario.actividad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void lazar(View view){
        Intent i = new Intent(this,Anime.class);
        startActivity(i);

    }
    public void env(View view){
        Intent j = new Intent(this,Naruto.class);
        startActivity(j);

    }
    public void enviar(View view){
        Intent k = new Intent(this,OnePiece.class);
        startActivity(k);

    }
}
