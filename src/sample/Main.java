package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        /*Group root = new Group();
        Text txt= new Text("Ghassen!");
        txt.setFont(new Font("Papurus",40));
        TextField nameFld = new TextField();
        Button btn = new Button();

        btn.setText("Say Ghassen");
        btn.setOnAction(evt -> System.out.printf("Ghassen button was clicked and the input name is %s!%n",
                nameFld.getText()));
        Label label=new Label("Name:");
        GridPane grid =new GridPane();
        grid.setHgap(20);
        grid.add(label,0,0);
        grid.add(nameFld,1,0);
        grid.add(btn,1,1);
        //grid.setGridLinesVisible(true);
        txt.setY(50);
        VBox box = new VBox();
        box.getChildren().addAll(txt,grid);
        root.getChildren().add(box);*/
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
