package edu;

public class T1 {
	
	public static void main(String[] args) {
		
		int num = 2341;
		String strNum = Integer.toString(num);

			for(int i=10; i<Math.pow(10, strNum.length()); i*=10) {
				int num_s = ((num-num%i)/i);
				System.out.println(num_s);
			}
	}

}
