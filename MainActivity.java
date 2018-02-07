package edu.lasalle.mdpa.demoactivitylifecicle;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        showAlertDialogButtonClicked();
    }

    public void showAlertDialogButtonClicked() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Sopar GDI");
        builder.setMessage("Vols assistir al sopar del GDI de dimecres 21 de febrer a les 22:00?.");

        builder.setPositiveButton("Si, i tant!", onClickListener);
        builder.setNegativeButton("No i vull que m'ho restreguin la resta del curs", null);

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Convocatoria Sopar GDI");
            String message = "Tasca i vins, Carrer de la Indústria, 118, 08025 Barcelona";
            builder.setMessage(message);

            AlertDialog dialog = builder.create();
            dialog.show();
        }
    };


}
