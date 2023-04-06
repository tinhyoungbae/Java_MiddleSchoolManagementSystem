package adminPackage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class adminStudentInfo extends JFrame {

	private JPanel contentPane;
	private JTextField search;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminStudentInfo frame = new adminStudentInfo();
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
	public adminStudentInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Quản trị viên/ Học sinh/ Thông tin học sinh");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN HỌC SINH");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(64, 32, 364, 65);
		contentPane.add(lblNewLabel);
		
		JButton un_b = new JButton("New button");
		un_b.setBounds(0, 0, 0, 0);
		contentPane.add(un_b);
		
		search = new JTextField();
		search.setHorizontalAlignment(SwingConstants.CENTER);
		search.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		search.setBounds(188, 127, 474, 40);
		contentPane.add(search);
		search.setColumns(10);
		
		JButton btnNewButton = new JButton("Trở về");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(820, 32, 85, 38);
		contentPane.add(btnNewButton);
		
		final JLabel aa = new JLabel("Năm học");
		aa.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		aa.setBounds(335, 216, 94, 21);
		contentPane.add(aa);
		
		
		final JLabel getnh = new JLabel("Null");
		getnh.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getnh.setBounds(418, 216, 198, 21);
		contentPane.add(getnh);
		
		final JLabel gethk = new JLabel("Null");
		gethk.setFont(new Font("Times New Roman", Font.BOLD, 13));
		gethk.setBounds(723, 216, 198, 21);
		contentPane.add(gethk);
		
		final JLabel getidhs = new JLabel("Null");
		getidhs.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getidhs.setBounds(148, 235, 198, 16);
		contentPane.add(getidhs);
		
		final JLabel gethths = new JLabel("Null");
		gethths.setFont(new Font("Times New Roman", Font.BOLD, 13));
		gethths.setBounds(148, 275, 198, 16);
		contentPane.add(gethths);
		
		final JLabel getlophs = new JLabel("Null");
		getlophs.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getlophs.setBounds(148, 315, 198, 16);
		contentPane.add(getlophs);
		
		final JLabel getgths = new JLabel("Null");
		getgths.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getgths.setBounds(148, 350, 198, 16);
		contentPane.add(getgths);
		
		final JLabel getnshs = new JLabel("Null");
		getnshs.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getnshs.setBounds(148, 395, 198, 16);
		contentPane.add(getnshs);
		
		final JLabel getsdths = new JLabel("Null");
		getsdths.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getsdths.setBounds(148, 435, 198, 16);
		contentPane.add(getsdths);
		
		final JLabel getemailhs = new JLabel("Null");
		getemailhs.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getemailhs.setBounds(148, 475, 198, 16);
		contentPane.add(getemailhs);
		
		JButton btnNewButton_1 = new JButton("Tìm kiếm");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(335, 247, 513, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Môn học");
				head.add("Miệng");
				head.add("15'");
				head.add("15'");
				head.add("15'");
				head.add("1 tiết'");
				head.add("1 tiết");
				head.add("Thi");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				String s = search.getText();
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select ten_mh, diemmieng, diem151, diem152, diem153, diem1t1, diem1t2, diemthi, ten_nh, ten_hk from monhoc, bangdiem, namhoc, hocky where id_hs = '"+s+"' and monhoc.id_mh = bangdiem.id_mh and namhoc.id_nh = bangdiem.id_nh and hocky.id_hk = bangdiem.id_hk");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             rows.add(user.getString(8));
		             dt.add(rows);
		             getnh.setText(user.getString(9));
		             gethk.setText(user.getString(10));
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				scrollPane1.setBounds(345, 247, 513, 408);
				contentPane.add(scrollPane1);
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				String s = search.getText();
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, gioitinh_hs, namsinh_hs, sdt_hs, email_hs from hocsinh where id_hs = '"+s+"'");
				
				while(user.next()) {
					getidhs.setText(user.getString(1));
		             gethths.setText(user.getString(2));
		             getlophs.setText(user.getString(3));
		             getgths.setText(user.getString(4));
		             getnshs.setText(user.getString(5));
		             getsdths.setText(user.getString(6));
		             getemailhs.setText(user.getString(7));
		             //gethk.setText(user.getString(8));
				}
				}catch (Exception ex) {
					
				}	
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(704, 128, 101, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Mã học sinh");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(44, 230, 94, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên học sinh");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(44, 270, 94, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Lớp");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(44, 310, 94, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Giới tính");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_3.setBounds(44, 350, 94, 21);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Năm sinh");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_4.setBounds(44, 390, 94, 21);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Số điện thoại");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_5.setBounds(44, 430, 94, 21);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Thư điện tử");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_6.setBounds(44, 470, 94, 21);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Username");
		lblNewLabel_1_7.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_7.setBounds(44, 510, 94, 21);
		contentPane.add(lblNewLabel_1_7);
		
		
		
		JLabel getusername = new JLabel("Null");
		getusername.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getusername.setBounds(148, 515, 198, 16);
		contentPane.add(getusername);
		
		final JTable table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(Color.LIGHT_GRAY);
		
		table.setBounds(335, 247, 513, 408);
		contentPane.add(table);
		
		final Vector head = new Vector();
		final Vector dt = new Vector();
		head.add("Môn học");
		head.add("Miệng");
		head.add("15'");
		head.add("15'");
		head.add("15'");
		head.add("1 tiết'");
		head.add("1 tiết");
		head.add("Thi");
		String s = adminStudent.getid.getText();
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
		
		java.sql.Statement a = conn.createStatement();
		ResultSet user = a.executeQuery("select ten_mh, diemmieng, diem151, diem152, diem153, diem1t1, diem1t2, diemthi, ten_nh, ten_hk from monhoc, bangdiem, namhoc, hocky where id_hs like '%"+s+"%' and monhoc.id_mh = bangdiem.id_mh and namhoc.id_nh = bangdiem.id_nh and hocky.id_hk = bangdiem.id_hk");
		
		while(user.next()) {
			Vector rows = new Vector();
             rows.add(user.getString(1));
             rows.add(user.getString(2));
             rows.add(user.getString(3));
             rows.add(user.getString(4));
             rows.add(user.getString(5));
             rows.add(user.getString(6));
             rows.add(user.getString(7));
             rows.add(user.getString(8));
             dt.add(rows);
             getnh.setText(user.getString(9));
             gethk.setText(user.getString(10));
		}
		}catch (Exception ex) {
			
		}	
		table.setModel(new DefaultTableModel(dt, head));
		JScrollPane scrollPane1 = new JScrollPane(table);
		scrollPane1.setBounds(345, 247, 513, 408);
		contentPane.add(scrollPane1);
		
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
		java.sql.Statement a = conn.createStatement();
		ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, gioitinh_hs, namsinh_hs, sdt_hs, email_hs from hocsinh where id_hs = '"+s+"'");
		
		while(user.next()) {
			getidhs.setText(user.getString(1));
             gethths.setText(user.getString(2));
             getlophs.setText(user.getString(3));
             getgths.setText(user.getString(4));
             getnshs.setText(user.getString(5));
             getsdths.setText(user.getString(6));
             getemailhs.setText(user.getString(7));
             getusername.setText(user.getString(1));
             //gethk.setText(user.getString(8));
		}
		}catch (Exception ex) {
			
		}	
		
		JLabel lblNewLabel_1_9 = new JLabel("Học kỳ");
		lblNewLabel_1_9.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_9.setBounds(638, 216, 94, 21);
		contentPane.add(lblNewLabel_1_9);


		
		JLabel lblNewLabel_1_10 = new JLabel("Nhập mã học sinh để truy vấn thông tin học sinh");
		lblNewLabel_1_10.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_10.setBounds(188, 105, 323, 21);
		contentPane.add(lblNewLabel_1_10);
	}
}
