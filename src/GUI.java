import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel pwdLabel;
	private static JTextField pwdText;
	private static JButton loginBtn;
	private static JLabel successLabel;
	
	
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(300,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		
		// User label and text box
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		// Password label and password entry
		pwdLabel = new JLabel("Password");
		pwdLabel.setBounds(10, 60, 80, 25);
		panel.add(pwdLabel);
		
		pwdText = new JPasswordField(20);
		pwdText.setBounds(100, 60, 165, 25);
		panel.add(pwdText);
		
		// Login button
		loginBtn = new JButton("Login");
		loginBtn.setBounds(10, 125, 100, 25);
		loginBtn.addActionListener(new GUI());
		panel.add(loginBtn);
		
		// Success label
		successLabel = new JLabel("");
		successLabel.setBounds(10, 150, 300, 25);
		panel.add(successLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String pwd = pwdText.getText();
		
//		System.out.println(user);
//		System.out.println(pwd);
		
		if(user.equals("admin") && pwd.equals("password") ) {
			successLabel.setText("You have logged in successfully.");
		} else {
			successLabel.setText("Incorrect login.");
		}
	}

}
