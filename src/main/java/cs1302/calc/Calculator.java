package cs1302.calc;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/** 
 * This class represente the GUI for the calculator app
 */
public class Calculator extends JPanel implements ActionListener {

    // a button used for the initial example
    private JButton button;

    /**
     * Constructs a Calculator object
     */
    public Calculator() {
	
	// initialize the button used for the example
	this.button = new JButton("Click Me!");

	// add an example action listener to the button
	this.button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {	       
		this.button.setText("Thanks for Clicking!");
	    } // actionPerformed
	)); //

    } // Calculator

    /**
     * Creates and shows the GUI
     */
    public static void createAndShowGUI() {

	// create and setup the window
	JFrame frame = new JFrame("Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// create an instance of the Calculator class and add it to the window
	Calculator calc = new Calculator();
	frame.add(calc);

	// show the window.
        frame.pack();
        frame.setVisible(true);

    } // createAndShowGUI

} // Calculator

