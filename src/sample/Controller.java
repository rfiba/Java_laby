package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static java.lang.System.exit;

public class Controller {
    @FXML
    private void closeMenuItemEven (ActionEvent event)
    {
        exit(0);
    }
}
