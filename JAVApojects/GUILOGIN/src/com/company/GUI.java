package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
	private static JLabel userlabel;
	private static JLabel passwordlabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JTextField userText;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(350,200);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    frame.add(panel);

	    panel.setLayout(null);

	    userlabel = new JLabel("User");
	    userlabel.setBounds(10,20,80,25);
	    panel.add(userlabel);

	    passwordlabel = new JLabel("Password");
	    passwordlabel.setBounds(10,50,80,25);
	    panel.add(passwordlabel);

	    passwordText = new JPasswordField();
	    passwordText.setBounds(100,50,165,25);
	    panel.add(passwordText);

	    button = new JButton("Login");
	    button.setBounds(10,80,80,25);
	    button.addActionListener(new GUI());
	    panel.add(button);


	    success = new JLabel("");
	    success.setBounds(10,110,300,25);
	    panel.add(success);




	    userText = new JTextField(20);
	    userText.setBounds(100,20,165,25);
	    panel.add(userText);


		frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user +","+ password);
		if(user.equals("Grzegorz") && password.equals("pogchamp123")){
			success.setText("Logowanie zakończone powodzeniem");

		}else{
			success.setText("Logowanie zakończone niepowodzeniem");
		}
	}
}
