package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private ObservableList<Task> toDo = FXCollections.observableArrayList();
    private ObservableList<Task> inProgress = FXCollections.observableArrayList();
    private ObservableList<Task> done = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
        primaryStage.setTitle("Kanban manager");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("sample.fxml"));
        AnchorPane rootLayout = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Kanban");
        stage.setScene(new Scene(rootLayout, 600, 600));
        stage.show();
        Controller newMainWindow = loader.getController();
        newMainWindow.setMainApp(this);
    }

    public ObservableList<Task> getTodo() {
        return toDo;
    }

    public ObservableList<Task> getInProgress() {
        return inProgress;
    }

    public ObservableList<Task> getDone() {
        return done;
    }

    public void setToDo(Task taskToAdd)
    {
        toDo.add(taskToAdd);
    }


}