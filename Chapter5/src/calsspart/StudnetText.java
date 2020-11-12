package calsspart;

public class StudnetText {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName ="이순신";
		studentLee.studentID=100;
		studentLee.address ="서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName ="이순신";
		studentKim.studentID=101;
		studentKim.address ="미국 산호세";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
