package newspaper;

import java.util.ArrayList;
import java.util.Scanner;

class VS {
	String filter(String Input, int From, int To) {
		String Output = Input.substring(From, Input.length() - To);
		return Output;

	}
}

public class Omega {

	public static void main(String[] args) {
		VS c = new VS();
		Scanner in = new Scanner(System.in);
		String Target = in.nextLine();

		String TS[] = Target.split(" ");
		// System.out.println(TS[3]);
		int Count = in.nextInt();
		String[] NM = new String[Count];
		String[] TT = new String[Count];
		String[] JN = new String[Count];
		String[] VL = new String[Count];
		String NB;
		String PG;
		String[] YR = new String[Count];
		int j = 0;
		int l = 0;
		int k = 0;
		int m = 0;
		int Year = 0;
		String[] Output = new String[Count];
		ArrayList<String> a = new ArrayList<>();
		for (int i = 0; i <= Count *10; i++) {
			a.add(in.nextLine());
			// System.out.println(a);
		}
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).contains("auth")) {
				NM[j] = c.filter(a.get(i), 10, 2); // a.get(i).substring(9, a.get(i).length() - 2);
				j++;
			}
			if (a.get(i).contains("ye")) {
				YR[Year] = c.filter(a.get(i), 8, 1); // a.get(i).substring(9, a.get(i).length() - 2);
				System.out.println(YR[Year]);
				Year++;
			}
			if (a.get(i).contains("tit")) {
				TT[l] = c.filter(a.get(i), 9, 3); // a.get(i).substring(9, a.get(i).length() - 2);
				l++;
			}
			if (a.get(i).contains("vol")) {
				VL[k] = c.filter(a.get(i), 10, 3); // a.get(i).substring(9, a.get(i).length() - 2);
				k++;
			}
			if (a.get(i).contains("jour")) {
				JN[m] = a.get(i).substring(11, a.get(i).length() - 2);
				m++;
			}
			// System.out.println(a.get(i));
			// System.out.println(TT[i]);
		}
		System.out.println();
		for (int i = 0; i < TT.length; i++) {
			System.out.print(NM[i]+"; ");
			System.out.print("("+YR[i]+") ");
			System.out.print("\"" + TT[i] + ".\" ");
			System.out.print(JN[i]+", ");
			System.out.println(VL[i]+"");
		}
	
	}

}
