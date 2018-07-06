package edu.csuft.hzt.go;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


/**
 * 面板
 * @author Hasee
 *
 */
public class GamePanel extends JPanel {
	
	/**
	 * 使用鼠标适配器实现事件点击监听器
	 */
	MouseAdapter listener=new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO 自动生成的方法存根
			super.mouseClicked(e);
			
			//每次鼠标点击创建一个棋子
			Piece piece=new Piece(e.getX(), e.getY());
			piece.isBlack=pieceList.size()%2==0;
			pieceList.add(piece);
			
			//画布需要重绘
			
		}
	};
	
	Piece piece;
	
	/**
	 * 储存所有棋子的容器(列表)
	 */
	ArrayList<Piece> pieceList=new ArrayList<>();
	
	/**
	 * 棋盘
	 */
	Image bg;
	public GamePanel() {
		// TODO 自动生成的构造函数存根
		try {//加载目录中的照片
			bg=ImageIO.read(new File("Ziyuan/1522838836743.png"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		piece=new Piece(300,300);
		
		//注册一个点击事件
		addMouseListener(listener);
	}
	
	@Override
	public void paint(Graphics graphics) {
		// TODO 自动生成的方法存根
		super.paint(graphics);
		
		Graphics2D g=(Graphics2D) graphics;
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//		System.out.println(getWidth());
//		System.out.println(getHeight());
		
		
		//棋盘
		graphics.drawImage(bg, 0, 0, getWidth(),getHeight(),null);
		
		//棋子
//		graphics.fillOval(300, 300, 70, 70);
		
		piece.paint(g);
		
		for(Piece piece:pieceList) {
			
			
			
		}
		
	}
}
