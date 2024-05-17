/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bipjson.converter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Syed Bipul Rahman
 */
public class BipJsonConverter extends Application {

    @Override
    public void start(Stage primaryStage) {

        //input fields
        TextArea texts = new TextArea();

        //convert button
        Button btn = new Button();
        btn.setText("Convert");
        btn.setOnAction((ActionEvent event) -> {
            String inputText = texts.getText();
            
            System.out.println("" + inputText);
        });

        StackPane root = new StackPane();

        root.getChildren().add(texts);
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 600, 600);

        primaryStage.setTitle("BipJson Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
