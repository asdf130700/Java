package calsspart;

public class StudnetText {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName ="�̼���";
		studentLee.studentID=100;
		studentLee.address ="����� �������� ���ǵ���";
		
		Student studentKim = new Student();
		studentKim.studentName ="�̼���";
		studentKim.studentID=101;
		studentKim.address ="�̱� ��ȣ��";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}