package edu.csuft.hzt.go;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * 棋子
 * @author Hasee
 *
 */
public class Piece {
	
	

	/**
	 * X坐标
	 */
	int x;
	
	/**
	 * Y坐标
	 */
	int y;
	
	/**
	 * 颜色
	 */
	boolean isBlack=true;
	
	/**
	 * 棋子的大小
	 */
	int size=70;
	
	public Piece(int x, int y) {
		// TODO 自动生成的构造函数存根
		super();
		this.x=x-(size/2);
		this.y=y-(size/2);
		
	}
	
	/**
	 * 绘制
	 * @param g
	 */
	public void paint(Graphics2D g) {
		// TODO 自动生成的方法存根
		
		g.setColor(isBlack ? Color.BLACK : Color.WHITE);
		g.fillOval(x, y, size, size);
		
	}
}
