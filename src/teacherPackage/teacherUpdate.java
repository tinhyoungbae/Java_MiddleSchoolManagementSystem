package teacherPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import adminPackage.adminStudent;
import mainApplication.mainFrame;
import mainApplication.teacherLogin;
import studentPackage.studentUpdate;

public class teacherUpdate extends JFrame {

	private JPanel contentPane;
	private JTextField getht;
	private JTextField getns;
	private JTextField getgt;
	private JTextField getsdt;
	private JTextField getemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacherUpdate frame = new teacherUpdate();
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
	public teacherUpdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,628, 629);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Giáo viên/ Cập nhật thông tin");
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Trở về");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(504, 10, 100, 38);
		getContentPane().add(btnNewButton);
		
		JButton un = new JButton("");
		un.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		un.setBounds(0, 0, 0, 0);
		getContentPane().add(un);
		
		JLabel lblNewLabel = new JLabel("CẬP NHẬT THÔNG TIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(84, 55, 394, 38);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ tên:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(80, 164, 100, 25);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày sinh:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(80, 230, 100, 25);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Giới tính:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(80, 293, 100, 25);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Số điện thoại:");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(65, 362, 100, 25);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email:");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(92, 417, 100, 25);
		getContentPane().add(lblNewLabel_1_4);
		
		getht = new JTextField();
		getht.setBounds(218, 159, 246, 38);
		getContentPane().add(getht);
		getht.setColumns(10);
		
		getns = new JTextField();
		getns.setColumns(10);
		getns.setBounds(218, 225, 246, 38);
		getContentPane().add(getns);
		
		getgt = new JTextField();
		getgt.setColumns(10);
		getgt.setBounds(218, 288, 246, 38);
		getContentPane().add(getgt);
		
		getsdt = new JTextField();
		getsdt.setColumns(10);
		getsdt.setBounds(218, 349, 246, 38);
		getContentPane().add(getsdt);
		
		getemail = new JTextField();
		getemail.setColumns(10);
		getemail.setBounds(218, 412, 246, 38);
		getContentPane().add(getemail);
		
		JButton btnCpNht = new JButton("Cập nhật");
		btnCpNht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = teacherLogin.teacher_us.getText();
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);

					PreparedStatement up_gv = (PreparedStatement) conn.prepareStatement("update giaovien set hoten_nv = ?, namsinh_nv = ?, gioitinh_nv = ?, sdt_nv = ?, email_nv = ? where id_nv = ?");
					up_gv.setString(1, getht.getText());
					up_gv.setString(2, getns.getText());
					up_gv.setString(3, getgt.getText());
					up_gv.setString(4, getsdt.getText());
					up_gv.setString(5, getemail.getText());
					up_gv.setString(6, s);
					up_gv.executeUpdate();
					JOptionPane.showMessageDialog(teacherUpdate.this, "Cập nhật thông tin thành công", "Cập nhật thông tin", JOptionPane.PLAIN_MESSAGE);
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(teacherUpdate.this, "Cập nhật thông tin thất bại", "Cập nhật thông tin", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnCpNht.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCpNht.setBounds(180, 479, 100, 38);
		getContentPane().add(btnCpNht);
		
		JButton btntLi = new JButton("Đặt lại");
		btntLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getht.setText("");
				getns.setText("");
				getgt.setText("");
				getsdt.setText("");
				getemail.setText("");
			}
		});
		btntLi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btntLi.setBounds(315, 479, 100, 38);
		getContentPane().add(btntLi);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		String s = teacherLogin.teacher_us.getText();
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			java.sql.Statement a = conn.createStatement();
			ResultSet user = a.executeQuery("select hoten_nv, namsinh_nv, gioitinh_nv, sdt_nv, email_nv from giaovien where id_nv = '"+s+"'");
			
			while(user.next()) {
				getht.setText(user.getString(1));
				getns.setText(user.getString(2));
				getgt.setText(user.getString(3));
				getsdt.setText(user.getString(4));
				getemail.setText(user.getString(5));
			}
		}catch (Exception ex) {
		}
		if(getgt.getText().contains("1")) {
			getgt.setText("Nam");
		}
		else {
			getgt.setText("Nữ");
		}
	}

}
