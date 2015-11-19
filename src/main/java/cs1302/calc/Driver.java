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

public class Driver extends Application{

    private Label argument, answer;
    private boolean useRecursion=false;
    Button toggleMath;
    VBox screen;
    Button[] buttons1 = new Button[39];
    Button[] buttons2 = new Button[39];
    
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
        screen = new VBox();
        argument = new Label("3+6*7");
        answer = new Label("45");
        screen.setSpacing(10);
        screen.getChildren().addAll(argument, answer);
        return screen;
    }

    public VBox createInputBox(){
        VBox background = new VBox();
        background.setSpacing(10);
        background.getChildren().addAll(createBits(), createButtons());
        return background;
    }

    public HBox createBits(){
        HBox bits = new HBox();
        for(int i=0; i<39; i++){
            buttons1[i] = new Button();
            buttons1[i].setText("0");
            int current=i;
            buttons1[i].setOnAction(e -> answer.setText(updateScreen(current, buttons1[current].getText())));
        }

	for(int f=0; f<19; f++){
            bits.getChildren().addAll(buttons1[f]);
        }
        for(int s=19; s<39; s++){
            bits.getChildren().addAll(buttons1[s]);
        }
        return bits;
    }

    public String updateScreen(int i, String state){
        int newVal=Integer.parseInt(answer.getText());
        if(state.equals("0")){
            newVal += (int)java.lang.Math.pow(2,i);
            buttons1[i].setText("1");
        }
        else{
            newVal -= (int)java.lang.Math.pow(2,i);
            buttons1[i].setText("0");
        }
        return "" + newVal;
    }

    public VBox createButtons(){

        VBox buttons = new VBox();
        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        HBox row4 = new HBox();

        // Row 1                                                                                                                                                                     
        Button n7 = new Button("7");
        n7.setOnAction(e -> argument.setText(argument.getText() + " 7"));
        Button n8 = new Button("8");
        n8.setOnAction(e -> argument.setText(argument.getText() + " 8"));
        Button n9 = new Button("9");
        n9.setOnAction(e -> argument.setText(argument.getText() + " 9"));
        Button slash = new Button("/");
        slash.setOnAction(e -> argument.setText(argument.getText() + " /"));
        Button exclamation = new Button("!");
        exclamation.setOnAction(e -> argument.setText(argument.getText() + " !"));
        Button backspace  = new Button("<");
        backspace.setOnAction(e -> argument.setText(argument.getText().substring(0,argument.getText().length()-2)));
        Button clear  = new Button("X");
        clear.setOnAction(e -> argument.setText(""));
        // Row 2                                                                                                                                                                     
        Button n4 = new Button("4");
        n4.setOnAction(e -> argument.setText(argument.getText() + " 4"));
        Button n5 = new Button("5");
        n5.setOnAction(e -> argument.setText(argument.getText() + " 5"));
        Button n6 = new Button("6");
        n6.setOnAction(e -> argument.setText(argument.getText() + " 6"));
        Button multiply = new Button("*");
        multiply.setOnAction(e -> argument.setText(argument.getText() + " *"));
        Button power = new Button("^");
        power.setOnAction(e -> argument.setText(argument.getText() + " ^"));
        Button lshift = new Button("<<");
	lshift.setOnAction(e -> argument.setText(argument.getText() + " <<"));
        Button rshift = new Button(">>");
        rshift.setOnAction(e -> argument.setText(argument.getText() + " >>"));
        // Row 3                                                                                                                                                                     
        Button n1 = new Button("1");
        n1.setOnAction(e -> argument.setText(argument.getText() + " 1"));
        Button n2 = new Button("2");
        n2.setOnAction(e -> argument.setText(argument.getText() + " 2"));
        Button n3 = new Button("3");
        n3.setOnAction(e -> argument.setText(argument.getText() + " 3"));
        Button subtract = new Button("-");
        subtract.setOnAction(e -> argument.setText(argument.getText() + " -"));
        toggleMath = new Button("Use Recursion");
        toggleMath.setOnAction(e -> toggleMathAlgorithm());

        // Row 4                                                                                                                                                                     
        Button n0 = new Button("0");
        n0.setOnAction(e -> argument.setText(argument.getText() + " 0"));
        Button equals = new Button("=");
        equals.setOnAction(e -> answer.setText(evaluate(argument.getText())));
        Button add = new Button("+");
        add.setOnAction(e -> argument.setText(argument.getText() + " +"));
        Button hideBin = new Button("Hide Binary");


        row1.getChildren().addAll(n7, n8, n9, slash, exclamation, backspace, clear);
        row2.getChildren().addAll(n4, n5, n6, multiply, power, lshift, rshift);
        row3.getChildren().addAll(n1, n2, n3, subtract, toggleMath);
        row4.getChildren().addAll(n0, equals, add, hideBin);
        buttons.getChildren().addAll(row1, row2, row3, row4);

        return buttons;
    }

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

    public String evaluate(String s){
        String expression = s;
        expression=expression.trim();
        expression=expression.replaceAll(">>", ">");
        expression=expression.replaceAll("<<", "<");
        String infix[] = expression.split(" ");
        System.out.print("INFIX: ");
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