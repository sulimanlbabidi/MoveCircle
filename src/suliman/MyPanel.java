package suliman;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
	private int x = 0 ;
	private int y = 0 ;
	private static int count = 0 ;
	private static Color color ;
	
	
	public void paintComponent(Graphics g){
		g.setColor(randColorGen());
		g.fillOval(x,y, 100, 100);
	}
	
	public static Color randColorGen(){
		if (count == 0){
		int red , green , blue ;
		red = (int) (Math.random() * 255);
		green = (int) (Math.random()*255);
		blue = (int) (Math.random()*255);
		System.out.println(red);
		color = new Color(red,green,blue);
		count++;
		return color;
		}
		else 
			return color;
	}
	
	public void moveX(int amount){
		x += amount ;		
	}
	public void moveY(int amount){
		y += amount ;		
	}
}
