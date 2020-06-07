package guibutton;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author sebek
 */
public class MessageListener implements ActionListener {
    // Responds to a button click by displaying a message box.
    public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "You clicked the button!");
    }
}
