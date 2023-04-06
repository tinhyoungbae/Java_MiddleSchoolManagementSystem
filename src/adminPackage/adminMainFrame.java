package adminPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Vector;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class adminMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminMainFrame frame = new adminMainFrame();
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
	public adminMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Quản trị viên/ Trang chủ");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Khu vực quản trị");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(370, 80, 242, 99);
		contentPane.add(lblNewLabel);
		
		JButton un_b = new JButton("New button");
		un_b.setBounds(0, 0, 0, 0);
		contentPane.add(un_b);
		JButton login_button_1 = new JButton("Đăng xuất");
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(129, 251, 274, 301);
		contentPane.add(panel);
		panel.setBorder((Border) new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Thời gian");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(79, 21, 100, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(39, 88, 205, 24);
		panel.add(lblNewLabel_3);
		
		Date today = new Date();
		DateFormat df = new SimpleDateFormat("hh:mm:ss");
		String getd = df.format(today);
		lblNewLabel_3.setText(getd);
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		lblNewLabel_3.setText(Integer.toString(hour) + " giờ " + Integer.toString(minute) +" Phút");
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(39, 151, 205, 24);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setText("Ngày " + Integer.toString(day) + " Tháng " + Integer.toString(month+1) + " Năm " + Integer.toString(year));
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(39, 217, 205, 24);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("----------------------------");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(66, 41, 118, 18);
		panel.add(lblNewLabel_5);
		
		if(hour >= 5 & hour < 11) {
			lblNewLabel_4_1.setText("Chào buổi sáng!");
		}
		if(hour >= 11 & hour < 13) {
			lblNewLabel_4_1.setText("Chào buổi trưa!");
		}
		if(hour >= 13 & hour < 18) {
			lblNewLabel_4_1.setText("Chào buổi chiều!");
		}
		if(hour >= 18 & hour < 22) {
			lblNewLabel_4_1.setText("Chào buổi tối!");
		}
		if(hour >= 22 & hour < 5) {
			lblNewLabel_4_1.setText("Chúc ngủ ngon!");
		}
		
		
		JLabel getadminus = new JLabel("New label");
		getadminus.setForeground(new Color(0, 0, 255));
		getadminus.setBackground(new Color(178, 34, 34));
		getadminus.setFont(new Font("Times New Roman", Font.BOLD, 16));
		getadminus.setBounds(852, 59, 66, 24);
		contentPane.add(getadminus);
		String getus = adminLogin.us.getText();
		getadminus.setText(getus);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(523, 251, 274, 301);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Giáo viên");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(96, 111, 77, 24);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new adminTeacher().setVisible(true);
			}
		});
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Học sinh");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(96, 52, 72, 24);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new adminStudent().setVisible(true);
			}
		});
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_2 = new JLabel("Phòng học");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(83, 171, 103, 24);
		panel_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new adminRoom().setVisible(true);
			}
		});
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_3 = new JLabel("Thời khóa biểu");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(70, 240, 127, 24);
		panel_1.add(lblNewLabel_1_3);
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new adminTimetable().setVisible(true);
			}
		});
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2_1 = new JLabel("Lựa chọn");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(523, 223, 100, 24);
		contentPane.add(lblNewLabel_2_1);
	}
}
