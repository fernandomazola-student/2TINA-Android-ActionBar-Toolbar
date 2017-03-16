package br.com.fiap.actionbartoolbarandnavigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class TelaCheiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cheia);
        //Atrelando o componente xml com uma variavel
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        //Falando qual toolbar é a principal dentro da activity
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.ic_speaker_notes_black_24dp);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }


}
