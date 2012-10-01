package cs1302.calc;

import javax.swing.JFrame;

/** 
 * This class represente the GUI for the calculator app
 */
public class Calculator {

    public static void createAndShowGUI() {

	// create and setup the window
	JFrame frame = new JFrame("Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// TODO: create the components for the calculator

	// TODO: setup the content pane (i.e., where the main GUI lives) by
	//       adding components to it

	frame.add(new javax.swing.JButton("Hello World"));

	// TODO: setup and add the menu bar

	// show the window.
        frame.pack();
        frame.setVisible(true);

    } // createAndShowGUI

} // Calculator