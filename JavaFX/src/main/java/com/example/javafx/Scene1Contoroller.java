package com.example.javafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;


public class Scene1Contoroller implements Initializable {

        @FXML
        private Label myLabel;

        @FXML
        private ChoiceBox<String> myChoiceBox;

        private String[] food = {"pizza","sushi","ramen"};

        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {

            myChoiceBox.getItems().addAll(food);
            myChoiceBox.setOnAction(this::getFood);

        }

        public void getFood(ActionEvent event) {

            String myFood = myChoiceBox.getValue();
            myLabel.setText(myFood);
        }

    }
