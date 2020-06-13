import java.io.*;
import java.util.*;

public class ccc20j2 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int p = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();

		int day = 0;
		int bad = n;
		int infect = n;
		while (bad <= p) {
			infect *= r;
			bad += infect;
			day++;
		}

		System.out.println(day);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}