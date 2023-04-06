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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import adminPackage.adminTeacher;

public class adminTeacherInfo extends JFrame {

	private JPanel contentPane;
	//private JPanel contentPane;
	private JTextField search;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminTeacherInfo frame = new adminTeacherInfo();
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
	public adminTeacherInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Quản trị viên/ Giáo viên/ Thông tin giáo viên");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN GIÁO VIÊN");
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
		
		
		final JLabel getnh = new JLabel("2018-2019");
		getnh.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getnh.setBounds(418, 216, 198, 21);
		contentPane.add(getnh);
		
		final JLabel gethk = new JLabel("1");
		gethk.setFont(new Font("Times New Roman", Font.BOLD, 13));
		gethk.setBounds(723, 216, 198, 21);
		contentPane.add(gethk);
		
		final JLabel getidgv = new JLabel("Null");
		getidgv.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getidgv.setBounds(148, 235, 198, 16);
		contentPane.add(getidgv);
		
		final JLabel gethtgv = new JLabel("Null");
		gethtgv.setFont(new Font("Times New Roman", Font.BOLD, 13));
		gethtgv.setBounds(148, 275, 198, 16);
		contentPane.add(gethtgv);
		
		final JLabel getnamsinhgv = new JLabel("Null");
		getnamsinhgv.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getnamsinhgv.setBounds(148, 315, 198, 16);
		contentPane.add(getnamsinhgv);
		
		final JLabel getgtgv = new JLabel("Null");
		getgtgv.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getgtgv.setBounds(148, 350, 198, 16);
		contentPane.add(getgtgv);
		
		final JLabel getcvgv = new JLabel("Null");
		getcvgv.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getcvgv.setBounds(148, 395, 198, 16);
		contentPane.add(getcvgv);
		
		final JLabel getsdtgv = new JLabel("Null");
		getsdtgv.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getsdtgv.setBounds(148, 435, 198, 16);
		contentPane.add(getsdtgv);
		
		
		
		JButton btnNewButton_1 = new JButton("Tìm kiếm");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JLabel getemailhs = new JLabel("Null");
				getemailhs.setFont(new Font("Times New Roman", Font.BOLD, 13));
				getemailhs.setBounds(148, 475, 198, 16);
				contentPane.add(getemailhs);
				
				final JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setBackground(Color.LIGHT_GRAY);
				
				table.setBounds(335, 247, 513, 408);
				contentPane.add(table);
				
				final Vector head = new Vector();
				final Vector dt = new Vector();
				head.add("Tháng");
				head.add("Lương cơ bản");
				head.add("Thưởng");
				head.add("Tổng lương");
				String s1 = search.getText();
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
				java.sql.Statement a = conn.createStatement();
				ResultSet user = a.executeQuery("select giaovien.id_nv, hoten_nv, namsinh_nv, gioitinh_nv, ten_cv, sdt_nv, email_nv, thang, luongcoban, chisothuong, tongluong from giaovien, chucvu, luong where giaovien.id_nv like '%"+s1+"%' and giaovien.id_cv = chucvu.id_cv and giaovien.id_nv = luong.id_nv");
				
				while(user.next()) {
					getidgv.setText(user.getString(1));
		             gethtgv.setText(user.getString(2));
		             getnamsinhgv.setText(user.getString(3));
		             getgtgv.setText(user.getString(4));
		             getcvgv.setText(user.getString(5));
		             getsdtgv.setText(user.getString(6));
		             getemailhs.setText(user.getString(7));
		             Vector rows = new Vector();
		             rows.add(user.getString(8));
		             rows.add(user.getString(9));
		             rows.add(user.getString(10));
		             rows.add(user.getString(11));
		             dt.add(rows);
				}
				}catch (Exception ex) {
				}
				table.setModel(new DefaultTableModel(dt, head));
				JScrollPane scrollPane1 = new JScrollPane(table);
				scrollPane1.setBounds(345, 247, 513, 408);
				contentPane.add(scrollPane1);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(704, 128, 101, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Mã giáo viên");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(44, 230, 94, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên giáo viên");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(44, 270, 94, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Năm sinh");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(44, 310, 94, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Giới tinh");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_3.setBounds(44, 350, 94, 21);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Chức vụ");
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
		
		
		
		JLabel getemailgv = new JLabel("Null");
		getemailgv.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getemailgv.setBounds(148, 515, 198, 16);
		contentPane.add(getemailgv);
		
		JLabel lblNewLabel_1_9 = new JLabel("Học kỳ");
		lblNewLabel_1_9.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_9.setBounds(638, 216, 94, 21);
		contentPane.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("Nhập mã nhân viên để truy vấn thông tin giáo viên");
		lblNewLabel_1_10.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1_10.setBounds(188, 105, 323, 21);
		contentPane.add(lblNewLabel_1_10);
		
		final JLabel getemailhs = new JLabel("Null");
		getemailhs.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getemailhs.setBounds(148, 475, 198, 16);
		contentPane.add(getemailhs);
		
		final JTable table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(Color.LIGHT_GRAY);
		
		table.setBounds(335, 247, 513, 408);
		contentPane.add(table);
		
		final Vector head = new Vector();
		final Vector dt = new Vector();
		head.add("Tháng");
		head.add("Lương cơ bản");
		head.add("Thưởng");
		head.add("Tổng lương");
		String s1 = adminTeacher.sendidgv.getText();
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
		java.sql.Statement a = conn.createStatement();
		ResultSet user = a.executeQuery("select giaovien.id_nv, hoten_nv, namsinh_nv, gioitinh_nv, ten_cv, sdt_nv, email_nv, thang, luongcoban, chisothuong, tongluong from giaovien, chucvu, luong where giaovien.id_nv like '%"+s1+"%' and giaovien.id_cv = chucvu.id_cv and giaovien.id_nv = luong.id_nv");
		
		while(user.next()) {
			getidgv.setText(user.getString(1));
             gethtgv.setText(user.getString(2));
             getnamsinhgv.setText(user.getString(3));
             getgtgv.setText(user.getString(4));
             getcvgv.setText(user.getString(5));
             getsdtgv.setText(user.getString(6));
             getemailhs.setText(user.getString(7));
             Vector rows = new Vector();
             rows.add(user.getString(8));
             rows.add(user.getString(9));
             rows.add(user.getString(10));
             rows.add(user.getString(11));
             dt.add(rows);
		}
		}catch (Exception ex) {
		}
		table.setModel(new DefaultTableModel(dt, head));
		JScrollPane scrollPane1 = new JScrollPane(table);
		scrollPane1.setBounds(345, 247, 513, 408);
		contentPane.add(scrollPane1);
		
	}

}
