package edu.csuft.hzt.go;
/**
 * 游戏的模型(逻辑)
 * @author Hasee
 *
 */
public class GoModel {
	
	/**
	 * 棋盘数据
	 */
	int[][] data=new int[9][9];
	
	public void show() {
		for(int[] row: data) {
			for(int e:row) {
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
