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

public class Driver extends Application implements ActionListener {

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
	VBox buttons = createButtons();
	background.setSpacing(10);
	background.getChildren().addAll(line1, line2, buttons);
	return background;

    }

    public VBox createButtons(){

	VBox buttons = new VBox();
	HBox row1 = new HBox();
	HBox row2 = new HBox();
	HBox row3 = new HBox();
	HBox row4 = new HBox();

	Button n7 = new Button("7");
	Button n8 = new Button("8");
	Button n9 = new Button("9");
	Button slash = new Button("/");
	Button exclamation = new Button("!");
	Button backspace  = new Button("<");
	Button clear  = new Button("X");
	Button n4 = new Button("4");
	Button n5 = new Button("5");
	Button n6 = new Button("6");
	Button multiply = new Button("*");
	Button power = new Button("^");
	Button lshift = new Button("<<");
	Button rshift = new Button(">>");
	Button n1 = new Button("1");
	Button n2 = new Button("2");
	Button n3 = new Button("3");
	Button subtract = new Button("-");
	Button useRecurs = new Button("Use Recursion");
	Button n0 = new Button("0");
	Button equals = new Button("=");
	Button add = new Button("+");
	Button hideBin = new Button("Hide Binary");

	row1.getChildren().addAll(n7, n8, n9, slash, exclamation, backspace, clear);
	row2.getChildren().addAll(n4, n5, n6, multiply, power, lshift, rshift);
	row3.getChildren().addAll(n1, n2, n3, subtract, useRecurs);
	row4.getChildren().addAll(n0, equals, add, hideBin);
	buttons.getChildren().addAll(row1, row2, row3, row4);

	return buttons;
    }


    public void actionPerformed(ActionEvent e){
	
    }

} // Driver


