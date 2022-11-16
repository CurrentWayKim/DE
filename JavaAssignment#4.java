
import java.util.ArrayList;
import java.util.Scanner;

public class Omega {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Target = in.nextLine();
		int Count = in.nextInt();
		String NM;
		String[] TT = new String[Count];
		String[] JN = new String[Count];
		String VL;
		String NB;
		String PG;
		String YR;
		int l = 0;
		int m = 0;
		String[] Output = new String[Count];
		ArrayList<String> a = new ArrayList<>();
		for (int i = 0; i <= Count * 10; i++) {
			a.add(in.nextLine());
			// System.out.println(a);
		}
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).contains("tit")) {
				TT[l] = a.get(i).substring(9, a.get(i).length() - 2);
				l++;
			}
			if (a.get(i).contains("jour")) {
				JN[m] = a.get(i).substring(11, a.get(i).length() - 2);
				m++;
			}
			// System.out.println(a.get(i));
			// System.out.println(TT[i]);
		}
		for (int i = 0; i < TT.length; i++) {
			System.out.println(TT[i]);
		}
		for (int i = 0; i < JN.length; i++) {
			System.out.println(JN[i]);
		}
		// System.out.println(TT);
		// String a = in.next();
		// String[] B = a.split("\r");
		// System.out.println(B.length);
		// for (int i = 0; i < B.length; i++)
		// System.out.println(B[i]);
	}

}
