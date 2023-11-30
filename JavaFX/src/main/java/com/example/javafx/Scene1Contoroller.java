package com.example.javafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    ImageView myImageView;
    Button myButton;

 Image myImage = new Image(getClass().getResourceAsStream("Damage_Potion.jpg"));

    public void displayImage() {
       // myImageView.setImage(myImage);
    }

}