package cn.edu.xijing.minchong;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

public class EmployeeInfoTableModel extends AbstractTableModel {
	EmployeeInfo[] eis = null;

	public EmployeeInfoTableModel() throws ClassNotFoundException, SQLException {
		// 确定数组的大小
		// 创建数据访问对象
		DataAccessObject dao = new DataAccessObject("localhost",
				"minchongEmployeeDB", "sa", "");
		// 使用数据访问对象，从数据库中查询某个表中的记录数量
		ResultSet rs = dao.ExecuteQuery("Select count(*) From EmployeeInfo");
		// 让指针指向下一行
		rs.next();
		// 获取这个一行一列的值
		int count = rs.getInt(1);
		// 作为数组的大小
		eis = new EmployeeInfo[count];
		// 填充数组
		rs = dao.ExecuteQuery("Select * From EmployeeInfo");
		for (int i = 0; i < eis.length; i++) {
			rs.next();
			eis[i] = new EmployeeInfo();
			eis[i].employee_id = rs.getInt("employee_id");
			eis[i].Employee_name = rs.getString("Employee_name");
			eis[i].loginName = rs.getString("loginName");
			eis[i].loginPassword = rs.getString("loginPassword");
			eis[i].departmentName = rs.getString("departmentName");
			eis[i].hobby = GetHobby( eis[i].employee_id) ;

		}
	}

	private String GetHobby(int employee_id) {
		DataAccessObject dao;
		try {
			dao = new DataAccessObject("localhost", "minchongEmployeeDB", "sa", "");
			ResultSet rs=dao.ExecuteQuery("Select Hobby.hobby_id,Hobby.hobby_name From EmployeeHobby Left Join Hobby On EmployeeHobby.hobby_id=Hobby.hobby_id Where employee_id="+employee_id+"");
			String result="";
			while (rs.next()) {
				result+=rs.getString("hobby_name")+",";
			}
			if (result.length()==0) {
				return "";
			}
			return result.substring(0, result.length()-1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
		
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return eis.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return eis[rowIndex].employee_id;
		case 1:
			return eis[rowIndex].Employee_name;
		case 2:
			return eis[rowIndex].departmentName;
		case 3:
			return  eis[rowIndex].hobby;
		default:
			return null;
		}
	}

	public String getColumnName(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return "编号";
		case 1:
			return "姓名";
		case 2:
			return "部门";
		case 3:
			return "爱好";
		default:
			return "";
		}
	}
}


