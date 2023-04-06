package mainApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import adminPackage.adminLogin;
import adminPackage.adminMainFrame;
import studentPackage.studentMainFrame;
import teacherPackage.teacherMainFrame;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JPasswordField;

public class mainFrame extends JFrame {

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
					mainFrame frame = new mainFrame();
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
	public mainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Trang chủ");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chương trình quản lý Trường Trung học cơ sở");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(236, 76, 509, 99);
		contentPane.add(lblNewLabel);
		
		JButton un_b = new JButton("New button");
		un_b.setBounds(0, 0, 0, 0);
		contentPane.add(un_b);
		
		us = new JTextField();
		us.setBackground(Color.WHITE);
		us.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		us.setHorizontalAlignment(SwingConstants.CENTER);
		us.setBounds(197, 301, 227, 39);
		contentPane.add(us);
		us.setColumns(10);
		
		JButton login_button = new JButton("Đăng nhập");
		login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
					String accountus = us.getText();
					String accountpw = new String (pw.getPassword());
					
					java.sql.Statement a = conn.createStatement();
					ResultSet user = a.executeQuery("select studentusername, studentpassword from studentaccount");
					
					while(user.next()) {
					if(accountus.contains(user.getString("studentusername")) && accountpw.contains(user.getString("studentpassword"))) {
						new studentMainFrame().setVisible(true);
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
		login_button.setBounds(334, 380, 110, 39);
		contentPane.add(login_button);
		
		JButton reset_button = new JButton("Đặt lại");
		reset_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				us.setText("");
				pw.setText("");
			}
		});
		reset_button.setBackground(Color.ORANGE);
		reset_button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		reset_button.setBounds(500, 380, 110, 39);
		contentPane.add(reset_button);
		
		JLabel forgot_password = new JLabel("Quên mật khẩu?");
		forgot_password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new resetPassword().setVisible(true);
			}
		});
		forgot_password.setForeground(Color.RED);
		forgot_password.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		forgot_password.setBounds(416, 439, 97, 28);
		contentPane.add(forgot_password);
		
		JLabel lblNewLabel_2 = new JLabel("Tên đăng nhập");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(263, 276, 97, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mật khẩu");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(581, 276, 97, 15);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Đăng ký tài khoản mới   -->");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(264, 520, 180, 28);
		contentPane.add(lblNewLabel_3);
		
		JButton register_button = new JButton("Đăng ký");
		register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new loginFrame().setVisible(true);
				dispose();
			}
		});
		register_button.setBackground(Color.GRAY);
		register_button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		register_button.setBounds(500, 515, 110, 39);
		contentPane.add(register_button);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\user.png"));
		lblNewLabel_1.setBounds(155, 305, 32, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\pw.png"));
		lblNewLabel_1_1.setBounds(500, 305, 32, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new adminLogin().setVisible(true);
			}
		});
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_1_2.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\administrator_3552.png"));
		lblNewLabel_1_2.setBounds(41, 37, 32, 32);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("Quản trị");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new adminLogin().setVisible(true);
			}
		});
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(36, 79, 65, 15);
		contentPane.add(lblNewLabel_4);
		
		pw = new JPasswordField();
		pw.setBackground(Color.WHITE);
		pw.setHorizontalAlignment(SwingConstants.CENTER);
		pw.setBounds(542, 302, 227, 39);
		contentPane.add(pw);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("New label");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\teacher.png"));
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_1_2_1.setBounds(41, 104, 32, 32);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Giáo viên");
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new teacherLogin().setVisible(true);
			}
		});
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(36, 146, 65, 15);
		contentPane.add(lblNewLabel_4_1);
	}
}
