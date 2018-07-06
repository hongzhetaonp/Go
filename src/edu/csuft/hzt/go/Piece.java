package edu.csuft.hzt.go;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * ����
 * @author Hasee
 *
 */
public class Piece {
	
	

	/**
	 * X����
	 */
	int x;
	
	/**
	 * Y����
	 */
	int y;
	
	/**
	 * ��ɫ
	 */
	boolean isBlack=true;
	
	/**
	 * ���ӵĴ�С
	 */
	int size=70;
	
	public Piece(int x, int y) {
		// TODO �Զ����ɵĹ��캯�����
		super();
		this.x=x-(size/2);
		this.y=y-(size/2);
		
	}
	
	/**
	 * ����
	 * @param g
	 */
	public void paint(Graphics2D g) {
		// TODO �Զ����ɵķ������
		
		g.setColor(isBlack ? Color.BLACK : Color.WHITE);
		g.fillOval(x, y, size, size);
		
	}
}
