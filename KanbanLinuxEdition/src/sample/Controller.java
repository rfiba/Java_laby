package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.System.exit;

public class Controller implements Initializable{
    @FXML private ListView<Task> toDo;
    @FXML private ListView<Task> inProgress;
    @FXML private ListView<Task> done;
    private Main main;
    @FXML
    private void closeMenuItemEvent (ActionEvent event)
    {
        exit(0);
    }

    @FXML
    private void buttonEvent(ActionEvent event)
    { Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("TaskWindow.fxml"));
            Stage stage = new Stage();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root, 600, 600));
            stage.show();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void setMainApp(Main main){
        this.main = main;
        toDo.setItems(main.getTodo());
        inProgress.setItems(main.getInProgress());
        done.setItems(main.getDone());
    }

}