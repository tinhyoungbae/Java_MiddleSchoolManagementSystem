package teacherPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import mainApplication.resetPassword;
import mainApplication.teacherLogin;
import mainApplication.teacher_ResetPassword;
import studentPackage.studentListClass;
import studentPackage.studentUpdate;
import javax.swing.border.BevelBorder;

public class teacherMainFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacherMainFrame frame = new teacherMainFrame();
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
	public teacherMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1000,800);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setTitle("Giáo viên/ Trang chủ");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Xin chào");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(112, 34, 113, 57);
		getContentPane().add(lblNewLabel_1);
		
		JLabel getnameteacher = new JLabel("getnames");
		getnameteacher.setForeground(Color.BLUE);
		getnameteacher.setBackground(Color.BLUE);
		getnameteacher.setFont(new Font("Times New Roman", Font.BOLD, 25));
		getnameteacher.setBounds(235, 34, 389, 57);
		getContentPane().add(getnameteacher);
		
		JLabel lblNewLabel_2 = new JLabel("Năm học:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(40, 136, 69, 29);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Học kỳ:");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(40, 175, 69, 29);
		getContentPane().add(lblNewLabel_2_1);
		//----------------------------

		//-------------------------
		//----------------------------
		String s = teacherLogin.teacher_us.getText();
				JTable table1 = new JTable();
				
				table1.setBounds(332, 421, 572, 226);
				contentPane.add(table1);
				
				Vector head1 = new Vector();
				final Vector dt1 = new Vector();
				
				head1.add("Tháng");
				head1.add("Lương cơ bản");
				head1.add("Chỉ số thưởng");
				head1.add("Tổng lương");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet luong = a.executeQuery("select thang, luongcoban, chisothuong, tongluong from luong where id_nv = '"+s+"'");
				//ResultSet rs = a.executeQuery("select hoten_nv from giaovien where id_nv = '"+s+"'");
				while(luong.next()) {
					Vector rows = new Vector();
		             rows.add(luong.getString(1));
		             rows.add(luong.getString(2));
		             rows.add(luong.getString(3));
		             rows.add(luong.getString(4));
		             dt1.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				
				table1.setModel((TableModel) new DefaultTableModel(dt1, head1));
				JScrollPane scrollPane1 = new JScrollPane(table1);
				scrollPane1.setBounds(332, 421, 572, 226);
				contentPane.add(scrollPane1);
				table1.setEnabled(false);
				//-------------------------
		
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s = teacherLogin.teacher_us.getText();
				java.sql.Statement a1 = conn.createStatement();
				//ResultSet luong = a.executeQuery("select thang, luongcoban, chisothuong, tongluong from luong where id_nv = '"+s+"'");
				ResultSet rs = a1.executeQuery("select hoten_nv from giaovien where id_nv = '"+s+"'");
				while(rs.next()) {
					getnameteacher.setText(rs.getString(1));
				}
				}catch (Exception ex) {
					
				}	
		
		JLabel lblNewLabel_2_2 = new JLabel("Thời khóa biểu");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(332, 105, 113, 29);
		getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Lương");
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(332, 382, 113, 29);
		getContentPane().add(lblNewLabel_2_2_1);
		
		JButton btnNewButton = new JButton("Đăng xuất");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(828, 10, 108, 41);
		getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(40, 409, 185, 238);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("Nhập điểm");
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new teacherInputScore().setVisible(true);
			}
		});
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(40, 33, 120, 29);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Cập nhật thông tin");
		lblNewLabel_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new teacherUpdate().setVisible(true);
			}
		});
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_4.setBounds(40, 137, 113, 29);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Đổi mật khẩu");
		lblNewLabel_2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new teacher_ResetPassword().setVisible(true);
			}
		});
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_5.setBounds(47, 185, 113, 29);
		panel.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Cập nhật điểm");
		lblNewLabel_2_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new teacherInputScore().setVisible(true);
			}
		});
		lblNewLabel_2_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_3_1.setBounds(40, 84, 120, 29);
		panel.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Lựa chọn");
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2_1_1_1.setBounds(96, 388, 113, 29);
		getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel getnh = new JLabel("null");
		getnh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getnh.setBounds(119, 136, 69, 29);
		getContentPane().add(getnh);
		
		JLabel gethk = new JLabel("null");
		gethk.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gethk.setBounds(119, 175, 69, 29);
		getContentPane().add(gethk);
		
		Date today = new Date();
		DateFormat df = new SimpleDateFormat("hh:mm:ss");
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		if(year == 2018) getnh.setText("2018-2019");
		if(year == 2019) getnh.setText("2019-2020");
		if(year == 2020) getnh.setText("2020-2021");
		if(year == 2021) getnh.setText("2021-2022");
		if(year == 2022) getnh.setText("2022-2023");
		if(year == 2023) getnh.setText("2023-2024");
		if(year == 2024) getnh.setText("2024-2025");
		
		if(month >= 8 || month <= 12) gethk.setText("1");
		if(month >= 1 || month <= 5) gethk.setText("2");
		if(month > 5 || month < 8) gethk.setText("Hè");
		
		JButton un = new JButton("");
		un.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		un.setBounds(0, 0, 0, 0);
		getContentPane().add(un);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel);
		

		
		JTable table = new JTable();
		
		table.setBounds(332, 144, 570, 226);
		contentPane.add(table);
		
		Vector head = new Vector();
		final Vector dt = new Vector();
		head.add("Tiết");
		head.add("Thứ");
		head.add("Môn");
		head.add("Lớp");
		
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
		
		java.sql.Statement a = conn.createStatement();
		ResultSet luong = a.executeQuery("select * from thoikhoabieu where id_nv = '"+s+"'");
		while(luong.next()) {
			Vector rows = new Vector();
             rows.add(luong.getString(5));
             rows.add(luong.getString(4));
             rows.add(luong.getString(3));
             rows.add(luong.getString(1));
             dt.add(rows);
		}
		}catch (Exception ex) {
			
		}	
		
		table.setModel((TableModel) new DefaultTableModel(dt, head));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(332, 144, 570, 226);
		contentPane.add(scrollPane);
		table.setEnabled(false);
		
		
	}
}
