
import MedicalTests.*;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
    public class MedicalSchedule {
        public static void main(String[] args) {
            Patient patient1 = new Patient("John Molecules");
            patient1.addtest(new BloodTest());

            Patient patient2 = new Patient("Jill Biomedenhall");


            JFrame frame = new JFrame("Appointments");
            frame.setSize(450, 400);

            JPanel displayPanel = new JPanel();
            // Create a label for each patient's text
            JLabel displayLabel1 = new JLabel(patient1.getTestDisplay());


            displayPanel.add(displayLabel1);


            frame.setContentPane(displayPanel);
            frame.setVisible(true);
            frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
                public void windowClosing(WindowEvent e) {
                    frame.dispose();
                }
            });
        }
    }

