package com.github.yqy7.iconhelper;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class IconHelperController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}