package Practice;

public class Gugudan {
	
	public void print (int i) {
		System.out.println(i + "단");
		for(int j=1; j<10; j++) {
			System.out.println(i + "X" + j + "=" + i*j);
		}
	} 
}
