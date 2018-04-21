package sample;


import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.lang.String;

public class TaskWindow{
    private Main main;
    private Task task;
    @FXML private ComboBox<Priority> priority;
    @FXML private TextField title;
    @FXML private LocalDate expirationDate;
    @FXML private String description;

    public void handleEditAction(ActionEvent actionEvent) {
        task.setTitle(title.getText());
        task.setPriority(priority.getValue());
        task.setExpirationDate(expirationDate);
        task.setDescription(description);
        ((Stage) title.getScene().getWindow()).close();
    }

    public void setMainApp(Main main){
        this.main = main;
        if(main == null){
            System.out.println("NULL");
        }
    }
    @FXML
    private void initialize(){
        priority.setItems(FXCollections.observableArrayList(Priority.values()));
    }

}