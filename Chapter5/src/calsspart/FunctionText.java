package calsspart;

public class FunctionText {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}
	public static int addNum(int n1, int n2) {//값을 복사해서 받는 역할을 함 num1과 상관 없음 받는 값은 상관 없음 값이 복사되는 것
		int result = n1 + n2;
		return result;
	}

}
