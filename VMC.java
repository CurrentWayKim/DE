import java.util.ArrayList;
import java.util.Scanner;

public class VMC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>(); // 배열 만들기
		for (int j = 0; j < 100000; j++) {a.add(0);} // 배열 늘리기 ( 문제 조건이 100,000 까지 임 )
		int l = 99999;
		int totalCount = in.nextInt(); // 다항식 갯수 받기
		for (int i = 0; i < totalCount; i++) {
			String Alpha = in.next();  // 변수 이름 받기 ( 사실 필요 없음 )
			int M = in.nextInt(); // 항의 수 받기
			for (int m = 0; m < M; m++) {
				int C = in.nextInt();  // 항의 계수
				int E = in.nextInt();  // 항의 지수
				int S = a.get(E) + C;  // 계수 더하기
				a.set(E, S);  // 계수 지정
			}
		}
		int count = 0;  // count 변수로 항의 수 기록
		for (int i = l; i > -1; i--) {  // 뒤에서부터 0이 아닌 ( 계수가 있는 ) 지수를 카운트 하는 for 문
			if (a.get(i) != 0) { // 만약 계수가 0 이 아닐시
				count = count + 1; // 카운트에 하나를 더한다.
			}
		}
		System.out.println(count);  
		for (int i = l; i > -1; i--) {  // 뒤에서부터 계수가 0이 아닌 것을 확인, 계수 - 지수 순으로 출력해주는 for문
			if (a.get(i) != 0) {  // 만약 계수가 0 이 아닐시
				System.out.println(a.get(i));
				System.out.println(i);
			}
		}

	}
}
