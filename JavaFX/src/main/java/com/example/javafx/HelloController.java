package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle;
    private double x,y;
    public void Up(ActionEvent e){
        System.out.println("UP");
        myCircle.setCenterX(y+=10);
    }
    public void Down(ActionEvent e){
        System.out.println("down");
        myCircle.setCenterY(y-=10);
    }
    public void left(ActionEvent e){
        System.out.println("left");
        myCircle.setCenterX(x-=10);
    }
    public void right(ActionEvent e){
        System.out.println("right");
        myCircle.setCenterX(x+=10) ;
    }
}