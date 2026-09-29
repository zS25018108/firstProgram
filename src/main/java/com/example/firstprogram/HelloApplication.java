package com.example.firstprogram;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage ventana) throws IOException {
       Label lblBienvenido = new Label("Bienvenido");
       lblBienvenido.setStyle("-fx-font-size: 30px; -fx-font-weight: bold");
       Button btnEntrar = new Button ("Entrar");
       Button btnBack = new Button("Regrese");
       VBox organizador = new VBox(20);
        HBox botoncitos = new HBox(20);

       btnEntrar.setOnAction( e ->{
           lblBienvenido.setText("Click detectado");
           lblBienvenido.setStyle("-fx-text-fill: green; -fx-font-size: 50px");
       });

       btnBack.setOnAction(e->{
           lblBienvenido.setStyle("-fx-font-size: 30px; -fx-font-weight: bold");
           lblBienvenido.setText("Bienvenido");
       });

       organizador.setAlignment(Pos.CENTER);
       botoncitos.setAlignment(Pos.CENTER);
       botoncitos.getChildren().addAll(btnEntrar, btnBack);
       organizador.getChildren().addAll(lblBienvenido, botoncitos);
       Scene miEscena = new Scene(organizador, 400, 300);
       ventana.setTitle("Hello!");
       ventana.setScene(miEscena);
       ventana.show();
    }
}
