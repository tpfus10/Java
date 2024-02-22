package Practice;

public class MatrixProblem {
	
	 int[][] mA = { //3*4
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
	};
	
	 int[][] mB = { //4*3
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
			{10, 11, 12}
	};
	
	Integer [][] mR = new Integer[3][3];
	
	public void multiple() {
		for(int i = 0; i < mA.length; i++) {
			for(int j = 0; j < mA[i].length; j++) {
				for(int k = 0; k < mB[j].length; k++) {
					mR [i][j] +=  mA[i][k]*mB[k][j];
					
				}
			}
		}
	}
	
	public void print() {
		multiple();
		for(int i = 0; i < mR.length; i++) {
			for(int j = 0; j <mR[i].length; j++) {
				System.out.println(mR[i][j]);
				System.out.println("\t");
			}
		}
	}

	public static void main(String[] args) {
		MatrixProblem t1 = new MatrixProblem();
		t1.multiple();
		t1.print();
    }
  }

	