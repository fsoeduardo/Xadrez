package main;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Interface extends JPanel implements MouseListener, MouseMotionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int tamanhoCasa = 64;

	public void paintComponent(Graphics g){
		for(int i=0; i<64; i+=2){
			g.setColor(new Color(255, 255, 255));
			g.fillRect((i%8+(i/8)%2)*tamanhoCasa, (i/8)*tamanhoCasa, tamanhoCasa, tamanhoCasa);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.setColor(new Color(0, 0, 0));
			g.fillRect(((i+1)%8-((i+1)/8)%2)*tamanhoCasa, ((i+1)/8)*tamanhoCasa, tamanhoCasa, tamanhoCasa);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
}
