package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
public class HelloController {
    public void Up(ActionEvent e){
        System.out.println("UP");
    }
    public void Down(ActionEvent e){
        System.out.println("down");
    }
    public void left(ActionEvent e){
        System.out.println("left");
    }
    public void right(ActionEvent e){
        System.out.println("right");
    }
}