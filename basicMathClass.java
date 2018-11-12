import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class basicMathClass {

	private JFrame frame;
	private JTextField textFieldnum1;
	private JTextField textFieldnum2;
	private JTextField textFieldAns;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					basicMathClass window = new basicMathClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public basicMathClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBounds(10, 43, 194, 36);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBounds(224, 43, 187, 36);
		frame.getContentPane().add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter Valid Number!");
				}
			}
		});
		btnNewButton_1.setBounds(24, 90, 163, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Minus");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter Valid Number!");
				}
			}
		});
		btnNewButton.setBounds(237, 90, 152, 41);
		frame.getContentPane().add(btnNewButton);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(212, 197, 194, 41);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Centaur", Font.BOLD, 14));
		lblNewLabel.setBounds(94, 202, 96, 36);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("Multiply");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter Valid Number!");
				}
				
				
			}
		});
		btnNewButton_2.setBounds(24, 147, 163, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Divide");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					
					ans = num1 / num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch (Exception e3) {
					JOptionPane.showMessageDialog(null, "Please enter Valid Number!");
				}
			}
		});
		btnNewButton_3.setBounds(237, 142, 152, 44);
		frame.getContentPane().add(btnNewButton_3);
	}
}
