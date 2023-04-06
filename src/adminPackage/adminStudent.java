package adminPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class adminStudent extends JFrame {

	private JPanel contentPane;
	//private JTextField search;
	public static JTextField search;
	public static JTextField getid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminStudent frame = new adminStudent();
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
	public adminStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Quản trị viên/ Học sinh");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN TRỊ HỌC SINH");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(68, 10, 321, 99);
		contentPane.add(lblNewLabel);
		
		getid = new JTextField();
		getid.setBounds(0,0,0,0);
		contentPane.add(getid);
		getid.setColumns(10);
		
		final JLabel getlop = new JLabel("Null");
		getlop.setFont(new Font("Times New Roman", Font.BOLD, 15));
		getlop.setBounds(493, 185, 169, 27);
		contentPane.add(getlop);
		
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
		login_button_1.setBounds(826, 10, 110, 39);
		contentPane.add(login_button_1);
		
		JLabel lblNewLabel_1 = new JLabel("Danh sách lớp");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 103, 95, 27);
		contentPane.add(lblNewLabel_1);

		
		JButton btnNewButton = new JButton("6a1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				//table.setModel(new DefaultTableModel(dt, head));

				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '6a1'");
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
		             
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane1.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane1);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '6a2'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane2 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane2.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane2);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				//table.setModel(new DefaultTableModel(dt, head));
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '6a3'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane2 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane2.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane2);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '7a1'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane1.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane1);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '7a2'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane1.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane1);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '7a3'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane1.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane1);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '8a1'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane1.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane1);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '8a2'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane1.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane1);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '8a3'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane1.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane1);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '9a1'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}
				//table.fire
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane1.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane1);
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
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_lop = '9a2'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String lop = t.getValueAt(selectedRowIndex,  2).toString();
						getlop.setText(lop);
						String id = t.getValueAt(selectedRowIndex,  0).toString();
						getid.setText(id);
					}
				});
				scrollPane1.setBounds(152, 247, 773, 408);
				contentPane.add(scrollPane1);
			}
		});
		btna_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btna_9.setBackground(Color.CYAN);
		btna_9.setBounds(66, 622, 60, 33);
		contentPane.add(btna_9);
		
		search = new JTextField();
		search.setBackground(SystemColor.info);
		search.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		search.setHorizontalAlignment(SwingConstants.CENTER);
		search.setBounds(352, 98, 345, 39);
		contentPane.add(search);
		search.setColumns(10);
		
		JButton login_button_1_1 = new JButton("Tìm kiếm");
		login_button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(152, 247, 773, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã HS");
				head.add("Họ tên HS");
				head.add("Lớp");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				String s = search.getText();
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select id_hs, hoten_hs, id_lop, namsinh_hs, gioitinh_hs, sdt_hs, email_hs from hocsinh where id_hs like '%"+s+"%'");
				
				while(user.next()) {
					Vector rows = new Vector();
		             rows.add(user.getString(1));
		             rows.add(user.getString(2));
		             rows.add(user.getString(3));
		             rows.add(user.getString(4));
		             rows.add(user.getString(5));
		             rows.add(user.getString(6));
		             rows.add(user.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}	
				table.setModel(new DefaultTableModel(dt, head));
			}
		});
		login_button_1_1.setForeground(Color.BLACK);
		login_button_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button_1_1.setBackground(Color.RED);
		login_button_1_1.setBounds(731, 98, 110, 39);
		contentPane.add(login_button_1_1);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mã học sinh:");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(397, 185, 86, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton login_button_1_1_1 = new JButton("Tra cứu");
		login_button_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new adminStudentInfo().setVisible(true);
			}
		});
		login_button_1_1_1.setForeground(Color.BLACK);
		login_button_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button_1_1_1.setBackground(Color.RED);
		login_button_1_1_1.setBounds(731, 185, 110, 39);
		contentPane.add(login_button_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new adminStudent().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBounds(209, 222, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton login_button_1_1_1_1 = new JButton("Xóa");
		login_button_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				String s = getid.getText();
				PreparedStatement del_hs = (PreparedStatement) conn.prepareStatement("delete from hocsinh where id_hs=?");
				del_hs.setString(1, s);
				del_hs.executeUpdate();
				JOptionPane.showMessageDialog(adminStudent.this, "Xóa thành công", "Xóa học sinh", JOptionPane.PLAIN_MESSAGE);
			}catch (Exception ex) {
				
			}
				new adminStudent().setVisible(true);
			}
		});
		login_button_1_1_1_1.setForeground(Color.BLACK);
		login_button_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button_1_1_1_1.setBackground(Color.GREEN);
		login_button_1_1_1_1.setBounds(851, 97, 60, 127);
		contentPane.add(login_button_1_1_1_1);
		
		JTextArea txtrChnLpnXem = new JTextArea();
		txtrChnLpnXem.setForeground(Color.BLUE);
		txtrChnLpnXem.setBackground(Color.LIGHT_GRAY);
		txtrChnLpnXem.setText("----------------Chọn lớp-----------------\n1. Xem danh sách lớp.\n2. Tìm kiếm học sinh.\n3. Tra cứu thông tin học sinh.\n4. Xóa học sinh khỏi hệ thống.");
		txtrChnLpnXem.setBounds(372, 354, 304, 203);
		contentPane.add(txtrChnLpnXem);
	
		
	}
}
