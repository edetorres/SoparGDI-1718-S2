package edu.lasalle.gdi.convocatoria.sopar.desktop.javafx;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;


public class MainWindow extends Application {

    public static void main(String[] args) {
        MainWindow.launch(MainWindow.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ButtonType yes = new ButtonType("Si, i tant!", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No i vull que m'ho restreguin la resta del curs", ButtonBar.ButtonData.CANCEL_CLOSE);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                "Vols assistir al sopar del GDI de dimecres 21 de febrer a les 22:00?.",
                no,
                yes);

        alert.setTitle("Sopar GDI");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == yes) {
            Alert followup = new Alert(Alert.AlertType.INFORMATION);
            followup.setTitle("Convocatoria Sopar GDI");
            followup.setHeaderText("Tasca i vins, Carrer de la Indústria, 118, 08025 Barcelona");
            followup.setContentText("Respon al correu que has rebut dient dient <Jo faig webs en Java>");

            followup.showAndWait();
        }
    }
}
