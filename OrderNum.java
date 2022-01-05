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
		//번호를 한번에 배열로 만들어서 그 배열에 나오는 수를 count 해서 문제를 풀고싶었으나, 그 방법을 잘 모르겠어서
		//result가 가장 작을 때는 배열화 했을 때 7자리, 가장 클때는 9자리인것을 참고해서 if-else if 를 이용해 케이스를 나누었다
		
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