package org.example.controller;

import org.example.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Page2Controller {

    @FXML private TextField leafNitrogenField;
    @FXML private Label harvestValueLabel;
    @FXML private Label pruningValueLabel;
    @FXML private Label weedValueLabel;
    @FXML private Label basicTotalLabel;
    @FXML private Label correctionValueLabel;
    @FXML private Label finalTotalLabel;

    @FXML
    public void initialize() {
        // Set demo values
        harvestValueLabel.setText("33.0");
        pruningValueLabel.setText("20.0");
        weedValueLabel.setText("0");
        basicTotalLabel.setText("53.0");
        correctionValueLabel.setText("0");
        finalTotalLabel.setText("53.0");
    }

    @FXML
    private void handleBack() {
        MainApp.getInstance().showPage1();
    }

    @FXML
    private void handleViewHistory() {
        MainApp.getInstance().showPage3();
    }

    @FXML
    private void handleSaveToHistory() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Historique");
        alert.setHeaderText(null);
        alert.setContentText("Calcul enregistré dans l'historique!");
        alert.showAndWait();
    }

    @FXML
    private void handleExportPDF() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Export PDF");
        alert.setHeaderText(null);
        alert.setContentText("Fonctionnalité d'export PDF à venir...");
        alert.showAndWait();
    }
}
