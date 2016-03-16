package vendingmachine;

import javax.swing.JFrame;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class KCBdate implements TableModel {
	
	String[] title={
		"周一","周二","周三","周四","周五","周六","周日"	
	};
	
	String[][] date =new String[8][7];
	
	KCBdate(){
		for(int i=0;i<date.length;i++){
			for(int j=0;j<date[i].length;j++){
				date[i][j]="";
			}
		}
	}
	@Override
	public void addTableModelListener(TableModelListener arg0) {

		

	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public String getColumnName(int arg0) {
		
		
		return title[arg0];
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return date[arg0][arg1];
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		date[arg1][arg2]=(String)arg0;

	}

}
