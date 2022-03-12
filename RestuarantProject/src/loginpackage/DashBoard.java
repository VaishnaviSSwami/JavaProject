package loginpackage;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DashBoard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void dashBoard() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
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
	public DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,900,750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Vaishnavi\\Desktop\\JavaProject\\RestuarantProject\\src\\loginpackage\\foodm.jpg"));
		btnNewButton.setBounds(327, 174, 210, 183);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("STAFF MANAGEMENT");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(72, 365, 231, 25);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Vaishnavi\\Desktop\\JavaProject\\RestuarantProject\\src\\loginpackage\\staffman.png"));
		btnNewButton_1.setBounds(56, 172, 210, 186);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				StaffManagement s=new StaffManagement();
				s.staff();
				
				
			}
	
		});
		
		JLabel lblFoodManagement = new JLabel("FOOD MANAGEMENT");
		lblFoodManagement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFoodManagement.setBounds(337, 365, 231, 25);
		frame.getContentPane().add(lblFoodManagement);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Vaishnavi\\Desktop\\JavaProject\\RestuarantProject\\src\\loginpackage\\billl.png"));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(609, 174, 210, 183);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblGenerateBill = new JLabel("GENERATE BILL");
		lblGenerateBill.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenerateBill.setBounds(645, 365, 231, 25);
		frame.getContentPane().add(lblGenerateBill);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Vaishnavi\\Desktop\\JavaProject\\RestuarantProject\\bin\\loginpackage\\images_ccexpress.jpeg"));
		lblNewLabel_2.setBounds(0, 0, 886, 130);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}

}
