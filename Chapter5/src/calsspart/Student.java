package calsspart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName +"," + address);
		//�޼ҵ� �߰� �̸�, �ּ� ���
	}
	public String getStudentName() {//��ȯ�� ����, �ŰԺ��� ����
		return studentName;
	}

	public void setStudentName(String name) {//�ŰԺ��� ����, ��ȯ�� ����
		studentName = name;
	}
	

}
