import java.util.Scanner;
public class OrderNum {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		
		int count = 0;
		int result = a*b*c;
		int[] numarray;
		//��ȣ�� �ѹ��� �迭�� ���� �� �迭�� ������ ���� count �ؼ� ������ Ǯ��;�����, �� ����� �� �𸣰ھ
		//result�� ���� ���� ���� �迭ȭ ���� �� 7�ڸ�, ���� Ŭ���� 9�ڸ��ΰ��� �����ؼ� if-else if �� �̿��� ���̽��� ��������
		
		if(result >= 100000000) {
			numarray = new int[9];
			for(int i=1; i<=9; i++)
				numarray[i-1] = result / (int) Math.pow(10, i);
		}
		else if(result >= 10000000) {
			numarray = new int[8];
			for(int i=1; i<=8; i++)
				numarray[i-1] = result / (int) Math.pow(10, i);
		}
		else {
			numarray = new int[7];
			for(int i=1; i<=7; i++)
				numarray[i-1] = result / (int) Math.pow(10, i);
		}
		
		for(int order=1; order<=9; order++) {
			for(int k=0; k<numarray.length; k++) {
				if(numarray[k] == order) {
					count++;
				}
				else
					continue;
			}
			System.out.println(count);
			count = 0;
		}
		num.close();
	}
}