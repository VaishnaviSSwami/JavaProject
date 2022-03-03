package loginpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 900, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO RESTUARNT MANAGEMENT");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(65, 35, 761, 62);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Vaishnavi\\Desktop\\JavaProject\\RestuarantProject\\bin\\loginpackage\\images_ccexpress.jpeg"));
		lblNewLabel_2.setBounds(0, 0, 886, 130);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblpass = new JLabel("PASSWORD");
		lblpass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblpass.setBounds(503, 325, 118, 37);
		contentPane.add(lblpass);
		
		textField = new JTextField();
		textField.setForeground(new Color(32, 178, 170));
		textField.setBounds(647, 264, 179, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblusername = new JLabel("USERNAME");
		lblusername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblusername.setBounds(503, 260, 118, 37);
		contentPane.add(lblusername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(647, 325, 179, 37);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(0, 128, 128));
		btnLogin.setBackground(new Color(230, 230, 250));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(503, 413, 168, 37);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Vaishnavi\\Desktop\\JavaProject\\RestuarantProject\\src\\loginpackage\\bgcartoon.jpg"));
		lblNewLabel.setBounds(0, 169, 722, 481);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLogin.setBounds(604, 187, 118, 37);
		contentPane.add(lblLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(0, 128, 128));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBackground(new Color(230, 230, 250));
		btnReset.setBounds(696, 413, 168, 37);
		contentPane.add(btnReset);
		btnReset.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						textField.setText(null);
						passwordField.setText(null);
					}
			
				}
		);
		
		btnLogin.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username=textField.getText();
				String pass=passwordField.getText();
				if(username.contains("admin") && pass.contains("admin"))
				{
					JOptionPane.showMessageDialog(null ,"Login Sucessful !!press ok to proceed","Sucessfull!!!",JOptionPane.INFORMATION_MESSAGE);
					DashBoard d=new DashBoard();
					d.dashBoard();
				}
				else
				{
					JOptionPane.showMessageDialog(null ,"Invalid ","error",JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		
		
	}
	
}
