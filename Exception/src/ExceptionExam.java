
public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		try {
		int k = i/j;
		System.out.println(k);
		
		}catch(ArithmeticException e) {
		System.out.println("0���� ���� �� �����ϴ�."+e.toString());
		
		}finally {
		System.out.println("������ �߻��ߵ� �߻����� �ʾҵ� ������ ����!!");
			}
		
		System.out.println("main end!!");
		

	}

}
// 1. ������ �߻��� ���� �κ��� try��� �������� ���α�
// 2. �߻��� ������ ���õ� Exception�� catch��� ���Ͽ��� ó��
// 3. ������ �߻��ߵ� ���ߵ� ������ ����Ǵ� finally��� ������ ���� �� �ִ�.
// 4. finally ������ ���� ����