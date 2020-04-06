package bep.chatapp.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatClient extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        String fxmlPagina = "ChatApp.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPagina));
        Parent root = loader.load();
        ChatAppController controller = loader.getController();

        stage.setOnCloseRequest(e -> controller.closeConnection());
        stage.setTitle("ChatApplication 1.0");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
