package sample;


import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDate;
import java.lang.String;
import java.util.ResourceBundle;

import static java.lang.System.exit;

public class TaskWindow implements Initializable {
    private Main main;
    private Task task;
    @FXML private ComboBox<Priority> priority;
    @FXML private TextField title;
    @FXML private DatePicker expirationDate;
    @FXML private TextField description;

    @FXML
    private void handleButtonAction(ActionEvent actionEvent) {
        //task = new Task(title.getText(), expirationDate.getValue(),priority.getValue(), description.getText());
        //((Stage)priority.getScene().getWindow()).close();
        main.setToDo(new Task(title.getText(), expirationDate.getValue(),priority.getValue(), description.getText()));
        ((Stage)priority.getScene().getWindow()).close();
    }

    @FXML
    private void closeMenuItemEvent (ActionEvent event)
    {
        exit(0);
    }

    public void setMainApp(Main main){
        this.main = main;
        if(main == null){
            System.out.println("NULL");
        }
    }

    public void setTaskToEdit(Task taskToEdit)
    {
        this.task = taskToEdit;
        title.setText(taskToEdit.getTitle());
        priority.setValue(taskToEdit.getPriority());
        expirationDate.setValue(task.getExpirationDate());
        description.setText(taskToEdit.getDescription());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        priority.setItems(FXCollections.observableArrayList(Priority.values()));
    }
}