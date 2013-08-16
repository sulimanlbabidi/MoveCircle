package suliman;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


class GuiTest {
	private JFrame frame;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private MyPanel panel;
	private int amount = 10 ;
	
	public  void build(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("Move Right");
		button2 = new JButton("Move left");
		button3 = new JButton("Move Up");
		button4 = new JButton("Move Down");
		panel   = new MyPanel();
		
		button1.addActionListener(new listener1());
		button2.addActionListener(new listener2());
		button3.addActionListener(new listener3());
		button4.addActionListener(new listener4());
		
		frame.getContentPane().add(BorderLayout.EAST,button1);
		frame.getContentPane().add(BorderLayout.WEST,button2);
		frame.getContentPane().add(BorderLayout.NORTH,button3);
		frame.getContentPane().add(BorderLayout.SOUTH,button4);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		
		frame.setVisible(true);
		frame.setLocation(300, 300);
		frame.setSize(350, 300);
		
	}
	
	public static void main(String[] args){
		GuiTest test = new GuiTest();
		test.build();
	}
	
	class listener1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.moveX(amount);
			frame.repaint();
			
		}
		
	}
	
	class listener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.moveX(-amount);
			frame.repaint();
			
		}
		
	}
	class listener3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.moveY(-amount);
			frame.repaint();
			
		}
		
	}
	class listener4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.moveY(amount);
			frame.repaint();
			
		}
		
	}
}
	
	