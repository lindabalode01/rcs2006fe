import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends Fields {
  //method for first log in page
  public void login1() {
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setBounds(100, 100, 700, 700);
      frame.setTitle("Simply VET ");
      frame.setIconImage(icon.getImage());

      frame.add(panel1);

      //creating log in window
      panel1.add(logo1);
      logo1.setIcon(logo);
      logo1.setBounds(30, 0, 560, 290);

      panel1.setLayout(null);
      panel1.setBackground(Color.LIGHT_GRAY);

      panel1.add(clinic);
      panel1.add(doctor);

      clinic.setBounds(175, 260, 100, 100);
      doctor.setBounds(275, 260, 100, 100);

//this method allows user to choose only one button doctor or clinic
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(clinic);
      buttonGroup.add(doctor);

      panel1.add(username);
      panel1.add(password);

      username.setBounds(50, 275, 200, 200);
      password.setBounds(50, 330, 200, 200);

      panel1.add(userText);
      panel1.add(passwordText);

      userText.setBounds(270, 350, 150, 40);
      passwordText.setBounds(270, 410, 150, 40);

      panel1.add(login);

      login.setBounds(250, 500, 200, 35);

      panel1.add(reg);

      reg.setBounds(20, 500, 160, 35);
    }
  //method for registration window
public void createNewAccount() {
  // if user clicks on registrate new window will open to make a new account
  reg.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      panel1.setVisible(false);
      frame.add(panel2);
      panel2.setVisible(true);
      panel2.setLayout(null);
      panel2.setBackground(Color.LIGHT_GRAY);
    }
  });

  //panel2 is the window that opens if user clicks on register
  panel2.add(back);
//if user wants he can click back to return to the first window
  back.setBounds(10, 10, 90, 40);
  back.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      panel2.setVisible(false);
      panel1.setVisible(true);
    }
  });

  panel2.add(registration);

  registration.setBounds(300, 100, 300, 70);
  registration.setText("Register Your clinic here");

  panel2.add(clinicName);
  panel2.add(regNumber);

  clinicName.setBounds(50, 150, 200, 200);
  regNumber.setBounds(50, 200, 200, 200);

}

//method for log in button, new window will open depending on wich radio button is selected and log in is pressed
      public void logInButton(){
      login.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (doctor.isSelected()){
            panel1.setVisible(false);
            frame.add(panel3);
            panel3.setVisible(true);
            panel3.setLayout(null);
            panel3.setBackground(Color.LIGHT_GRAY);
          } if (clinic.isSelected()){
            panel1.setVisible(false);
            frame.add(panel4);
            panel4.setVisible(true);
            panel4.setLayout(null);
            panel4.setBackground(Color.LIGHT_GRAY);
          }
        }
      });
    }

    //method for window if user logs in as doctor = panel3
  public void doctorWindow(){

  }

  //method for window if user logs in as clinic = panel4
  public void clinicWindow(){

  }
}
