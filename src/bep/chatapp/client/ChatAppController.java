package bep.chatapp.client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.PrintWriter;
import java.net.Socket;

public class ChatAppController {
    @FXML private TextField chatField;
    @FXML private TextArea chatBox;
    @FXML private Button submit;
    @FXML private TextField chatName;

    private Socket connection;
    private PrintWriter serverWriter;

    public ChatAppController() {
        /*
         * Open hier een socket naar de server (waarschijnlijk localhost),
         * en ken deze socket toe (assignment) aan het attribuut 'connection'.
         *
         * Start een MessageListener-thread (zie onder).
         * Geef een melding in de chatBox als er iets misgaat (exception).
         */
    }

    @FXML
    private void sendMessage() {
        /*
         * Controleer of er een gebruikersnaam is ingevoerd, of geef een melding in de chatBox
         * Controleer of er een bericht is ingevoerd, of geef een melding in de chatBox!
         *
         * Disable het TextField waarin de gebruikersnaam is ingevoerd zodat deze niet gewijzigd kan worden!
         * Gebruik het attribuut 'serverWriter' om een bericht naar de server te printen!
         *  Het bericht moet bevatten: "Naam" : "Bericht"
         *
         * Maak het chatField leeg om weer een nieuw bericht te kunnen typen!
         */
    }

    private class MessageListener extends Thread {
        public void run() {
            /*
             * Open de inputstream van de socket, en bekijk met (bijv.)
             * een Scanner of 'next lines' zijn. Als er een nieuwe regel
             * (chatbericht) binnenkomt, print deze dan in de chatBox.
             *
             * Dit proces moet doorgaan totdat er geen 'next lines' meer
             * zijn (wat betekent dat de socket is gesloten).
             */
        }
    }

    public void closeConnection() {
        /* Sluit hier de Socket! */
    }
}