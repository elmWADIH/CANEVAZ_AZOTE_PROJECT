package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Controller for the main view
 * Handles user interactions and updates the view
 */
public class MainController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private void initialize() {
        // This method is called automatically after FXML is loaded
        welcomeLabel.setText("Welcome to CANEVAZ AZOTE Project!");
    }

    @FXML
    private void handleButtonClick() {
        welcomeLabel.setText("Button clicked!");
    }
}
