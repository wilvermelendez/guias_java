/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.sv;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
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
public class Ejercicio2_ParametrosApplet extends Application {
    
    @Override
    public void  start(Stage primaryStage)
    {
        primaryStage.setTitle("Ejercicio 2 en JAVA FX");
        GridPane grid= new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Text scenetitle= new Text("Ejercicio 2 en JAVA FX");
        scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
        grid.add(scenetitle,0,0,2,1);
        
        Label userName= new Label("Nombre: ");
        grid.add(userName,0,1);
        final TextField nameTextField=new TextField();
        nameTextField.setPrefWidth(150);
        grid.add(nameTextField,1,1);
        
        Label age= new Label("Edad: ");
        grid.add(age, 0, 2);
        
        final TextField ageTextField=new TextField();
        ageTextField.setPrefWidth(150);
        grid.add(ageTextField,1,2);
        
        Button btn=new Button("Procesar");
        HBox hbBtn=new HBox(10);
        hbBtn.setAlignment(Pos.TOP_RIGHT);
        //hbBtn.setStyle("-fx-background-color: #FFFFFF;");
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);
        
        
        final Text actiontarget= new Text();
        grid.add(actiontarget,0,6,2,1);
        
        btn.setOnAction(new EventHandler<ActionEvent>(){
        
        @Override
        public void handle(ActionEvent e)
        {
            try {
                String nombre, edad;
                nombre=nameTextField.getText();
                edad=ageTextField.getText();
                if(nombre==null)
                    nombre=" ";
                if(edad==null)
                    edad=" ";
            actiontarget.setFill(Color.RED);
            actiontarget.setText(nombre+ " es un estudiante especializado en ingeniería \n"+
            nombre+ " tiene "+edad+ " años ");
            
            } catch (Exception ex) {
                actiontarget.setText("error" +ex.getMessage());
            }
                    
            
        }
        });
        
        Scene scene= new Scene(grid,500,275);
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
