package studentPackage;

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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import mainApplication.mainFrame;

import javax.swing.JLabel;
import javax.swing.JTable;

public class studentListClass extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentListClass frame = new studentListClass();
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
	public studentListClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(960,720);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setTitle("Học sinh/ Danh sách lớp");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel getloplist = new JLabel("");
		getloplist.setFont(new Font("Times New Roman", Font.BOLD, 15));
		getloplist.setBounds(81, 142, 81, 26);
		contentPane.add(getloplist);
		String getl = studentMainFrame.getlop1.getText();
		getloplist.setText(getl);
		
		JButton btnNewButton = new JButton("Trở về");
		btnNewButton.setBackground(Color.GRAY);
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel = new JLabel("DANH SÁCH LỚP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(81, 40, 317, 73);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table.setBounds(50, 130, 844, 532);
		contentPane.add(table);
		
		final Vector head = new Vector();
		final Vector dt = new Vector();
		head.add("Họ và tên");
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlthcs";
			String username = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(dbURL, username, password);
		String s = studentMainFrame.getlop1.getText();
		java.sql.Statement a = conn.createStatement();
		ResultSet user = a.executeQuery("select hoten_hs from hocsinh where id_lop = '"+s+"'");
		
		while(user.next()) {
			Vector rows = new Vector();
             rows.add(user.getString(1));
             dt.add(rows);
		}
		}catch (Exception ex) {
			
		}
		table.setModel((TableModel) new DefaultTableModel(dt, head));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(50, 178, 844, 484);
		contentPane.add(scrollPane);
		table.setEnabled(false);
		
		JLabel lblNewLabel_1 = new JLabel("Lớp: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(50, 142, 81, 26);
		contentPane.add(lblNewLabel_1);
		
	}
}
