package cn.edu.xijing.minchong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSaveActionListener implements ActionListener {
	EditEmployeeFrame eef;
	public ButtonSaveActionListener(EditEmployeeFrame eef){
		this.eef=eef;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.eef.SaveactionPerformed(arg0);
	}

	

}
