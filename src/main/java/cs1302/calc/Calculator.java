package cs1302.calc;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/** 
 * This class represents the GUI for the Calculator app. It is implemented as a
 * subclass of JPanel and therefore inherits all of JPanel's methods.
 */
public class Calculator extends JPanel implements ActionListener {

    // a button used for the initial example
    private JButton button1, button2;

    /**
     * Constructs a Calculator object
     */
    public Calculator() {

	// set the layout manager for the Calculator application using one of
	// the methods inherited from the JPanel class.
	this.setLayout(new FlowLayout());

	// initialize the buttons used for the example
	this.button1 = new JButton("Click Me!");
	this.button2 = new JButton("Click Me Too!");

	// add a custom event action listener to button1
	this.button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {	       
		// we cannot say this.button here because we are actually inside
		// an anonymous instance of the ActionListener class at this 
		// scope level
		button1.setText("Thanks!");
	    } // actionPerformed
	}); //

	// add the general event action listener to button2
	this.button2.addActionListener(this);

	// add the buttons to the Calculator
	add(this.button1);
	add(this.button2);

    } // Calculator

    /**
     * This method is used for actions that are shared by multiple components. 
     * It is declared in the abstract class ActionListener.
     *
     * <p>
     * In order to make this method handle an event for a component, you need
     * only pass the current instance of the Calculator class as the parameter
     * to component's <code>addActionListener</code> method. Here is an example
     * of how to make a JButton that is created inside an instance of the
     * <code>Calculator</code> class use this <code>actionPerformed</code> 
     * method when clicked:
     *
     * <code>button.addActionListener(this);</code>
     *
     * <p>
     * This works because the <code>Calculator</code> class implements the
     * <code>ActionListener</code> interface.
     *
     * @param e an action event that the application needs to react to.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

	// check to see if the event is from button 2
	if (e.getSource() == this.button2) {
	    this.button2.setText("Thanks!");
	} // if

    } // actionPerformed

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

