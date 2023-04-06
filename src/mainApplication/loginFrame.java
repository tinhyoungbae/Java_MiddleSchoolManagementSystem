package mainApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class loginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField get_user;
	private JTextField get_pw;
	private JTextField get_rpw;
	private JTextField get_sdt;
	private JTextField get_email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginFrame frame = new loginFrame();
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
	public loginFrame() {
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Đăng ký");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton un_b = new JButton("New button");
		un_b.setBounds(0, 0, 0, 0);
		contentPane.add(un_b);
		
		JTextArea txtrA = new JTextArea();
		txtrA.setBackground(UIManager.getColor("CheckBox.light"));
		txtrA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtrA.setText("Hướng dẫn đăng ký\n1. Tên đăng nhập của bản phải là mã số học sinh/ mã số cán bộ đã được cấp trước đó(nếu không được cấp sẽ "
				+ "không được phép đăng ký)\n2. Độ dài mật khẩu phải >= 8 ký tự, mật khẩu phải chứa ít nhất: 1 ký tự in hoa, 1 ký tự chữ số(0->9)."
				+ "\n3. Sau khi đăng ký bạn có thể thêm thông trong phần thông tin cá nhân.\n4. Bạn có thể thay đổi mật khẩu hoặc yêu cầu cấp lại mật "
				+ "khẩu khi bạn đã quên chúng(Cung cấp mshs/ mscb + số điện thoại + email)."
				+ "\n5. Khi đã đăng ký thành công "
				+ "bạn không được phép xóa tài khoản, tài khoản của bạn sẽ được xóa khỏi hệ thông khi bạn đã ra trường hoặc nếu bạn học quá ngu "
				+ "thì hệ thống sẽ tự xóa =))))))))))), (Chuyển công tác hoặc nghỉ việc đối với giáo viên).");
		txtrA.setBounds(36, 245, 405, 235);
		txtrA.setWrapStyleWord(true);
		txtrA.setLineWrap(true);
		txtrA.setEditable(false); //Ngăn chặn edit văn bản
		txtrA.setWrapStyleWord(true);
		contentPane.add(txtrA);
		
		get_user = new JTextField();
		get_user.setHorizontalAlignment(SwingConstants.CENTER);
		get_user.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get_user.setBounds(514, 133, 304, 35);
		contentPane.add(get_user);
		get_user.setColumns(10);
		
		get_pw = new JTextField();
		get_pw.setHorizontalAlignment(SwingConstants.CENTER);
		get_pw.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get_pw.setColumns(10);
		get_pw.setBounds(514, 211, 304, 35);
		contentPane.add(get_pw);
		
		get_rpw = new JTextField();
		get_rpw.setHorizontalAlignment(SwingConstants.CENTER);
		get_rpw.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get_rpw.setColumns(10);
		get_rpw.setBounds(514, 288, 304, 35);
		contentPane.add(get_rpw);
		
		get_sdt = new JTextField();
		get_sdt.setHorizontalAlignment(SwingConstants.CENTER);
		get_sdt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get_sdt.setColumns(10);
		get_sdt.setBounds(514, 368, 304, 35);
		contentPane.add(get_sdt);
		
		get_email = new JTextField();
		get_email.setHorizontalAlignment(SwingConstants.CENTER);
		get_email.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		get_email.setColumns(10);
		get_email.setBounds(514, 451, 304, 35);
		contentPane.add(get_email);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(514, 110, 95, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblMtKhu.setBounds(514, 192, 95, 13);
		contentPane.add(lblMtKhu);
		
		JLabel lblNhpLiMt = new JLabel("Nhập lại mật khẩu");
		lblNhpLiMt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNhpLiMt.setBounds(514, 265, 95, 13);
		contentPane.add(lblNhpLiMt);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại");
		lblSinThoi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSinThoi.setBounds(514, 345, 95, 13);
		contentPane.add(lblSinThoi);
		
		JLabel lblThinT = new JLabel("Thư điện tử");
		lblThinT.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblThinT.setBounds(514, 428, 95, 13);
		contentPane.add(lblThinT);
		
		JButton register_btn = new JButton("Đăng ký");
		register_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);
					String user = get_user.getText();
					String sdt = get_sdt.getText();
					String email = get_email.getText();
					
					java.sql.Statement a = conn.createStatement();
					ResultSet useraccount = a.executeQuery("select id_hs, sdt_hs, email_hs from hocsinh");
					
					while(useraccount.next()) {
					if(user.contains(useraccount.getString("id_hs")) && sdt.contains(useraccount.getString("sdt_hs")) && email.contains(useraccount.getString("email_hs"))) {
						try {
							String dbURL1 = "jdbc:mysql://localhost:3306/qlthcs";
							String username1 = "root";
							String password1 = "";
							Connection conn1 = DriverManager.getConnection(dbURL1, username1, password1);
							PreparedStatement up_gv = (PreparedStatement) conn1.prepareStatement("insert into studentaccount values (?, ?, ?)");
							up_gv.setString(1, get_user.getText());
							up_gv.setString(2, get_user.getText());
							up_gv.setString(3, get_pw.getText());
							up_gv.executeUpdate();
							JOptionPane.showMessageDialog(loginFrame.this, "Đăng ký thành công");
						}catch (Exception ex) {
							JOptionPane.showMessageDialog(loginFrame.this, "Đăng ký thất bại");
						
					}
					}
					}
					}catch (Exception ex) {
					}
			}
		});
		register_btn.setBackground(Color.RED);
		register_btn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		register_btn.setBounds(549, 524, 102, 35);
		contentPane.add(register_btn);
		
		JButton reset_btn = new JButton("Đặt lại");
		reset_btn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		reset_btn.setBackground(Color.RED);
		reset_btn.setBounds(687, 524, 102, 35);
		contentPane.add(reset_btn);
		
		JButton back_btn = new JButton("Trở về");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mainFrame().setVisible(true);
				dispose();
			}
		});
		back_btn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		back_btn.setBackground(Color.RED);
		back_btn.setBounds(834, 10, 102, 35);
		contentPane.add(back_btn);
		
		JLabel lblNewLabel_1 = new JLabel("Đăng ký tài khoản");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(115, 59, 272, 74);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\user.png"));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(472, 135, 32, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\pw.png"));
		lblNewLabel_2_1.setBounds(472, 211, 32, 32);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\repeat_icon_174975.png"));
		lblNewLabel_2_2.setBounds(472, 288, 32, 32);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\phone-call-auricular-symbol-in-black_icon-icons.com_56483.png"));
		lblNewLabel_2_3.setBounds(472, 368, 32, 32);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("New label");
		lblNewLabel_2_4.setIcon(new ImageIcon("D:\\Document\\Eclipse\\qlthcs\\src\\iconFolder\\mail_email_message_electronic_online_web_icon-icons.com_59986.png"));
		lblNewLabel_2_4.setBounds(472, 451, 32, 32);
		contentPane.add(lblNewLabel_2_4);
	}
}
