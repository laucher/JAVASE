package cn.edu.xijing.minchong;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EditEmployeeFrame extends JDialog {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public EditEmployeeFrame() {
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 353, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel.setBounds(59, 33, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7F16\u53F7\uFF1A");
		lblNewLabel_1.setBounds(59, 58, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("\u90E8\u95E8");
		label_1.setBounds(59, 83, 54, 15);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u7231\u597D");
		lblNewLabel_2.setBounds(59, 108, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		lblEmployeeName.setBounds(130, 33, 54, 15);
		contentPane.add(lblEmployeeName);
		
		lblEmployeeId.setBounds(130, 58, 54, 15);
		contentPane.add(lblEmployeeId);
		
		
		lblDepartmentName.setBounds(130, 83, 54, 15);
		contentPane.add(lblDepartmentName);
		
		
		listHobby.setBounds(130, 107, 107, 93);
		contentPane.add(listHobby);
		
		JButton btnSave = new JButton("\u4FDD\u5B58");
		btnSave.addActionListener(new ButtonSaveActionListener(this));
		btnSave.setBounds(50, 214, 93, 23);
		contentPane.add(btnSave);
		
		JButton btnClose = new JButton("\u5173\u95ED");
		btnClose.addActionListener(new ButtonCloseActionListener(this));
		btnClose.setBounds(158, 214, 93, 23);
		contentPane.add(btnClose);
	}
	JList listHobby = new JList();
	JLabel lblDepartmentName = new JLabel("New label");
	JLabel lblEmployeeId = new JLabel("New label");
	JLabel lblEmployeeName = new JLabel("New label");

	int id;
	public EditEmployeeFrame(int id) throws ClassNotFoundException, SQLException {
		this();
		this.id=id;
		lblEmployeeId.setText(id+"");
		LoadHobby(id);
		;
		DataAccessObject dao=new DataAccessObject("localhost", "minchongEmployeeDB", "sa", "");
		ResultSet rs= dao.ExecuteQuery("Select * From EmployeeInfo Where employee_id="+id+"");
		rs.next();
		String employee_name=rs.getString("employee_name");
		String departmentName=rs.getString("departmentName");
		
		lblEmployeeName.setText(employee_name);
		lblDepartmentName.setText(departmentName);
		
	}



	private void LoadHobby(int id) {
		DataAccessObject dao;
		try {
			dao = new DataAccessObject("localhost", "minchongEmployeeDB", "sa", "");
			ResultSet rs= dao.ExecuteQuery("Select * From Hobby");
			
			ArrayList list=new ArrayList();
			while (rs.next()) {
				Hobby hobby=new Hobby();
				list.add(hobby);
				hobby.hobby_id=rs.getInt("hobby_id");
				hobby.hobby_name=rs.getString("hobby_name");
			}
			Object[] allHobby=list.toArray();
			listHobby.setListData(allHobby);
			
			rs=dao.ExecuteQuery("Select Hobby.hobby_id,Hobby.hobby_name From EmployeeHobby Left Join Hobby On EmployeeHobby.hobby_id=Hobby.hobby_id Where employee_id="+id+"");
			ArrayList list2=new ArrayList();
			while (rs.next()) {
				Hobby hobby=new Hobby();
				list2.add(hobby);
				hobby.hobby_id=rs.getInt("hobby_id");
				hobby.hobby_name=rs.getString("hobby_name");
			}
			Object[] ownHobby=list2.toArray();
			int[] indexs=new int[ownHobby.length];
			
			for (int i = 0; i < allHobby.length; i++) {
				for (int j = 0; j < ownHobby.length; j++) {
					Hobby source=(Hobby) allHobby[i];
					Hobby dest=(Hobby) ownHobby[j];
					if (source.hobby_id==dest.hobby_id) {
						indexs[j]=i;
					}
				}
			}
			
			this.listHobby.setSelectedIndices(indexs);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}



	public void actionPerformed(ActionEvent arg0) {
		this.dispose();
	}



	public void SaveactionPerformed(ActionEvent arg0) {
		//获取在ListHobby中选择的项目
		//保存到数据库的EmployeeHobby
		
		//删除
		DataAccessObject dao;
		try {
			dao = new DataAccessObject("localhost", "minchongEmployeeDB", "sa", "");
			dao.ExecuteUpdate("Delete From EmployeeHobby Where employee_id="+id+"");
			//添加
		    Object[] os=listHobby.getSelectedValues();
		    for (int i = 0; i < os.length; i++) {
				Hobby hobby=(Hobby) os[i];
				String sql="INsert Into EMployeeHobby(employee_id,hobby_id) Values("+id+","+hobby.hobby_id+")";
				dao.ExecuteUpdate(sql);
			}
		    this.dispose();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

