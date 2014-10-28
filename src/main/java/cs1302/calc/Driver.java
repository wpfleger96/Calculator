package cs1302.calc;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;
 
public class Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    } // main
    
    @Override
    public void start(Stage primaryStage) {
	
	try {
	    Parent root = FXMLLoader.load(getClass().getResource("/calc.fxml"));
	    primaryStage.setTitle("CalcFX!");
	    primaryStage.setScene(new Scene(root, 640, 480));
	    primaryStage.show();
	} catch (Exception e) {
	    System.out.println("There was a problem while running your program.");
	    System.out.println("Please give the following information to the developer: ");
	    System.out.println();
	    System.out.println(e);
	    System.out.println();
	    e.printStackTrace();
	    System.exit(1);
	} // try

    } // start

} // Driver
