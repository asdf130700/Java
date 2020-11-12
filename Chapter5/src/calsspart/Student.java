package calsspart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName +"," + address);
		//메소드 추가 이름, 주소 출력
	}
	public String getStudentName() {//반환값 있음, 매게변수 있음
		return studentName;
	}

	public void setStudentName(String name) {//매게변수 있음, 반환값 없음
		studentName = name;
	}
	

}
