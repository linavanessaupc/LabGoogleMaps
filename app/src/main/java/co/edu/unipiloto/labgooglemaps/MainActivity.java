package co.edu.unipiloto.labgooglemaps;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLocationMuseo(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Museo+Nacional+de+Colombia,+Bogotá,+Cundinamarca");
        openMap(gmmIntentUri);
    }

    public void showLocationCatedral(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=5.0153,-74.0059(Catedral de Sal de Zipaquirá)");
        openMap(gmmIntentUri);
    }

    public void showLocationJaime(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=4.9869,-74.0468(Parque Jaime Duque)");
        openMap(gmmIntentUri);
    }

    public void getDirectionsToMuseo(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.6534,-74.0833&destination=4.6114,-74.0698&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    public void getDirectionsToCatedral(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.6534,-74.0833&destination=5.0153,-74.0059&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    public void getDirectionsToJaime(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.6534,-74.0833&destination=4.9869,-74.0468&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    public void getDirectionsToMedellin(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.6534,-74.0833&destination=6.2442,-75.5812&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    public void getDirectionsToSaoPaulo(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.6534,-74.0833&destination=-23.5505,-46.6333&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    private void openMap(Uri uri) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
        mapIntent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(mapIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "Por favor, instala una aplicación de mapas", Toast.LENGTH_LONG).show();
        }
    }

    private void openDirections(Uri uri) {
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
