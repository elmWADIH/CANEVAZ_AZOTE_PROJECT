package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    private static MainApp instance;
    private Stage primaryStage;

    public MainApp() {
        instance = this;
    }

    public static MainApp getInstance() {
        return instance;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Calculateur d'Azote pour Agrumes");

        showPage1();

        primaryStage.setWidth(1000);
        primaryStage.setHeight(700);
        primaryStage.show();
    }

    public void showPage1() {
        try {
            System.err.println("\n=== LOADING PAGE 1 ===");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/page1-config.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);

            System.err.println("=== PAGE 1 LOADED ===\n");
        } catch (Exception e) {
            System.err.println("\n!!! ERROR LOADING PAGE 1 !!!");
            e.printStackTrace();
        }
    }

    public void showPage2() {
        try {
            System.err.println("\n=== LOADING PAGE 2 ===");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/page2-calculation.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);

            System.err.println("=== PAGE 2 LOADED ===\n");
        } catch (Exception e) {
            System.err.println("\n!!! ERROR LOADING PAGE 2 !!!");
            e.printStackTrace();
        }
    }

    public void showPage3() {
        try {
            System.out.println("\n=== LOADING PAGE 3 ===");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/page3-history.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);

            System.out.println("=== PAGE 3 LOADED ===\n");
        } catch (Exception e) {
            System.err.println("\n!!! ERROR LOADING PAGE 3 !!!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
