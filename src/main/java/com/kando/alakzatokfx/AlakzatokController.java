package com.kando.alakzatokfx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.Objects;

public class AlakzatokController {

    @FXML
    public Button buttonAdd, buttonDelete, buttonSave;
    @FXML
    public RadioButton radioRed, radioGreen, radioBlue, radioSquare, radioCircle, radioTriangle;
    @FXML
    public ListView<String> savedList;
    @FXML
    public AnchorPane changeColor;
    @FXML
    public ImageView geometryImg;

    public void onRadioSetRed(){
        changeColor.setStyle("-fx-background-color: red; -fx-border-color: black");
    }
    public void onRadioSetGreen(){
        changeColor.setStyle("-fx-background-color: green; -fx-border-color: black");
    }
    public void onRadioSetBlue(){
        changeColor.setStyle("-fx-background-color: blue; -fx-border-color: black");
    }

    //@FXML
    //public void onRadioSetSquare(){
    //    geometryImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/kando/alakzatokfx/icons/negyzet.png"))));
    //}

    //@FXML
    //public void onRadioSetCircle(){
    //    geometryImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/kando/alakzatokfx/icons/kor.png"))));
    //}

    //@FXML
    //public void onRadioSetTriangle(){
    //    geometryImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/kando/alakzatokfx/icons/haromszog.png"))));
    //}

    public void onButtonAdd(){

    }
    public void onButtonDelete(){

    }
    public void onButtonSave(){

    }

}