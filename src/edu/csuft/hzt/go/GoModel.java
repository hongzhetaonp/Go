package edu.csuft.hzt.go;
/**
 * ��Ϸ��ģ��(�߼�)
 * @author Hasee
 *
 */
public class GoModel {
	
	/**
	 * ��������
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
