package mainApplication;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import teacherPackage.teacherMainFrame;
import teacherPackage.teacherUpdate;

public class teacher_ResetPassword extends JFrame {

	private JPanel contentPane;
	private JTextField teacher_us;
	private JTextField teacher_sdt;
	private JTextField teacher_email;
	private JTextField teacher_pw;
	private JTextField teacher_rpw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher_ResetPassword frame = new teacher_ResetPassword();
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
	public teacher_ResetPassword() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Đặt lại mật khẩu");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đặt lại mật khẩu");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(398, 65, 196, 63);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên đăng nhập:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(436, 138, 116, 27);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Số điện thoại:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(436, 215, 116, 27);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Thư điện tử:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(436, 288, 116, 27);
		getContentPane().add(lblNewLabel_1_2);
		
		teacher_us = new JTextField();
		teacher_us.setHorizontalAlignment(SwingConstants.CENTER);
		teacher_us.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		teacher_us.setBounds(436, 168, 366, 37);
		getContentPane().add(teacher_us);
		teacher_us.setColumns(10);
		
		teacher_sdt = new JTextField();
		teacher_sdt.setHorizontalAlignment(SwingConstants.CENTER);
		teacher_sdt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		teacher_sdt.setColumns(10);
		teacher_sdt.setBounds(436, 241, 366, 37);
		getContentPane().add(teacher_sdt);
		
		teacher_email = new JTextField();
		teacher_email.setHorizontalAlignment(SwingConstants.CENTER);
		teacher_email.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		teacher_email.setColumns(10);
		teacher_email.setBounds(436, 318, 366, 37);
		getContentPane().add(teacher_email);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Mật khẩu mới:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(436, 373, 116, 27);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Nhập lại mật khẩu mới:");
		lblNewLabel_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_2_2.setBounds(436, 446, 144, 27);
		getContentPane().add(lblNewLabel_1_2_2);
		
		teacher_pw = new JTextField();
		teacher_pw.setHorizontalAlignment(SwingConstants.CENTER);
		teacher_pw.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		teacher_pw.setColumns(10);
		teacher_pw.setBounds(436, 399, 366, 37);
		getContentPane().add(teacher_pw);
		
		teacher_rpw = new JTextField();
		teacher_rpw.setHorizontalAlignment(SwingConstants.CENTER);
		teacher_rpw.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		teacher_rpw.setColumns(10);
		teacher_rpw.setBounds(436, 475, 366, 37);
		getContentPane().add(teacher_rpw);
		
		JButton btnNewButton = new JButton("Cập nhật");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
					String user = teacher_us.getText();
					String sdt = teacher_sdt.getText();
					String email = teacher_email.getText();
					
					java.sql.Statement a = conn.createStatement();
					ResultSet useraccount = a.executeQuery("select id_nv, sdt_nv, email_nv from giaovien");
					
					while(useraccount.next()) {
					if(user.contains(useraccount.getString("id_nv")) && sdt.contains(useraccount.getString("sdt_nv")) && email.contains(useraccount.getString("email_nv"))) {
						try {
							String dbURL1 = "jdbc:mysql://localhost:3306/qlthcs";
							String username1 = "root";
							String password1 = "";
							Connection conn1 = DriverManager.getConnection(dbURL1, username1, password1);
							PreparedStatement up_gv = (PreparedStatement) conn1.prepareStatement("update teacheraccount set teacherpassword = ? where teacherusername = ?");
							up_gv.setString(1, teacher_pw.getText());
							up_gv.setString(2, teacher_us.getText());
							up_gv.executeUpdate();
							JOptionPane.showMessageDialog(teacher_ResetPassword.this, "Cập nhật thông tin thành công");
						}catch (Exception ex) {
							JOptionPane.showMessageDialog(teacher_ResetPassword.this, "Cập nhật thông tin thất bại");
						
					}
					}
					}
					}catch (Exception ex) {
					}
				
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(353, 579, 104, 37);
		getContentPane().add(btnNewButton);
		
		JButton btntLi = new JButton("Đặt lại");
		btntLi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btntLi.setBackground(Color.ORANGE);
		btntLi.setBounds(536, 579, 104, 37);
		getContentPane().add(btntLi);
		
		JButton btnTrV = new JButton("Trở về");
		btnTrV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnTrV.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnTrV.setBackground(Color.ORANGE);
		btnTrV.setBounds(832, 10, 104, 37);
		getContentPane().add(btnTrV);
		
		JTextArea txtrBnPhiCung = new JTextArea();
		txtrBnPhiCung.setBackground(Color.LIGHT_GRAY);
		txtrBnPhiCung.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtrBnPhiCung.setText("Bạn phải cung cấp đúng mã số học sinh/ giáo viên cùng "
				+ "với số điện thoại và thư điện tử để đặt lại mật khẩu mới. Nếu không "
				+ "có đủ 03 trường dữ liệu trên bạn không thể đặt lại mật khẩu trên ứng dụng này, "
				+ "vui lòng liên hệ quản trị viên để xác thực thông tin và cấp lại mật khẩu mới.");
		txtrBnPhiCung.setBounds(45, 232, 152, 254);
		getContentPane().add(txtrBnPhiCung);
		txtrBnPhiCung.setLineWrap(true);
		txtrBnPhiCung.setEditable(false); //Ngăn chặn edit văn bản
		txtrBnPhiCung.setWrapStyleWord(true);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\user.png"));
		lblNewLabel_2.setBounds(353, 171, 32, 32);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\phone-call-auricular-symbol-in-black_icon-icons.com_56483.png"));
		lblNewLabel_2_1.setBounds(353, 246, 32, 32);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\mail_email_message_electronic_online_web_icon-icons.com_59986.png"));
		lblNewLabel_2_2.setBounds(353, 318, 32, 32);
		getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\pw.png"));
		lblNewLabel_2_3.setBounds(353, 402, 32, 32);
		getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("New label");
		lblNewLabel_2_4.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\repeat_icon_174975.png"));
		lblNewLabel_2_4.setBounds(353, 475, 32, 32);
		getContentPane().add(lblNewLabel_2_4);
		
		
		
		JButton un_b = new JButton("New button");
		un_b.setBounds(0, 0, 0, 0);
		contentPane.add(un_b);
	}

}
