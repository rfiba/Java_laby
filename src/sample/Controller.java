package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import static java.lang.System.exit;

public class Controller {
    @FXML
    private void closeMenuItemEvent (ActionEvent event)
    {
        exit(0);
    }

    @FXML
    private void aboutMenuItemEvent ()
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Information about the author");
        alert.setContentText("Rafał Fiba - 2018");

        alert.showAndWait();
    }
}
