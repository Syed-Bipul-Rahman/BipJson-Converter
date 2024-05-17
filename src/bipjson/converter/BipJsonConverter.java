/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bipjson.converter;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
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

        // Input fields
        TextArea textArea = new TextArea();

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
        return "Converted JSON";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
