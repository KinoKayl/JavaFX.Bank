package org.example.bank_java;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;
import java.util.Random;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextArea idArea;

    @FXML
    private TextArea BalanceArea;

    @FXML
    private TextField CountField;

    @FXML
    private TextField PercentField;

    @FXML
    private Label LogLabel;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}

    @FXML
    protected void addButton_click()
    {
        String id = idArea.g
        welcomeText.setText("Welcome to JavaFX Application!");

    }