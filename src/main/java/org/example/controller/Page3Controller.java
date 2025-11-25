package org.example.controller;

import org.example.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Page3Controller {

    @FXML private TableView<String> historyTable;
    @FXML private TextField searchField;
    @FXML private ComboBox<String> varietyFilter;

    @FXML
    public void initialize() {
        // Initialize variety filter
        varietyFilter.getItems().addAll(
            "Toutes les variétés",
            "Clémentine",
            "Nour",
            "Ortanique",
            "Pomelo",
            "Navel",
            "Nova",
            "Salustiana",
            "Valencia",
            "Citron"
        );
        varietyFilter.setValue("Toutes les variétés");
    }

    @FXML
    private void handleNewCalculation() {
        MainApp.getInstance().showPage1();
    }

    @FXML
    private void handleExportPDF() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Export");
        alert.setHeaderText(null);
        alert.setContentText("Veuillez sélectionner un calcul à exporter.");
        alert.showAndWait();
    }

    @FXML
    private void handleDelete() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Supprimer ce calcul ?");
        alert.setContentText("Cette action est irréversible.");
        alert.showAndWait();
    }

    @FXML
    private void handleClearAll() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Supprimer tout l'historique ?");
        alert.setContentText("Cette action est irréversible.");
        alert.showAndWait();
    }
}
