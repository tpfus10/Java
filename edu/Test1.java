package edu;
public class Test1 {
	public static void main(String[] args) {
		{
		//한 라인에 하나만 훌력하는 코드임
		System.out.println("이름 : 이세련");
		System.out.println("성별 : 여");
		System.out.println("학교 : 부산대학교");
		System.out.println("나이 : 25");
	}
		System.out.println("=".repeat(10));
	{
		//한 라인에 전체를 한꺼번에 출력하는 코드
		//\t : 탭 키 삽입
		//\n : 다음줄로 이동
		System.out.print("이름 : 이세련\t");
		System.out.print("성별 : 여\t");
		System.out.print("학교 : 부산대학교\t");
		System.out.print("나이 : 25\t");
	}
  }
}