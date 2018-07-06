package edu.csuft.hzt.go;

import javax.swing.JFrame;
/**
 *游戏窗口
 * @author hzt
 *
 */
public class GameFrame extends JFrame{
	/**
	 * 游戏面板
	 */
	GamePanel gamePanel;
	
	/**
	 * 定义游戏窗口
	 */
	public GameFrame() {
		// TODO 自动生成的构造函数存根
		setTitle("五子棋 - hzt作品");
		setSize(815, 837);
		//大小不可以调整
		setResizable(false);
		//屏幕的中间
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		gamePanel=new GamePanel();
		setContentPane(gamePanel);
		
		
		setVisible(true);
		
	}

}
