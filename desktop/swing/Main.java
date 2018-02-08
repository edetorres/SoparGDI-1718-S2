package edu.lasalle.gdi.convocatoria.sopar.desktop.swing;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Object[] options = {
                "Si, i tant!",
                "No i vull que m'ho restreguin la resta del curs"
        };
        int n = JOptionPane.showOptionDialog(null,
                "Vols assistir al sopar del GDI de dimecres 21 de febrer a les 22:00?.",
                "Sopar GDI",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        if (n == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Tasca i vins, Carrer de la Indústria, 118, 08025 Barcelona" +
                    "\nRespon al correu que has rebut dient dient <Jo faig webs en Java>",
                    "Convocatoria Sopar GDI",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

    }
}
