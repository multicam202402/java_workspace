package test;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class PaintApp extends JFrame implements MouseListener, MouseMotionListener{
	
	Canvas can;
	ArrayList list = new ArrayList();
	
	public PaintApp() {
		can = new Canvas() {
			public void paint(Graphics g) {
				for(int i=0;i<list.size();i++) {
					int[] pos=(int[])list.get(i);
					
					g.fillOval(pos[0], pos[1], 4, 4);
				}
			}
		};
		
		add(can);
		
		can.addMouseListener(this);
		can.addMouseMotionListener(this);
		
		setSize(800,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new PaintApp();
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		
		int[] dot = {x, y};
		
		list.add(dot);
		
		can.repaint();
		System.out.println(dot[0]+","+dot[1]);

		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}
