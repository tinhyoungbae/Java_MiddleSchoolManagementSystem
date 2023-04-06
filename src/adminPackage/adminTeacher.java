package adminPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class adminTeacher extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static JTextField getsearch;
	public static JLabel getidgv;
	public static JTextField sendidgv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminTeacher frame = new adminTeacher();
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
	public adminTeacher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Quản trị viên/Giáo viên");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản trị giáo viên");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(51, 10, 242, 99);
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
		login_button_1.setBounds(826, 10, 110, 39);
		contentPane.add(login_button_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Họ tên:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(209, 185, 48, 27);
		contentPane.add(lblNewLabel_1_1);
		
		final JLabel getht = new JLabel("Null");
		getht.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getht.setBounds(277, 185, 169, 27);
		contentPane.add(getht);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mã giáo viên:");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(456, 185, 86, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		final JLabel getidgv = new JLabel("Null");
		getidgv.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getidgv.setBounds(552, 185, 169, 27);
		contentPane.add(getidgv);
		
		getsearch = new JTextField();
		getsearch.setBounds(352, 98, 345, 39);
		contentPane.add(getsearch);
		getsearch.setColumns(10);
		
		sendidgv = new JTextField();
		sendidgv.setColumns(10);
		sendidgv.setBounds(0, 0, 0, 0);
		contentPane.add(sendidgv);
		
		
		JButton login_button_1_1 = new JButton("Tìm kiếm");
		login_button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table1 = new JTable();
				table1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table1.setBackground(Color.LIGHT_GRAY);
				
				table1.setBounds(241, 110, 205, 79);
				contentPane.add(table1);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã GV");
				head.add("Họ tên GV");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Chức vụ");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				String s = getsearch.getText();
				java.sql.Statement a = conn.createStatement();
				ResultSet staff = a.executeQuery("select id_nv, hoten_nv, namsinh_nv, gioitinh_nv, ten_cv, sdt_nv, email_nv from chucvu, giaovien where chucvu.id_cv = giaovien.id_cv and id_nv like '%"+s+"%'");
				
				while(staff.next()) {
					Vector rows = new Vector();
		             rows.add(staff.getString(1));
		             rows.add(staff.getString(2));
		             rows.add(staff.getString(3));
		             rows.add(staff.getString(4));
		             rows.add(staff.getString(5));
		             rows.add(staff.getString(6));
		             rows.add(staff.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}
				table1.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table1);
				table1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table1.getModel();
						int selectedRowIndex = table1.getSelectedRow();
						String idnv = t.getValueAt(selectedRowIndex,  1).toString();
						getht.setText(idnv);
						String tennv = t.getValueAt(selectedRowIndex,  0).toString();
						getidgv.setText(tennv);
						//String id = t.getValueAt(selectedRowIndex,  0).toString();
						//sendidgv.setText(id);
						sendidgv.setText(getidgv.getText());
					}
				});
				scrollPane.setBounds(10, 230, 926, 443);
				contentPane.add(scrollPane);
			}
		});
		login_button_1_1.setForeground(Color.BLACK);
		login_button_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button_1_1.setBackground(Color.GRAY);
		login_button_1_1.setBounds(731, 98, 110, 39);
		contentPane.add(login_button_1_1);
		
		JButton login_button_1_1_1 = new JButton("Tra cứu");
		login_button_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new adminTeacherInfo().setVisible(true);
			}
		});
		login_button_1_1_1.setForeground(Color.BLACK);
		login_button_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button_1_1_1.setBackground(Color.GRAY);
		login_button_1_1_1.setBounds(731, 185, 110, 39);
		contentPane.add(login_button_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(364, 98, 309, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton login_button_1_1_1_1 = new JButton("Xem");
		login_button_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(241, 110, 205, 79);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Mã GV");
				head.add("Họ tên GV");
				head.add("Ngày sinh");
				head.add("Giới tính");
				head.add("Chức vụ");
				head.add("Số điện thoai");
				head.add("Email");
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				java.sql.Statement a = conn.createStatement();
				ResultSet staff = a.executeQuery("select id_nv, hoten_nv, namsinh_nv, gioitinh_nv, ten_cv, sdt_nv, email_nv from chucvu, giaovien where chucvu.id_cv = giaovien.id_cv");
				
				while(staff.next()) {
					Vector rows = new Vector();
		             rows.add(staff.getString(1));
		             rows.add(staff.getString(2));
		             rows.add(staff.getString(3));
		             rows.add(staff.getString(4));
		             rows.add(staff.getString(5));
		             rows.add(staff.getString(6));
		             rows.add(staff.getString(7));
		             dt.add(rows);
				}
				}catch (Exception ex) {
					
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane = new JScrollPane(table);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						DefaultTableModel t = (DefaultTableModel)table.getModel();
						int selectedRowIndex = table.getSelectedRow();
						String idnv = t.getValueAt(selectedRowIndex,  1).toString();
						getht.setText(idnv);
						String tennv = t.getValueAt(selectedRowIndex,  0).toString();
						getidgv.setText(tennv);
						sendidgv.setText(getidgv.getText());
					}
				});
				scrollPane.setBounds(10, 230, 926, 443);
				contentPane.add(scrollPane);
			}
		});
		login_button_1_1_1_1.setForeground(Color.BLACK);
		login_button_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button_1_1_1_1.setBackground(Color.GRAY);
		login_button_1_1_1_1.setBounds(59, 185, 110, 39);
		contentPane.add(login_button_1_1_1_1);
		
		JButton login_button_1_1_1_1_1 = new JButton("Refresh");
		login_button_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new adminTeacher().setVisible(true);
			}
		});
		login_button_1_1_1_1_1.setForeground(Color.BLACK);
		login_button_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login_button_1_1_1_1_1.setBackground(Color.GRAY);
		login_button_1_1_1_1_1.setBounds(59, 136, 110, 39);
		contentPane.add(login_button_1_1_1_1_1);
		
		JTextArea txtrChnLpnXem = new JTextArea();
		txtrChnLpnXem.setForeground(Color.BLUE);
		txtrChnLpnXem.setBackground(Color.LIGHT_GRAY);
		txtrChnLpnXem.setText("----------------Chọn chức năng-----------------\n1. Xem danh sách nhân viên.\n2. Tìm kiếm nhân viên.\n3. Tra cứu thông tin nhân viên.\n4. Xóa nhân viên khỏi hệ thống.");
		txtrChnLpnXem.setBounds(372, 354, 304, 203);
		contentPane.add(txtrChnLpnXem);
		
		JButton del_btn = new JButton("Xóa");
		del_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
					String s = getidgv.getText();
					System.out.println(s);
					PreparedStatement roomup = (PreparedStatement) conn.prepareStatement("delete from giaovien where id_nv= ?");
					roomup.setString(1, s);
					roomup.executeUpdate();
					JOptionPane.showMessageDialog(adminTeacher.this, "Xóa thành công", "Xóa giáo viên", JOptionPane.PLAIN_MESSAGE);
				} catch (Exception ex) {
				}
				new adminTeacher().setVisible(true);
			}
		});
		del_btn.setForeground(Color.BLACK);
		del_btn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		del_btn.setBackground(Color.ORANGE);
		del_btn.setBounds(844, 98, 58, 126);
		contentPane.add(del_btn);
	}
}
