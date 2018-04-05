package sample;

import javafx.fxml.FXML;

import java.awt.event.MouseEvent;

import static java.lang.System.exit;

public class Controller {
    @FXML
    public void close(MouseEvent e)
    {
        exit(0);
    }
}
