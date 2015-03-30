package cs1302.calc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.invokeLater;
 
public class Driver {

    public static void createAndShowGUI() {

        // Create the frame
        JFrame frame = new JFrame("Artsy!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: Create the main panel and add it to the frame

        // show the window.
        frame.pack();
        frame.setVisible(true);
        
    } // createAndShowGUI

    public static void main(String[] args) {
        invokeLater(Driver::createAndShowGUI);
    } // main

} // Driver
