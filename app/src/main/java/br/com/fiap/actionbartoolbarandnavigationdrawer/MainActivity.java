package br.com.fiap.actionbartoolbarandnavigationdrawer;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pegando a instancia, pegando o elemento da variavel para manipular ele
        ActionBar actionBar = getSupportActionBar();
        //Mundando o elemento titulo
        actionBar.setTitle("Exemplo");

    }

    //Metodo da actiivty

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Vamos sobrescrever para criar o menuzinho la em cima
        //Vamos falar qual xml de menu que queremos, vamos inflar o xml
        //Inflar = ler um xml e transformar em objeto de java
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    //Pegando os cliques nos elementos que estao na actionbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.mnSobre){
            Toast.makeText(this, "Clicou em sobre", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
