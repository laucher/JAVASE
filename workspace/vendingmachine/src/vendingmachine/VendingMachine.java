package vendingmachine;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class VendingMachine {
	
	public static void  main(String[] args){
		JFrame frame=new JFrame("�����α�");
		Container container=frame.getContentPane();
		BorderLayout layout=new BorderLayout();
		container.setLayout(layout);
		frame.setSize(840,600 );
		JTable table=new JTable(new KCBdate());
		JScrollPane pane=new JScrollPane(table);
		container.add(pane,BorderLayout.CENTER);
		JButton button1=new JButton("��");
		JButton button2=new JButton("��");
		JButton button3=new JButton("��");
		JButton button4=new JButton("��");
		container.add(button1, BorderLayout.NORTH);
		container.add(button2, BorderLayout.SOUTH);
		container.add(button3, BorderLayout.WEST);
		container.add(button4, BorderLayout.EAST);
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame e=new JFrame("�����α���¼�");
				e.setSize(100, 300);
				//e.setDefaultCloseOperation(e.EXIT_ON_CLOSE);
				e.setVisible(true);
				
			}
			
		});
		
		//frame.pack();
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	

}
