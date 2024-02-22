package com.ruby.java.ch06;
//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
* static 멤버 함수 구현
* toString() 함수 구현과 사용
* 객체 배열 사용
*/
abstract class InterfaceStudents {
	public abstract void showObject();
}
class Student extends InterfaceStudents {
	static int countStudents;// 객체수(객체가 하나 증가할 때마다 1씩 증가)
	int sid;// 학번
	String sname; // 학생 이름
	String city; // 주소 도시
	public Student() { // default 생성자
		sid = 0;
		sname = null;
		city = null;
		countStudents++;
	}
	public Student(int sid) {
		this();// super는 맨 위에 해야 함;디폴트 생성자 호출
		this.sid = sid;
		// sname=null;city=null;
		// countStudents++;
	}
	public Student(int sid, String name, String city) {
		this(sid);// super는 맨 위에 해야 함;디폴트 생성자 호출
		this.sname = name;
		this.city = city;
		// sname=null;city=null;
		// countStudents++;
	}
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", city=" + city;
	}
	public void showObject() {
		System.out.println("[" + sid + ", " + sname + ", " + city + "]");
	}
	static void showNumberObjects() {// 생성된 객체수를 출력한다.
		System.out.println("생성객체수=" + countStudents);
	}
}
class WorkStudent extends Student {
	String eno;
	String company;
	public WorkStudent(int id, String sname, String city, String eno, String company) {
//		this.sid = id; //헷갈리지 않게 웬만하면 같게
//		this.sname = sname;
//		this.city = city;
		super(id, sname, city);
		this.eno = eno;
		this.company = company;
	}
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", city=" + city + ", eno=" + eno + ", company=" + company;
	}
	public void showObject() {
		System.out.println("[" + sid + ", " + sname + ", " + city + "]");
		System.out.println("[" + eno + ", " + company + "]");
	}
}
class CodingWorkStudent extends WorkStudent {
	String language;
	public CodingWorkStudent(int id, String sname, String city, String eno, String company, String language) {
		super(id, sname, city, eno, company);
		this.language = language;
	}
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", city=" + city + ", eno=" + eno + ", company=" + company
				+ ",language=" + language;
	}
	public void showObject() {
		System.out.println("[" + sid + ", " + sname + ", " + city + "]");
		System.out.println("[" + eno + ", " + company + "]");
		System.out.println("[" + language + "]");
	}
}
// 생성자 구현한다.
public class Test_객체배열 {
	static void showObjects(InterfaceStudents is) {
		is.showObject(); // InterfaceStudents 유형의 객체를 인수로 받아 showObject() 메서드를 호출하여 객체에 대한 정보를 표시함
	}
	public static void main(String[] args) {
		Student arry[] = new Student[5];
		Student.showNumberObjects();
		// 각 인덱스에 객체 할당
		arry[0] = new Student(); // default 생성자
		arry[1] = new Student(202301);
		arry[2] = new Student(202301, "Hong", "pusan");
		arry[3] = new WorkStudent(202301, "Hong", "pusan", "eno", "LG");
		arry[4] = new CodingWorkStudent(202301, "Hong", "pusan", "eno", "LG", "Java");
		
		Student.showNumberObjects();
		System.out.println();
		for (Student s : arry) {
			System.out.println(s.toString());
		}
		System.out.println();
		for (Student sx : arry) {
			if (sx instanceof Student) {
				((Student) sx).showObject();
			} else if (sx instanceof WorkStudent) {
				((WorkStudent) sx).showObject();
			} else if (sx instanceof CodingWorkStudent) {
				((CodingWorkStudent) sx).showObject();
			}
		}
	}
}