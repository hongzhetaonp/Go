package edu.csuft.hzt.go;

import javax.swing.JFrame;
/**
 *��Ϸ����
 * @author hzt
 *
 */
public class GameFrame extends JFrame{
	/**
	 * ��Ϸ���
	 */
	GamePanel gamePanel;
	
	/**
	 * ������Ϸ����
	 */
	public GameFrame() {
		// TODO �Զ����ɵĹ��캯�����
		setTitle("������ - hzt��Ʒ");
		setSize(815, 837);
		//��С�����Ե���
		setResizable(false);
		//��Ļ���м�
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		gamePanel=new GamePanel();
		setContentPane(gamePanel);
		
		
		setVisible(true);
		
	}

}
