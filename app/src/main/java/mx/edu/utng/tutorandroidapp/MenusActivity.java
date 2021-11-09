package mx.edu.utng.tutorandroidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class MenusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://codigofacilito.com/articulos/menus-en-android");
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater infla = getMenuInflater();
        infla.inflate(R.menu.menu_opciones, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String msg= "Opción seleccionada: ";
        Intent intenUno;
        switch (item.getItemId()){
            case R.id.item_tipos:
                msg += "Tipos de apps";
                break;
            case R.id.item_conceptos:
                msg += "Conceptos";
                intenUno = new Intent(MenusActivity.this, ConceptosActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_dev:
                msg += "Desarrollador";
                intenUno = new Intent(MenusActivity.this, DesarrolladorActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_mvc:
                msg += "Modelo vista controlador";
                intenUno = new Intent(MenusActivity.this, VistaControladorActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_gui:
                msg += "Elementos Gráficos de Usuario";
                intenUno = new Intent(MenusActivity.this, GUIActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_ide:
                msg +="Entorno de Desarrollo";
                intenUno = new Intent(MenusActivity.this, IDEActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_nativas:
                msg += "Nativas";
                intenUno = new Intent(MenusActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_mo_nativa:
                msg += "No Nativas";
                intenUno = new Intent(MenusActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_multiplataforma:
                msg += "Multiplataforma";
                intenUno = new Intent(MenusActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            default:
                msg += "No programada";
                break;
        }
        Toast.makeText(MenusActivity.this, msg, Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

    public void regresaPrincipal(View view) {
        Intent intento = new Intent(MenusActivity.this, GUIActivity.class);
        startActivity(intento);
    }
}