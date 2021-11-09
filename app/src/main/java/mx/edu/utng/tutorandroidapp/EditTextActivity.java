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

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.develou.com/edittext-android/");
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
                intenUno = new Intent(EditTextActivity.this, ConceptosActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_dev:
                msg += "Desarrollador";
                intenUno = new Intent(EditTextActivity.this, DesarrolladorActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_mvc:
                msg += "Modelo vista controlador";
                intenUno = new Intent(EditTextActivity.this, VistaControladorActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_gui:
                msg += "Elementos Gráficos de Usuario";
                intenUno = new Intent(EditTextActivity.this, GUIActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_ide:
                msg +="Entorno de Desarrollo";
                intenUno = new Intent(EditTextActivity.this, IDEActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_nativas:
                msg += "Nativas";
                intenUno = new Intent(EditTextActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_mo_nativa:
                msg += "No Nativas";
                intenUno = new Intent(EditTextActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_multiplataforma:
                msg += "Multiplataforma";
                intenUno = new Intent(EditTextActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            default:
                msg += "No programada";
                break;
        }
        Toast.makeText(EditTextActivity.this, msg, Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

    public void regresaPrincipal(View view) {
        Intent intento = new Intent(EditTextActivity.this, GUIActivity.class);
        startActivity(intento);
    }
}