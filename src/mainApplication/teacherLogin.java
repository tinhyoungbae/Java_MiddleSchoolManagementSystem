package mainApplication;

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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import adminPackage.adminMainFrame;
import studentPackage.studentMainFrame;
import teacherPackage.teacherMainFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class teacherLogin extends JFrame {

	private JPanel contentPane;
	public static JTextField teacher_us;
	private JPasswordField teacher_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacherLogin frame = new teacherLogin();
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
	public teacherLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Giáo viên/ Đăng nhập");
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
					String accountus = teacher_us.getText();
					String accountpw = new String (teacher_pw.getPassword());
					
					java.sql.Statement a = conn.createStatement();
					ResultSet user = a.executeQuery("select teacherusername, teacherpassword from teacheraccount");
					
					while(user.next()) {
					if(accountus.contains(user.getString("teacherusername")) && accountpw.contains(user.getString("teacherpassword"))) {
						new teacherMainFrame().setVisible(true);
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
		
		JButton teacher_reset_button = new JButton("Đặt lại");
		teacher_reset_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_us.setText("");
				teacher_pw.setText("");
			}
		});
		teacher_reset_button.setBackground(Color.ORANGE);
		teacher_reset_button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		teacher_reset_button.setBounds(500, 397, 110, 39);
		contentPane.add(teacher_reset_button);
		
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
		
		teacher_us = new JTextField();
		teacher_us.setHorizontalAlignment(SwingConstants.CENTER);
		teacher_us.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		teacher_us.setColumns(10);
		teacher_us.setBounds(197, 301, 227, 39);
		contentPane.add(teacher_us);
		
		teacher_pw = new JPasswordField();
		teacher_pw.setHorizontalAlignment(SwingConstants.CENTER);
		teacher_pw.setBounds(552, 303, 227, 37);
		contentPane.add(teacher_pw);
		
		JLabel teacher_forgot_password = new JLabel("Quên mật khẩu?");
		teacher_forgot_password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new teacher_ResetPassword().setVisible(true);
			}
		});
		teacher_forgot_password.setForeground(Color.RED);
		teacher_forgot_password.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		teacher_forgot_password.setBounds(437, 464, 97, 28);
		contentPane.add(teacher_forgot_password);
		
		JLabel lblNewLabel_3_1 = new JLabel("Đăng ký tài khoản mới   -->");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(283, 518, 180, 28);
		contentPane.add(lblNewLabel_3_1);
		
		JButton teacher_register_button = new JButton("Đăng ký");
		teacher_register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new teacherRegister().setVisible(true);
			}
		});
		teacher_register_button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		teacher_register_button.setBackground(Color.GRAY);
		teacher_register_button.setBounds(514, 507, 110, 39);
		contentPane.add(teacher_register_button);
	}
}
