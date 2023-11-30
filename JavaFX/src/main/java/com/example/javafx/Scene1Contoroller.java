package com.example.javafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;

public class Scene1Contoroller {
    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myImageView;

    Image myImage1 = new Image("Biochemical_Icon.png");
    Image myImage2 = new Image("Damage_Potion.png");

    public void change(ActionEvent event) {

        if(myCheckBox.isSelected()) {
            myLabel.setText("ON");
            myImageView.setImage(myImage1);
        }
        else {
            myLabel.setText("OFF");
            myImageView.setImage(myImage2);
        }
    }
}