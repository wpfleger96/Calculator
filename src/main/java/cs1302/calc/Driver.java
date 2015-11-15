package cs1302.calc;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.beans.property.*;
import javafx.beans.binding.Bindings;
import java.io.IOException;
import javafx.scene.layout.*; 

public class Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    } // main
    
    @Override
    public void start(Stage primaryStage) {

	Parent root = null;

	try {
	    root = FXMLLoader.load(getClass().getResource("/calc.fxml"));
	} catch (IOException e) {
	    System.out.println(e);
	    System.exit(1);
	} // try

        primaryStage.setTitle("CalcFX!");
       	BorderPane border = new BorderPane();
	Scene scene = new Scene(border, 500,500);
	border.setTop(createScreen());
	border.setCenter(createInputBox());
	primaryStage.setScene(scene);
        primaryStage.show();

    } // start

    public VBox createScreen(){
	VBox screen = new VBox();
	Label argument = new Label("3+6*7");
	Label answer = new Label("45");
	screen.setSpacing(10);
	screen.getChildren().addAll(argument, answer);
	return screen;
    }
    
    public VBox createInputBox(){
	VBox background = new VBox();
	Label line1 = new Label("0000 0000 0000 0000 0000 0000 0000");
	Label line2 = new Label("0000 0000 0000 0000 0000 0000 0000");
	VBox buttons = new VBox();
	background.setSpacing(10);
	background.getChildren().addAll(line1, line2, buttons);
	return background;

    }

} // Driver


