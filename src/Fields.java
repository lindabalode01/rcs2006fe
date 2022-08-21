import javax.swing.*;

public class Fields {
    JFrame frame = new JFrame();

   //this panel is the first window that opens for loging in
    JPanel panel1 = new JPanel();

    ImageIcon icon = new ImageIcon(getClass().getResource("paw.png"));
    ImageIcon logo = new ImageIcon(getClass().getResource("logo.png"));
    JLabel logo1 = new JLabel();

    JRadioButton clinic = new JRadioButton("Clinic");
    JRadioButton doctor = new JRadioButton("Doctor");

    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");

    JTextField userText = new JTextField();

    JPasswordField passwordText = new JPasswordField();

    JButton login = new JButton("Log In");
    JButton reg = new JButton("Create new account");


// this ir window for registrating new clinic
    JPanel panel2 = new JPanel();

    JButton back = new JButton("< Back");
    JLabel registration = new JLabel("Register Your clinic here");
    JLabel clinicName = new JLabel("Name of Clinic");
    JLabel regNumber = new JLabel("Registration number");

    //panel3 is window that will open when a user  logs in as a doctor
    JPanel panel3 = new JPanel();

    //panel4 is window that will open when a user logs in as a clinik
    JPanel panel4 = new JPanel();








}
