package Lambda;
import java.io.*;
import java.util.*;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	
	public PerformOperation isOdd() {
		return n -> n % 2 != 0;	
	}
	
	public PerformOperation isPrime() {
		return (n) -> {
			int i, m = 0, flag = 0;

			m = n / 2;
			if (n == 0 || n == 1) {
				System.out.println(n + " is not prime number");
			} else {
				for (i = 2; i <= m; i++) {
					if (n % i == 0) {
						System.out.println(n + " is not prime number");
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					return true;
				} 
			} // end of else
			return false;
		};
	}
	
	public PerformOperation isPalindrome() {
		return (n) -> {
			String rev = "";

			String str = String.valueOf(n);
			int length = str.length();

			for (int i = length - 1; i >= 0; i--)
				rev = rev + str.charAt(i);

			if (str.equals(rev))
				return true;

		return false;
		};
	}
}

public class Lambda {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
