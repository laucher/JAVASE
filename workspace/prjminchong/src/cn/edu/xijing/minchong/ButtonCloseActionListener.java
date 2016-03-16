package cn.edu.xijing.minchong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCloseActionListener implements ActionListener {
	EditEmployeeFrame eef;
	public ButtonCloseActionListener(EditEmployeeFrame eef){
		this.eef=eef;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.eef.actionPerformed(arg0);
	}

	

}
