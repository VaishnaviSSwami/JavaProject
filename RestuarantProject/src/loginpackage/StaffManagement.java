package loginpackage;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class StaffManagement {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void staff() {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8081/restuarantdb","root","root123");  
			if(con!=null)
			{
				System.out.println("Connected");
				
			}
			//admin
		}
		
		catch(Exception e)
		{
			System.out.print("not connected");
		}
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffManagement window = new StaffManagement();
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
	public StaffManagement() {
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
	}

}
