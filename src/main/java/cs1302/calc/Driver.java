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
import javafx.geometry.Insets;

/**
  Driver.java extends Application, builds the GUI for the calculator, and is the entry point into the program
  @author Will Pfleger, Johnny Do
**/

public class Driver extends Application{

    /**
       Declaration of instance variables
    **/
    private Label argument, answer;
    private boolean useRecursion=false;
    Button toggleMath, hideBin;
    VBox screen;
    Button[] buttons1 = new Button[64];
    FlowPane flow;
    
    public static void main(String[] args) {
        launch(args);
    } // main                                                                                                                                                                        
    /**
       Builds the GUI for the application 
       @param primaryStage the primary stage for the GUI 
       @return void
     **/
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
	primaryStage.setWidth(350);
	primaryStage.setHeight(250);
        primaryStage.setScene(scene);
        primaryStage.show();

    } // start 

    /**
       Creates the GUI "screen" for the calculator. Will display the arguments and results from calculator operations 
       @param none
       @return the VBox that will be the screen in the application 
     **/
    
    public VBox createScreen(){
        screen = new VBox();
        argument = new Label("");
	//argument.setFont(new Font("Arial",30));
        answer = new Label("");
	screen.setSpacing(10);
        screen.getChildren().addAll(argument, answer);
        return screen;
    }

    /**
       Creates the input portion of the calculator, consisting of the bit toggle buttons and the calculator operation button  
       @param none
       @return1the VBox that will be the input area in the application 
     **/

    public VBox createInputBox(){
        VBox background = new VBox();
        background.setSpacing(10);
	background.getChildren().addAll(createBits(), createButtons());
        return background;
    }

    /**
       Creates the set of bit toggle buttons 
       @param none
       @return the pane containing the buttons 
     **/

    public FlowPane createBits(){
        flow = new FlowPane();
        for(int i=0; i<64; i++){
	    int val=63-i;
            buttons1[i] = new Button("0");
	    buttons1[i].setStyle("-fx-background-color: transparent;");
	    buttons1[i].setPadding(new Insets(0));
	    int current = i;
            buttons1[i].setOnAction(e -> answer.setText(updateScreen(val, buttons1[current].getText())));
	}

	Button space = new Button();
	space.setStyle("-fx-background-color: transparent;");
	for(int f=0; f<32; f++){
            flow.getChildren().add(buttons1[f]);
	    // if(f % 4 == 0){
	    // flow.getChildren().add(space);
	    // }
	}
        for(int s=32; s<64; s++){
            flow.getChildren().add(buttons1[s]);
        }
	return flow;
    }

    /**
       Updates the value on the screen after bit toggle buttons are pressed 
       @param i the position of the bit being toggled, state the current state (pressed or not) of the button
       @return the updated value to be displayed on the calculator screen 
     **/

    public String updateScreen(int i, String state){
        int newVal=Integer.parseInt(answer.getText());
	if(state.equals("0")){
            newVal += (int)java.lang.Math.pow(2,i);
            buttons1[63-i].setText("1");
        }
        else{
            newVal -= (int)java.lang.Math.pow(2,i);
            buttons1[63-i].setText("0");
        }
        return "" + newVal;
    }

    /**
       Creates the buttons for the numbers, calculator operations, and toggles for binary visiblity and math algorithm  
       @param none
       @return the VBox containing the buttons 
     **/

    public VBox createButtons(){

        VBox buttons = new VBox();
        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        HBox row4 = new HBox();

        // Row 1                                                                                                                                                                     
        Button n7 = new Button("7");
	n7.setPadding(new Insets(10,20,10,20));
	n7.setOnAction(e -> argument.setText(argument.getText() + " 7"));
        Button n8 = new Button("8");
	n8.setPadding(new Insets(10,20,10,20));
        n8.setOnAction(e -> argument.setText(argument.getText() + " 8"));
        Button n9 = new Button("9");
	n9.setPadding(new Insets(10,20,10,20));
        n9.setOnAction(e -> argument.setText(argument.getText() + " 9"));
        Button slash = new Button("/");
	slash.setPadding(new Insets(10,20,10,20));
        slash.setOnAction(e -> argument.setText(argument.getText() + " /"));
        Button exclamation = new Button("!");
	exclamation.setPadding(new Insets(10,20,10,19));
        exclamation.setOnAction(e -> argument.setText(argument.getText() + " !"));
        Button backspace  = new Button("<");
	backspace.setPadding(new Insets(10,17,10,16));
	backspace.setOnAction(new EventHandler<ActionEvent>(){
		@Override
		public void handle(ActionEvent event){
		    if(argument.getText().length() > 1){
			argument.setText(argument.getText().substring(0,argument.getText().length()-2));
		    }
		    else if (argument.getText().length() == 1){
			argument.setText(argument.getText().substring(0,argument.getText().length()-1));
		    }
		}
	    });

        Button clear  = new Button("X");
	clear.setPadding(new Insets(10,18,10,17));
        clear.setOnAction(e -> argument.setText(""));
        // Row 2                                                                                                                                                                     
        Button n4 = new Button("4");
	n4.setPadding(new Insets(10,20,10,20));
        n4.setOnAction(e -> argument.setText(argument.getText() + " 4"));
        Button n5 = new Button("5");
	n5.setPadding(new Insets(10,20,10,20));
        n5.setOnAction(e -> argument.setText(argument.getText() + " 5"));
        Button n6 = new Button("6");
	n6.setPadding(new Insets(10,20,10,20));
        n6.setOnAction(e -> argument.setText(argument.getText() + " 6"));
        Button multiply = new Button("*");
	multiply.setPadding(new Insets(10,18,10,20));
        multiply.setOnAction(e -> argument.setText(argument.getText() + " *"));
        Button power = new Button("^");
	power.setPadding(new Insets(10,17,10,17));
        power.setOnAction(e -> argument.setText(argument.getText() + " ^"));
        Button lshift = new Button("<<");
	lshift.setPadding(new Insets(10,11,10,11));
	lshift.setOnAction(e -> argument.setText(argument.getText() + " <<"));
        Button rshift = new Button(">>");
	rshift.setPadding(new Insets(10,11,10,11));
        rshift.setOnAction(e -> argument.setText(argument.getText() + " >>"));
        // Row 3                                                                                                                                                                     
        Button n1 = new Button("1");
	n1.setPadding(new Insets(10,20,10,20));
        n1.setOnAction(e -> argument.setText(argument.getText() + " 1"));
        Button n2 = new Button("2");
	n2.setPadding(new Insets(10,20,10,20));
        n2.setOnAction(e -> argument.setText(argument.getText() + " 2"));
        Button n3 = new Button("3");
	n3.setPadding(new Insets(10,20,10,20));
        n3.setOnAction(e -> argument.setText(argument.getText() + " 3"));
        Button subtract = new Button("-");
	subtract.setPadding(new Insets(10,20,10,20));
        subtract.setOnAction(e -> argument.setText(argument.getText() + " -"));
        toggleMath = new Button("Use Recursion");
	toggleMath.setPadding(new Insets(10,20,10,20));
        toggleMath.setOnAction(e -> toggleMathAlgorithm());

        // Row 4                                                                                                                                                                     
        Button n0 = new Button("0");
	n0.setPadding(new Insets(10,20,10,20));
        n0.setOnAction(e -> argument.setText(argument.getText() + " 0"));
        Button equals = new Button("=");
        equals.setPadding(new Insets(10,43,10,43));
	equals.setOnAction(e -> answer.setText(evaluate(argument.getText())));
        Button add = new Button("+");
	add.setPadding(new Insets(10,17,10,18));
        add.setOnAction(e -> argument.setText(argument.getText() + " +"));
        hideBin = new Button("Hide Binary");
	hideBin.setPadding(new Insets(10,29,10,28));
	hideBin.setOnAction(e -> changeVisibility());


        row1.getChildren().addAll(n7, n8, n9, slash, exclamation, backspace, clear);
        row2.getChildren().addAll(n4, n5, n6, multiply, power, lshift, rshift);
        row3.getChildren().addAll(n1, n2, n3, subtract, toggleMath);
        row4.getChildren().addAll(n0, equals, add, hideBin);
        buttons.getChildren().addAll(row1, row2, row3, row4);

        return buttons;
    }

    /**
       Changes the visiblity of the bit toggle buttons 
       @param none
       @return void 
     **/

    public void changeVisibility(){
	if(flow.isVisible()){
	    flow.setVisible(false);
	    hideBin.setText("Show Binary");
	}
	else{
	    flow.setVisible(true);
	    hideBin.setText("Hide Binary");
	}
    }

    /**
       Toggles the current math algorithm the calculator is using  
       @param none
       @return void 
     **/

    public void toggleMathAlgorithm(){
	if(useRecursion){
            toggleMath.setText("Use Iteration");
            useRecursion=false;
        }
        else{
            toggleMath.setText("Use Recursion");
            useRecursion=true;
        }

    }

    /**
       Evaluates the argument on the calculator screen
       @param s the current argument
       @return the result of the evaluation 
     **/

    public String evaluate(String s){
        String expression = s;
        expression=expression.trim();
        expression=expression.replaceAll(">>", ">");
        expression=expression.replaceAll("<<", "<");
        String infix[] = expression.split(" ");
        for(int i=0; i<infix.length; i++){
	    System.out.print(infix[i] + " ");
        }
        String postfix[] = ReversePolishNotation.infixToPostfix(infix);
	Math math;
        if(useRecursion){
            math = new RecursiveMath();
            int result = ReversePolishNotation.evaluate(math, postfix);
            return Integer.toString(result);
        }
	else{
            math = new IterativeMath();
            int result = ReversePolishNotation.evaluate(math, postfix);
            return Integer.toString(result);
        }
    }


} // Driver