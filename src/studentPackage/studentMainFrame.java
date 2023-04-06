package studentPackage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;

import mainApplication.mainFrame;
import mainApplication.resetPassword;
import mainApplication.teacherLogin;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;

public class studentMainFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	public static JLabel getlop;
	public static JTextField getlop1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentMainFrame frame = new studentMainFrame();
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
	public studentMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(960,720);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setTitle("Học sinh/ Trang chủ");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Xin chào");
		lblNewLabel_1.setBounds(112, 34, 113, 57);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		getContentPane().add(lblNewLabel_1);
		
		JLabel getus = new JLabel("getnames");
		getus.setForeground(Color.BLUE);
		getus.setBounds(235, 34, 322, 57);
		getus.setFont(new Font("Times New Roman", Font.BOLD, 25));
		getContentPane().add(getus);
		
		JLabel lblNewLabel_2 = new JLabel("Năm học");
		lblNewLabel_2.setBounds(40, 136, 69, 29);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getContentPane().add(lblNewLabel_2);
		
		JLabel getnh = new JLabel("null");
		getnh.setBounds(119, 136, 69, 29);
		getnh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		getContentPane().add(getnh);
		
		JLabel gethk = new JLabel("null");
		gethk.setBounds(119, 175, 69, 29);
		gethk.setFont(new Font("Times New Roman", Font.BOLD, 15));
		getContentPane().add(gethk);
		
		final JLabel getlop = new JLabel("null");
		getlop.setBounds(119, 214, 69, 29);
		getlop.setFont(new Font("Times New Roman", Font.BOLD, 15));
		getContentPane().add(getlop);
		
		JLabel lblNewLabel_2_1 = new JLabel("Học kỳ");
		lblNewLabel_2_1.setBounds(40, 175, 69, 29);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Lớp");
		lblNewLabel_2_1_1.setBounds(40, 214, 69, 29);
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getContentPane().add(lblNewLabel_2_1_1);
		
		
		
		
		table_1 = new JTable();
		table_1.setBounds(332, 421, 572, 226);
		getContentPane().add(table_1);
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
		String s = mainFrame.us.getText();
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
		
		table_1.setModel((TableModel) new DefaultTableModel(dt, head));
		JScrollPane scrollPane1 = new JScrollPane(table_1);
		scrollPane1.setBounds(332, 421, 572, 226);
		contentPane.add(scrollPane1);
		table_1.setEnabled(false);

		
		JLabel lblNewLabel_2_2 = new JLabel("Thời khóa biểu");
		lblNewLabel_2_2.setBounds(332, 115, 113, 29);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Bảng điểm");
		lblNewLabel_2_2_1.setBounds(332, 388, 113, 29);
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		getContentPane().add(lblNewLabel_2_2_1);
		
		JButton btnNewButton = new JButton("Đăng xuất");
		btnNewButton.setBounds(828, 10, 108, 41);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 409, 185, 238);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("Xem danh sách lớp");
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new studentListClass().setVisible(true);
			}
		});
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(40, 45, 120, 29);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Cập nhật thông tin");
		lblNewLabel_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new studentUpdate().setVisible(true);
			}
		});
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_4.setBounds(40, 106, 113, 29);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Đổi mật khẩu");
		lblNewLabel_2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new resetPassword().setVisible(true);
			}
		});
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_5.setBounds(52, 167, 113, 29);
		panel.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Lựa chọn");
		lblNewLabel_2_1_1_1.setBounds(96, 388, 113, 29);
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		getContentPane().add(lblNewLabel_2_1_1_1);
		
		
		JButton un = new JButton("");
		un.setBounds(0, 0, 0, 0);
		un.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getContentPane().add(un);
		
		getlop1 = new JTextField();
		getlop1.setBounds(0, 0, 0, 0);
		getContentPane().add(getlop1);
		getlop1.setColumns(10);
		//-------------------------------------------------------------------------
		


		
		//-------------------------------------------------------------------------------
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel);
		String s = mainFrame.us.getText();
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
		java.sql.Statement a1 = conn.createStatement();
		ResultSet rs = a1.executeQuery("select hoten_hs, id_lop from hocsinh where id_hs = '"+s+"'");
		while(rs.next()) {
			getus.setText(rs.getString(1));
			getlop.setText(rs.getString(2));
			getlop1.setText(rs.getString(2));
		}
		}catch (Exception ex) {
			
		}
		
		//--------------------------
		//scrollPane3.setBounds(332, 144, 570, 226);
		
		table = new JTable();
		table.setBounds(332, 144, 570, 226);
		getContentPane().add(table);
		final Vector head1 = new Vector();
		final Vector dt1 = new Vector();
		head1.add("Thứ");
		head1.add("Môn");
		head1.add("Tiết");
		head1.add("Giáo viên");
		head1.add("Phòng");
		head1.add("Vị trí");
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
		String s1 = getlop1.getText();
		java.sql.Statement a1 = conn.createStatement();
		ResultSet user1 = a1.executeQuery("select thu, ten_mh, tiet, hoten_nv, phonghoc.id_ph, ten_ph from thoikhoabieu, giaovien, monhoc, phonghoc where id_lop = '"+s1+"' and thoikhoabieu.id_nv = giaovien.id_nv and thoikhoabieu.id_mh = monhoc.id_mh and thoikhoabieu.id_ph = phonghoc.id_ph group by thu");
		
		while(user1.next()) {
			Vector rows = new Vector();
             rows.add(user1.getString(1));
             rows.add(user1.getString(2));
             rows.add(user1.getString(3));
             rows.add(user1.getString(4));
             rows.add(user1.getString(5));
             rows.add(user1.getString(6));
             dt1.add(rows);
             //getnh.setText(user1.getString(9));
             //gethk.setText(user1.getString(10));
		}
		}catch (Exception ex) {
			
		}
		
		table.setModel((TableModel) new DefaultTableModel(dt1, head1));
		JScrollPane scrollPane11 = new JScrollPane(table);
		scrollPane11.setBounds(332, 144, 570, 226);
		contentPane.add(scrollPane11);
		table.setEnabled(false);
	}
}
