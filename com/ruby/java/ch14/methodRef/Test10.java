package com.ruby.java.ch14.methodRef;

interface StringFunc {
	String modify(String s);
}

public class Test10 {
	
	/*static*/ String func(String s) { //수정: static 제어자 삭제
		String result = "";
		char c;
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if(c == ',')
				result += " ";
			else 
				result += c;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Test10 obj = new Test10(); // 수정: 인스턴스 메소드 참조->인스턴스를 생성해야 함 (기존: static 메소드 참조)
		StringFunc sf = obj::func;
		
		/*StringFunc sf = Test10::func;//전제 조건: static 메소드와 인터페이스의 매개변수/리턴값 타입이 같아야 함*/
		
		String str = "Korea, Australia, China, Germany, Span, Turkey";
		String result = sf.modify(str);
		System.out.println(result);
		
		String str2 = "서울, 북경, 도쿄, 뉴욕, 발리";
		String result2 = sf.modify(str2);
		System.out.println(result2);	
	}

}
