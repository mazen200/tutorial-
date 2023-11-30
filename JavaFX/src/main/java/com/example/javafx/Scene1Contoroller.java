package com.example.javafx;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;


public class Scene1Contoroller implements Initializable {
    @FXML
    private Label myLabel;

    @FXML
    private Slider mySlider;

    int myTemperature;

    @Override
    public void initialize(URL url, ResourceBundle resources) {

        myTemperature = (int) mySlider.getValue();
        myLabel.setText(Integer.toString(myTemperature) + "°C");

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldNumber, Number newNumber) {

                myTemperature = (int) mySlider.getValue();
                myLabel.setText(Integer.toString(myTemperature) + "°C");

            }
        });
    }
}