package org.example.controller;

import org.example.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Page1Controller {

    @FXML private TextField farmNameField;
    @FXML private TextField parcelNameField;
    @FXML private TextArea contactInfoArea;
    @FXML private ComboBox<String> varietyComboBox;
    @FXML private TextField expectedYieldField;
    @FXML private RadioButton lightPruningRadio;
    @FXML private RadioButton mediumPruningRadio;
    @FXML private RadioButton heavyPruningRadio;
    @FXML private RadioButton allRemovedLeavesRadio;
    @FXML private RadioButton buriedLeavesRadio;
    @FXML private RadioButton notBuriedLeavesRadio;
    @FXML private RadioButton chemicalPlowingWeedsRadio;
    @FXML private RadioButton occasionalWeedsRadio;

    private ToggleGroup pruningGroup;
    private ToggleGroup leavesGroup;
    private ToggleGroup weedsGroup;

    @FXML
    public void initialize() {
        // Initialize variety dropdown
        varietyComboBox.getItems().addAll(
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
        
        // Set up ToggleGroups for radio buttons
       /* pruningGroup = new ToggleGroup();
        lightPruningRadio.setToggleGroup(pruningGroup);
        mediumPruningRadio.setToggleGroup(pruningGroup);
        heavyPruningRadio.setToggleGroup(pruningGroup);
        
        leavesGroup = new ToggleGroup();
        allRemovedLeavesRadio.setToggleGroup(leavesGroup);
        buriedLeavesRadio.setToggleGroup(leavesGroup);
        notBuriedLeavesRadio.setToggleGroup(leavesGroup);
        
        weedsGroup = new ToggleGroup();
        chemicalPlowingWeedsRadio.setToggleGroup(weedsGroup);
        occasionalWeedsRadio.setToggleGroup(weedsGroup);
        */
        // Set default selection
        varietyComboBox.setValue("Clémentine");
        lightPruningRadio.setSelected(true);
        allRemovedLeavesRadio.setSelected(true);
        chemicalPlowingWeedsRadio.setSelected(true);
    }

    @FXML
    private void handleNext() {
        System.err.println("\n!!! BUTTON CLICKED !!!");
        System.err.println("Calling showPage2()...");
        MainApp.getInstance().showPage2();
        System.err.println("showPage2() called!");
    }

    @FXML
    private void handleSaveConfig() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Configuration");
        alert.setHeaderText(null);
        alert.setContentText("Configuration sauvegardée!");
        alert.showAndWait();
    }
}
