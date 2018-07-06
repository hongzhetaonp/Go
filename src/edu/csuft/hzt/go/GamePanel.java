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
 * ���
 * @author Hasee
 *
 */
public class GamePanel extends JPanel {
	
	/**
	 * ʹ�����������ʵ���¼����������
	 */
	MouseAdapter listener=new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO �Զ����ɵķ������
			super.mouseClicked(e);
			
			//ÿ�����������һ������
			Piece piece=new Piece(e.getX(), e.getY());
			piece.isBlack=pieceList.size()%2==0;
			pieceList.add(piece);
			
			//������Ҫ�ػ�
			
		}
	};
	
	Piece piece;
	
	/**
	 * �����������ӵ�����(�б�)
	 */
	ArrayList<Piece> pieceList=new ArrayList<>();
	
	/**
	 * ����
	 */
	Image bg;
	public GamePanel() {
		// TODO �Զ����ɵĹ��캯�����
		try {//����Ŀ¼�е���Ƭ
			bg=ImageIO.read(new File("Ziyuan/1522838836743.png"));
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		piece=new Piece(300,300);
		
		//ע��һ������¼�
		addMouseListener(listener);
	}
	
	@Override
	public void paint(Graphics graphics) {
		// TODO �Զ����ɵķ������
		super.paint(graphics);
		
		Graphics2D g=(Graphics2D) graphics;
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//		System.out.println(getWidth());
//		System.out.println(getHeight());
		
		
		//����
		graphics.drawImage(bg, 0, 0, getWidth(),getHeight(),null);
		
		//����
//		graphics.fillOval(300, 300, 70, 70);
		
		piece.paint(g);
		
		for(Piece piece:pieceList) {
			
			
			
		}
		
	}
}
