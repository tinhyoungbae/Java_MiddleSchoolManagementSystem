package adminPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTree;
import javax.swing.JToolBar;

public class adminTimetable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminTimetable frame = new adminTimetable();
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
	public adminTimetable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Quản trị viên/ Thời khóa biểu");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản trị thời khóa biểu");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(75, 10, 276, 99);
		contentPane.add(lblNewLabel);
		
		JButton un_b = new JButton("New button");
		un_b.setBounds(0, 0, 0, 0);
		contentPane.add(un_b);
		JButton login_button_1 = new JButton("Trở về");
		login_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		login_button_1.setForeground(Color.BLACK);
		login_button_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button_1.setBackground(Color.GRAY);
		login_button_1.setBounds(826, 21, 110, 39);
		contentPane.add(login_button_1);
		
		JLabel lblNewLabel_1 = new JLabel("Danh sách lớp");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 105, 95, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("6a1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '6a1' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(66, 142, 60, 33);
		contentPane.add(btnNewButton);
		
		JButton btna = new JButton("6a2");
		btna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '6a2' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna.setBackground(Color.CYAN);
		btna.setBounds(66, 185, 60, 33);
		contentPane.add(btna);
		
		JButton btna_1 = new JButton("6a3");
		btna_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '6a3' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_1.setBackground(Color.CYAN);
		btna_1.setBounds(66, 229, 60, 33);
		contentPane.add(btna_1);
		
		JButton btna_2 = new JButton("7a1");
		btna_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '7a1' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_2.setBackground(Color.CYAN);
		btna_2.setBounds(66, 291, 60, 33);
		contentPane.add(btna_2);
		
		JButton btna_3 = new JButton("7a2");
		btna_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '7a2' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_3.setBackground(Color.CYAN);
		btna_3.setBounds(66, 334, 60, 33);
		contentPane.add(btna_3);
		
		JButton btna_4 = new JButton("7a3");
		btna_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '7a3' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_4.setBackground(Color.CYAN);
		btna_4.setBounds(66, 377, 60, 33);
		contentPane.add(btna_4);
		
		JButton btna_5 = new JButton("8a1");
		btna_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '8a1' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_5.setBackground(Color.CYAN);
		btna_5.setBounds(66, 438, 60, 33);
		contentPane.add(btna_5);
		
		JButton btna_6 = new JButton("8a2");
		btna_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '8a2' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_6.setBackground(Color.CYAN);
		btna_6.setBounds(66, 481, 60, 33);
		contentPane.add(btna_6);
		
		JButton btna_7 = new JButton("8a3");
		btna_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '8a3' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_7.setBackground(Color.CYAN);
		btna_7.setBounds(66, 524, 60, 33);
		contentPane.add(btna_7);
		
		JButton btna_8 = new JButton("9a1");
		btna_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '9a1' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_8.setBackground(Color.CYAN);
		btna_8.setBounds(66, 579, 60, 33);
		contentPane.add(btna_8);
		
		JButton btna_9 = new JButton("9a2");
		btna_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Thứ");
				head.add("Môn");
				head.add("Tiết");
				head.add("Giáo viên");
				head.add("Phòng");
				head.add("Vị trí");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				//String s1 = getlop1.getText();
				java.sql.Statement a1 = conn.createStatement();
				ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '9a2' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
				
				while(user1.next()) {
					Vector rows = new Vector();
		             rows.add(user1.getString(1));
		             rows.add(user1.getString(2));
		             rows.add(user1.getString(3));
		             rows.add(user1.getString(4));
		             rows.add(user1.getString(5));
		             rows.add(user1.getString(6));
		             dt.add(rows);
		             //getnh.setText(user1.getString(9));
		             //gethk.setText(user1.getString(10));
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(209, 159, 657, 477);
				contentPane.add(scrollPane);
			}
		});
		btna_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_9.setBackground(Color.CYAN);
		btna_9.setBounds(66, 622, 60, 33);
		contentPane.add(btna_9);
		
		final JTable table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(Color.LIGHT_GRAY);
		
		table.setBounds(241, 110, 205, 79);
		contentPane.add(table);
		
		Vector head = new Vector();
		final Vector dt = new Vector();
		head.add("Thứ");
		head.add("Môn");
		head.add("Tiết");
		head.add("Giáo viên");
		head.add("Phòng");
		head.add("Vị trí");
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
		//String s1 = getlop1.getText();
		java.sql.Statement a1 = conn.createStatement();
		ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '6a1' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph order by thu");
		
		while(user1.next()) {
			Vector rows = new Vector();
             rows.add(user1.getString(1));
             rows.add(user1.getString(2));
             rows.add(user1.getString(3));
             rows.add(user1.getString(4));
             rows.add(user1.getString(5));
             rows.add(user1.getString(6));
             dt.add(rows);
             //getnh.setText(user1.getString(9));
             //gethk.setText(user1.getString(10));
		}
		}catch (Exception ex) {
			
		}
		table.setModel(new DefaultTableModel(dt, head));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(209, 159, 657, 477);
		contentPane.add(scrollPane);
	}
}
