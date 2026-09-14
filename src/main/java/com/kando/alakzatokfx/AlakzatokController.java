package com.kando.alakzatokfx;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AlakzatokController {
    //@FXML
    //private Label welcomeText;

    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
    @FXML
    public Button buttonAdd, buttonDelete, buttonSave;
    @FXML
    public RadioButton radioRed, radioGreen, radioBlue, radioSquare, radioCircle, radioTriangle;
    @FXML
    public ListView<String> savedList;

}