package adminPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import mainApplication.loginFrame;
import javax.swing.JPasswordField;

public class adminLogin extends JFrame {

	private JPanel contentPane;
	public static JTextField us;
	private JPasswordField pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLogin frame = new adminLogin();
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
	public adminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Quản trị viên/ Đăng nhập");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng nhập");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(382, 138, 242, 99);
		contentPane.add(lblNewLabel);
		
		JButton un_b = new JButton("New button");
		un_b.setBounds(0, 0, 0, 0);
		contentPane.add(un_b);
		
		JButton login_button = new JButton("Đăng nhập");
		login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
					String adminus = us.getText();
					String adminpw = new String (pw.getPassword());
					
					java.sql.Statement a = conn.createStatement();
					ResultSet user = a.executeQuery("select adminusername, adminpassword from admin");
					
					while(user.next()) {
					if(adminus.contains(user.getString("adminusername")) && adminpw.contains(user.getString("adminpassword"))) {
						new adminMainFrame().setVisible(true);
						dispose();
					}
					}
					}catch (Exception ex) {
						System.out.println("Fail!");
					}
			}
		});
		login_button.setForeground(Color.BLACK);
		login_button.setBackground(Color.ORANGE);
		login_button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button.setBounds(334, 397, 110, 39);
		contentPane.add(login_button);
		
		JButton reset_button = new JButton("Đặt lại");
		reset_button.setBackground(Color.ORANGE);
		reset_button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		reset_button.setBounds(500, 397, 110, 39);
		contentPane.add(reset_button);
		
		JLabel lblNewLabel_2 = new JLabel("Tên đăng nhập");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(197, 276, 97, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mật khẩu");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(542, 276, 97, 15);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\user.png"));
		lblNewLabel_1.setBounds(155, 305, 32, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\pw.png"));
		lblNewLabel_1_1.setBounds(500, 305, 32, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JButton login_button_1 = new JButton("Trở về");
		login_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		login_button_1.setForeground(Color.BLACK);
		login_button_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button_1.setBackground(Color.GRAY);
		login_button_1.setBounds(826, 10, 110, 39);
		contentPane.add(login_button_1);
		
		us = new JTextField();
		us.setHorizontalAlignment(SwingConstants.CENTER);
		us.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		us.setColumns(10);
		us.setBounds(197, 301, 227, 39);
		contentPane.add(us);
		
		pw = new JPasswordField();
		pw.setHorizontalAlignment(SwingConstants.CENTER);
		pw.setBounds(552, 303, 227, 37);
		contentPane.add(pw);
	}
}
