package adminPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class adminRoom extends JFrame {

	private JPanel contentPane;
	private JTextField get2;
	private JTextField get1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminRoom frame = new adminRoom();
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
	public adminRoom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,960, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Quản trị viên/ Phòng học");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản trị phòng học");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(69, 20, 242, 99);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Mã phòng");
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1.setBounds(615, 251, 136, 27);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Vị trí phòng");
		lblNewLabel_1_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1_2_2.setBounds(615, 345, 136, 27);
		contentPane.add(lblNewLabel_1_1_2_2);
		
		get2 = new JTextField();
		get2.setBounds(646, 382, 256, 39);
		contentPane.add(get2);
		get2.setColumns(10);
		
		get1 = new JTextField();
		get1.setBounds(646, 288, 256, 39);
		contentPane.add(get1);
		get1.setColumns(10);
		
		JButton btntLi = new JButton("Đặt lại");
		btntLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get1.setText("");
				get2.setText("");
			}
		});
		btntLi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btntLi.setBackground(Color.CYAN);
		btntLi.setBounds(721, 461, 96, 33);
		contentPane.add(btntLi);
		
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
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Danh sách phòng học");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(31, 129, 136, 27);
		contentPane.add(lblNewLabel_1_1_2);
		
		final JTable table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(Color.LIGHT_GRAY);
		
		table.setBounds(35, 183, 570, 457);
		contentPane.add(table);
		
		Vector head = new Vector();
		final Vector dt = new Vector();
		head.add("Mã phòng");
		head.add("Tên phòng");
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
		
		java.sql.Statement a = conn.createStatement();
		ResultSet room = a.executeQuery("select * from phonghoc");
		
		while(room.next()) {
			Vector rows = new Vector();
             rows.add(room.getString(1));
             rows.add(room.getString(2));
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
				String idph = t.getValueAt(selectedRowIndex,  0).toString();
				get1.setText(idph);
				String tenph = t.getValueAt(selectedRowIndex,  1).toString();
				get2.setText(tenph);
			}
		});
		scrollPane.setBounds(35, 183, 570, 457);
		contentPane.add(scrollPane);
		
		JButton btnThmPhngMi = new JButton("Thêm phòng mới");
		btnThmPhngMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);

					PreparedStatement roomadd = (PreparedStatement) conn.prepareStatement("insert into phonghoc values(?, ?)");
					roomadd.setString(1, get1.getText());
					roomadd.setString(2, get2.getText());
					roomadd.executeUpdate();
					JOptionPane.showMessageDialog(adminRoom.this, "Thêm thành công", "Thêm phòng", JOptionPane.PLAIN_MESSAGE);
					new adminRoom().setVisible(true);
				} catch (Exception ex) {
				}
			}
		});
		btnThmPhngMi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnThmPhngMi.setBackground(Color.CYAN);
		btnThmPhngMi.setBounds(403, 129, 141, 33);
		contentPane.add(btnThmPhngMi);
		
		JButton btnCpNhtPhng = new JButton("Cập nhật phòng");
		btnCpNhtPhng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);

					PreparedStatement roomup = (PreparedStatement) conn.prepareStatement("update phonghoc set ten_ph = ? where id_ph=?");
					roomup.setString(1, get2.getText());
					roomup.setString(2, get1.getText());
					roomup.executeUpdate();
					JOptionPane.showMessageDialog(adminRoom.this, "Cập nhật thành công", "Cập nhật phòng", JOptionPane.PLAIN_MESSAGE);
					new adminRoom().setVisible(true);
				} catch (Exception ex) {
				}
			}
		});
		btnCpNhtPhng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCpNhtPhng.setBackground(Color.CYAN);
		btnCpNhtPhng.setBounds(569, 129, 141, 33);
		contentPane.add(btnCpNhtPhng);
		
		JButton btnXaPhng = new JButton("Xóa phòng");
		btnXaPhng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
					String username = "root";
					String password = "";
					Connection conn = DriverManager.getConnection(dbURL, username, password);

					PreparedStatement roomup = (PreparedStatement) conn.prepareStatement("delete from phonghoc where id_ph=?");
					roomup.setString(1, get1.getText());
					roomup.executeUpdate();
					JOptionPane.showMessageDialog(adminRoom.this, "Xóa thành công", "Xóa phòng", JOptionPane.PLAIN_MESSAGE);
					new adminRoom().setVisible(true);
				} catch (Exception ex) {
				}
			}
		});
		btnXaPhng.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnXaPhng.setBackground(Color.CYAN);
		btnXaPhng.setBounds(735, 129, 141, 33);
		contentPane.add(btnXaPhng);
	}
}
