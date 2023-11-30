package com.example.javafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Scene1Contoroller {
    @FXML
    private Label myLabel;
    @FXML
    private RadioButton rButton1, rButton2, rButton3;

    public void getFood(ActionEvent event) {

        if(rButton1.isSelected()) {
            myLabel.setText(rButton1.getText());
        }
        else if(rButton2.isSelected()) {
            myLabel.setText(rButton2.getText());
        }
        else if(rButton3.isSelected()) {
            myLabel.setText(rButton3.getText());
        }

    }
}