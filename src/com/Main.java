package com;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root=new Group();
        primaryStage.setTitle("Hello World !!!");
        primaryStage.setScene ( new Scene(root,500,400));
        primaryStage.show();
    }
}












































