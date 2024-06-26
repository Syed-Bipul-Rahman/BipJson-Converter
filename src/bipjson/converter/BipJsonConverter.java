/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bipjson.converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import java.nio.file.Path;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Syed Bipul Rahman
 */
public class BipJsonConverter extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Input fields
        TextArea textArea = new TextArea();

        // Menu
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
// Submenu of file menu
        MenuItem openItem = new MenuItem("Open");
        MenuItem closeItem = new MenuItem("Close");

        //open file explorer
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Json/txt File");

        openItem.setOnAction(event -> {

            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                // Handle the selected file 
                // get file extention

                // Get the path object
                Path filePath = selectedFile.toPath();
                // Extract the file extension
                String extension = null;
                String fileName = filePath.getFileName().toString();
                int dotIndex = fileName.lastIndexOf('.');
                if (dotIndex >= 0) {
                    extension = fileName.substring(dotIndex + 1);
                    System.out.println("Selected file extension: " + extension);
                } else {
                    System.out.println("File has no extension");
                }
                if (extension.equalsIgnoreCase("txt") || extension.equalsIgnoreCase("json")) {
                    System.out.println("correct file");

                } else {
                    Alert alert = new Alert(AlertType.WARNING);
                    alert.setTitle("Invalid File Extension");
                    alert.setHeaderText("Please select a valid file");
                    alert.setContentText("Currently we do not support " + extension + " File!\nOnly JSON (.json) and TXT (.txt) files are allowed.");
                    alert.showAndWait();

                }

                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    StringBuilder fileContent = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        fileContent.append(line).append("\n");
                    }
                    // Process the file content
                    textArea.setText("" + fileContent.toString());
                } catch (IOException e) {
                    // Handle file reading errors
                    e.printStackTrace();
                }

            }
        });

        fileMenu.getItems().addAll(openItem, closeItem);

        menuBar.getMenus().add(fileMenu);

        closeItem.setOnAction(event -> {
            primaryStage.close();
        });
        // Layout with MenuBar at top
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        StackPane centerPane = new StackPane();
        centerPane.getChildren().addAll(textArea);

        root.setCenter(centerPane);

        Scene scene = new Scene(root, 600, 600);

        primaryStage.setTitle("BipJson Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //JSON to java class conversion logic
    private String convertJson(String json) {
        //conversion will go here
        return "Converted JSON to java code";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
