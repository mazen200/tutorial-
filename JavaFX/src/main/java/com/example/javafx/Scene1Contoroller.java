package com.example.javafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;



public class Scene1Contoroller {
    @FXML
    private Pane myPane;
    @FXML
    private ColorPicker myColorPicker;

    public void changeColor(ActionEvent event) {
        Color myColor = myColorPicker.getValue();
        myPane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
    }
}