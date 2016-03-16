package cn.edu.xijing.minchong;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtloginName;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u5458\u5DE5\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setBounds(139, 26, 160, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u767B\u5F55\u540D\uFF1A");
		lblNewLabel_1.setBounds(132, 111, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6  \u7801\uFF1A");
		lblNewLabel_2.setBounds(132, 158, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		txtloginName = new JTextField();
		txtloginName.setBounds(197, 108, 83, 21);
		contentPane.add(txtloginName);
		txtloginName.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(196, 155, 84, 21);
		contentPane.add(txtpassword);
		
		JButton btnOK = new JButton("\u767B\u5F55");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String loginName=txtloginName.getText();
				String password=txtpassword.getText();
				DataAccessObject dao;
				try {
					dao = new DataAccessObject("localhost", "minchongEmployeeDB", "sa", "");
					String  sql="select * From employeeInfo Where loginName='"+loginName+"' And loginpassword='"+password+"'";
					ResultSet rs=dao.ExecuteQuery(sql);
					if (rs.next()) {
						MainFrame mf=new MainFrame();
						mf.setVisible(true);
					}else{
						JOptionPane.showConfirmDialog(null, "µÇÂ¼Ãû»òÃÜÂë´íÎó£¡");
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnOK.setBounds(113, 204, 73, 23);
		contentPane.add(btnOK);
		
		JButton btnCancel = new JButton("\u53D6\u6D88");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(206, 204, 73, 23);
		contentPane.add(btnCancel);
		
		
		this.setVisible(true);
	}

}
