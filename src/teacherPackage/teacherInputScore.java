package teacherPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mainApplication.teacherLogin;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class teacherInputScore extends JFrame {

	private JPanel contentPane;
	private JTextField getmieng;
	private JTextField getmamon;
	private JTextField getmahs;
	private JTextField get151;
	private JTextField get152;
	private JTextField get153;
	private JTextField get451;
	private JTextField get452;
	private JTextField getthi;
	private JTextField getnh;
	private JTextField gethk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacherInputScore frame = new teacherInputScore();
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
	public teacherInputScore() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Giáo viên/ Nhập điểm");
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Trở về");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(836, 10, 100, 38);
		getContentPane().add(btnNewButton);
		
		JButton un = new JButton("");
		un.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		un.setBounds(0, 0, 0, 0);
		getContentPane().add(un);
		
		JLabel lblNewLabel = new JLabel("NHẬP ĐIỂM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(107, 51, 536, 53);
		getContentPane().add(lblNewLabel);
		
		JLabel lblimMing = new JLabel("Điểm miệng");
		lblimMing.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblimMing.setBounds(59, 348, 117, 30);
		getContentPane().add(lblimMing);
		
		JLabel lblNewLabel_1_1 = new JLabel("15 phút");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(59, 368, 117, 30);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("45 phút");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(59, 453, 117, 30);
		getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1 = new JLabel("Thi");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(59, 536, 117, 30);
		getContentPane().add(lblNewLabel_1);
		
		getmieng = new JTextField();
		getmieng.setHorizontalAlignment(SwingConstants.CENTER);
		getmieng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getmieng.setBounds(190, 348, 117, 38);
		getContentPane().add(getmieng);
		getmieng.setColumns(10);
		
		getmamon = new JTextField();
		getmamon.setHorizontalAlignment(SwingConstants.CENTER);
		getmamon.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getmamon.setColumns(10);
		getmamon.setBounds(97, 163, 271, 38);
		getContentPane().add(getmamon);
		
		getmahs = new JTextField();
		getmahs.setHorizontalAlignment(SwingConstants.CENTER);
		getmahs.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getmahs.setColumns(10);
		getmahs.setBounds(424, 163, 271, 38);
		getContentPane().add(getmahs);
		
		JButton btnCpNht = new JButton("Cập nhật");
		btnCpNht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
					PreparedStatement thietbi = (PreparedStatement) conn.prepareStatement("insert into bangdiem values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
					thietbi.setString(1, getmamon.getText());
					thietbi.setString(2, getmahs.getText());
					thietbi.setString(3, teacherLogin.teacher_us.getText());
					thietbi.setString(4, gethk.getText());
					thietbi.setString(5, getnh.getText());
					thietbi.setString(6, getmieng.getText());
					thietbi.setString(7, get151.getText());
					thietbi.setString(8, get152.getText());
					thietbi.setString(9, get153.getText());
					thietbi.setString(10, get451.getText());
					thietbi.setString(11, get452.getText());
					thietbi.setString(12, getthi.getText());
					thietbi.executeUpdate();
					JOptionPane.showMessageDialog(teacherInputScore.this, "Cập nhật điểm thành công");
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(teacherInputScore.this, "Cập nhật điểm thất bại");
				}
			}
		});
		btnCpNht.setBackground(Color.RED);
		btnCpNht.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCpNht.setBounds(477, 598, 100, 38);
		getContentPane().add(btnCpNht);
		
		get151 = new JTextField();
		get151.setHorizontalAlignment(SwingConstants.CENTER);
		get151.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get151.setColumns(10);
		get151.setBounds(406, 348, 117, 38);
		getContentPane().add(get151);
		
		get152 = new JTextField();
		get152.setHorizontalAlignment(SwingConstants.CENTER);
		get152.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get152.setColumns(10);
		get152.setBounds(598, 348, 117, 38);
		getContentPane().add(get152);
		
		get153 = new JTextField();
		get153.setHorizontalAlignment(SwingConstants.CENTER);
		get153.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get153.setColumns(10);
		get153.setBounds(789, 348, 117, 38);
		getContentPane().add(get153);
		
		get451 = new JTextField();
		get451.setHorizontalAlignment(SwingConstants.CENTER);
		get451.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get451.setColumns(10);
		get451.setBounds(234, 449, 182, 38);
		getContentPane().add(get451);
		
		get452 = new JTextField();
		get452.setHorizontalAlignment(SwingConstants.CENTER);
		get452.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get452.setColumns(10);
		get452.setBounds(593, 449, 182, 38);
		getContentPane().add(get452);
		
		getthi = new JTextField();
		getthi.setHorizontalAlignment(SwingConstants.CENTER);
		getthi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getthi.setColumns(10);
		getthi.setBounds(373, 532, 270, 38);
		getContentPane().add(getthi);
		
		JLabel lblMMn = new JLabel("Mã môn");
		lblMMn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMMn.setBounds(97, 138, 117, 30);
		getContentPane().add(lblMMn);
		
		JLabel lblMHcSinh = new JLabel("Mã học sinh");
		lblMHcSinh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMHcSinh.setBounds(425, 138, 117, 30);
		getContentPane().add(lblMHcSinh);
		
		JButton btntLi = new JButton("Đặt lại");
		btntLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getmamon.setText("");
				getmahs.setText("");
				getmieng.setText("");
				get151.setText("");
				get152.setText("");
				get153.setText("");
				get451.setText("");
				get452.setText("");
				getthi.setText("");
			}
		});
		btntLi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btntLi.setBackground(Color.RED);
		btntLi.setBounds(334, 598, 100, 38);
		getContentPane().add(btntLi);
		
		JLabel lblNmHc = new JLabel("Năm học");
		lblNmHc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNmHc.setBounds(148, 245, 117, 30);
		getContentPane().add(lblNmHc);
		
		JLabel lblHcK = new JLabel("Học kì");
		lblHcK.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblHcK.setBounds(425, 245, 117, 30);
		getContentPane().add(lblHcK);
		
		getnh = new JTextField();
		getnh.setHorizontalAlignment(SwingConstants.CENTER);
		getnh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		getnh.setColumns(10);
		getnh.setBounds(222, 237, 117, 38);
		getContentPane().add(getnh);
		
		gethk = new JTextField();
		gethk.setHorizontalAlignment(SwingConstants.CENTER);
		gethk.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gethk.setColumns(10);
		gethk.setBounds(485, 237, 117, 38);
		getContentPane().add(gethk);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JButton btnTraCu = new JButton("Tra cứu");
		btnTraCu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
					String s = teacherLogin.teacher_us.getText();
					String s2 = getmamon.getText();
					String s1 = getmahs.getText();

					java.sql.Statement a = conn.createStatement();
					ResultSet score = a.executeQuery("select * from bangdiem where id_mh='"+s2+"' and id_hs='"+s1+"' and id_nv='"+s+"';");
					while(score.next()) {
					gethk.setText(score.getString(4));
					getnh.setText(score.getString(5));
					getmieng.setText(score.getString(6));
					get151.setText(score.getString(7));
					get152.setText(score.getString(8));
					get153.setText(score.getString(9));
					get451.setText(score.getString(10));
					get452.setText(score.getString(11));
					getthi.setText(score.getString(12));
					//JOptionPane.showMessageDialog(teacherInputScore.this, "Cập nhật thông tin thành công");
					}
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(teacherInputScore.this, "Cập nhật thông tin thất bại");
				}
			}
		});
		btnTraCu.setBackground(Color.ORANGE);
		btnTraCu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnTraCu.setBounds(756, 163, 100, 38);
		getContentPane().add(btnTraCu);
		
		
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
		
		if(month >= 8 || month <= 12) gethk.setText("hk1");
		if(month >= 1 || month <= 5) gethk.setText("hk2");
		if(month > 5 || month < 8) gethk.setText("hk3");
		
	}
}
