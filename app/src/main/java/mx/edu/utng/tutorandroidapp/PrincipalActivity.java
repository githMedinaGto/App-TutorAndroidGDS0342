package mx.edu.utng.tutorandroidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
                intenUno = new Intent(PrincipalActivity.this, ConceptosActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_dev:
                msg += "Desarrollador";
                intenUno = new Intent(PrincipalActivity.this, DesarrolladorActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_mvc:
                msg += "Modelo vista controlador";
                intenUno = new Intent(PrincipalActivity.this, VistaControladorActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_gui:
                msg += "Elementos Gráficos de Usuario";
                intenUno = new Intent(PrincipalActivity.this, GUIActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_ide:
                msg +="Entorno de Desarrollo";
                intenUno = new Intent(PrincipalActivity.this, IDEActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_nativas:
                msg += "Nativas";
                intenUno = new Intent(PrincipalActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_mo_nativa:
                msg += "No Nativas";
                intenUno = new Intent(PrincipalActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_multiplataforma:
                msg += "Multiplataforma";
                intenUno = new Intent(PrincipalActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            default:
                msg += "No programada";
                break;
        }
        Toast.makeText(PrincipalActivity.this, msg, Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

    public void manejarOpcion(View view) {
        //Aqui se programara el switch
        String mensaje = "La opción sellecionada: ";
        Intent intento;
        switch (view.getId()){
            case R.id.btn_tipo_apps:
                mensaje += "Tipos de apps";
                intento = new Intent(PrincipalActivity.this, AplicacionActivity.class);
                startActivity(intento);
                break;
            case R.id.btn_conceptos:
                mensaje += "Conceptos Basicos";
                intento = new Intent(PrincipalActivity.this, ConceptosActivity.class);
                startActivity(intento);
                break;
            case R.id.btn_mvc:
                mensaje += "Modelo vista controlador";
                intento = new Intent(PrincipalActivity.this, VistaControladorActivity.class);
                startActivity(intento);
                break;
            case R.id.btn_dev:
                mensaje += "Datos de Desarrollador";
                //Falta crear activity de Desarrollador
                intento = new Intent(PrincipalActivity.this, DesarrolladorActivity.class);
                startActivity(intento);
                break;
            case R.id.btn_ide:
                mensaje += "Entorno de desarrollo";
                intento = new Intent(PrincipalActivity.this, IDEActivity.class);
                startActivity(intento);
                break;
            case R.id.btn_gui:
                mensaje += "Interface gráfica de usuario";
                intento = new Intent(PrincipalActivity.this, GUIActivity.class);
                startActivity(intento);
                break;
            //....
            //Falta definir más case...
            default:
                mensaje += "La opción seleccionada a un no esta programada";
        }
        Toast.makeText(PrincipalActivity.this, mensaje, Toast.LENGTH_LONG).show();
    }
}
