package com.example.javafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Scene1Contoroller {
    @FXML
    TextField nameTextField;

    private Scene scene;
private Stage stage;
private Parent root;

public void switchToTheScene2(ActionEvent event) throws IOException {
    String username = nameTextField.getText();

    FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
    root = loader.load();

    Scene2Controller scene2Controller = loader.getController();
    scene2Controller.displayName(username);

    //  Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
    public void switchToTheScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}