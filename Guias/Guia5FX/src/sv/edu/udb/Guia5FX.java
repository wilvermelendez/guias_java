/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author wilver
 */
public class Guia5FX extends Application {
    
    @Override
    public void  start(Stage primaryStage)
    {
        primaryStage.setTitle("Bienvenido a Java FX");
        GridPane grid= new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Text scenetitle= new Text("Bienvenido");
        scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
        grid.add(scenetitle,0,0,2,1);
        
        Label userName= new Label("Nombre: ");
        grid.add(userName,0,1);
        final TextField nameTextField=new TextField();
        grid.add(nameTextField,1,1);
        
        Label age= new Label("Edad: ");
        grid.add(age, 0, 2);
        
        final TextField ageTextField=new TextField();
        grid.add(ageTextField,1,2);
        
        Button btn=new Button("Enviar");
        HBox hbBtn=new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);
        
        final Text actiontarget= new Text();
        grid.add(actiontarget,0,6);
        
        btn.setOnAction(new EventHandler<ActionEvent>(){
        
        @Override
        public void handle(ActionEvent e)
        {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText(nameTextField.getText()+ 
                    "\na los  "+ageTextField.getText()+
                    "\nha comenzado \na usar JavaFx");
        }
        });
        
        Scene scene= new Scene(grid,300,275);
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
