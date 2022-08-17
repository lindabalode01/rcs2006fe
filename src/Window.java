import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends Fields {
    public void login1(){
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setBounds(100,100,700,700);
      frame.setTitle("Registration form");

      frame.add(panel1);

      panel1.setLayout(null);
      panel1.setBackground(Color.LIGHT_GRAY);

      panel1.add(klinika);
      panel1.add(arsts);

      klinika.setBounds(50, 50, 100,100);
      arsts.setBounds(150, 50, 100,100);

        panel1.add(username);
        panel1.add(password);

        username.setBounds(50, 200,200,200);
        password.setBounds(50,250, 200,200);

        panel1.add(userText);
        panel1.add(passwordText);

        userText.setBounds(250, 280,200,50);
        passwordText.setBounds(250,330,200,50);

      panel1.add(login);

      login.setBounds(250,400,200,50);

      panel1.add(reg);

      reg.setBounds(250,75, 200,50);

//      login.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//          panel1.dispatchEvent(new Runnable() {});
//          frame.add(panel2);
//          panel2.setBackground(Color.GREEN);
//        }
//      });


    }
}
