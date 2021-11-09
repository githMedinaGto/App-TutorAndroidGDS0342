package mx.edu.utng.tutorandroidapp;

import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class IDEActivity extends AppCompatActivity {

        VideoView mVideoView;
        MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideactivity);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.yeeply.com/blog/entornos-programacion-desarrollar-apps-android/");

        /*mediaController = new MediaController(this);
        mVideoView = findViewById(R.id.video_view);

        mediaController.setAnchorView(mVideoView);
        Uri localUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ide);
        mVideoView.setVideoURI(localUri);
        mVideoView.setMediaController(mediaController);
        mVideoView.start();*/

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
                intenUno = new Intent(IDEActivity.this, ConceptosActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_dev:
                msg += "Desarrollador";
                intenUno = new Intent(IDEActivity.this, DesarrolladorActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_mvc:
                msg += "Modelo vista controlador";
                intenUno = new Intent(IDEActivity.this, VistaControladorActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_gui:
                msg += "Elementos Gráficos de Usuario";
                intenUno = new Intent(IDEActivity.this, GUIActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_ide:
                msg +="Entorno de Desarrollo";
                intenUno = new Intent(IDEActivity.this, IDEActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_nativas:
                msg += "Nativas";
                intenUno = new Intent(IDEActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_mo_nativa:
                msg += "No Nativas";
                intenUno = new Intent(IDEActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            case R.id.item_multiplataforma:
                msg += "Multiplataforma";
                intenUno = new Intent(IDEActivity.this, AplicacionActivity.class);
                startActivity(intenUno);
                break;
            default:
                msg += "No programada";
                break;
        }
        Toast.makeText(IDEActivity.this, msg, Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

    public void regresaPrincipal(View view) {
        Intent intento = new Intent(IDEActivity.this, PrincipalActivity.class);
        startActivity(intento);
    }
}