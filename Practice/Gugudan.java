package Practice;

public class Gugudan {
	
//	public void print (int i) {
//		System.out.println(i + "단");
//		for(int j=1; j<10; j++) {
//			System.out.println(i + "X" + j + "=" + i*j);
//		}
//	} 
	
//	public void printHorizontal() {
//		for(int i=1; i<10; i++) {
//			for(int j=2; j<10; j++) {
//				System.out.print(j + "X" + i + "=" + j*i + "\t");}
//			System.out.println();
//		}
//	}
	
	public void printColumn(int col) {
		for(int i=1; i<10; i++) {
			for(int j=2; j<col+2; j++) {
				System.out.print(j + "X" + i + "=" + j*i + "\t");}
			System.out.println();
		}
	}
}
