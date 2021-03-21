import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class FindThePath {
	InputStream is;
	PrintWriter out;
	String INPUT = "";

	void solve() {
		int n = ni(), m = ni();
		int[][] a = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[j][i] = ni();
			}
		}
		d = new long[m][n][][];

		build(0, m, a);

		int Q = ni();
		for (int q = 0; q < Q; q++) {
			int sc = ni(), sr = ni();
			int tc = ni(), tr = ni();
			if (sr > tr) {
				{
					int du = tr;
					tr = sr;
					sr = du;
				}
				{
					int du = tc;
					tc = sc;
					sc = du;
				}
			}
			out.println(go(0, m, sr, sc, tr, tc, a));
		}

	}

	static long go(int L, int R, int sr, int sc, int tr, int tc, int[][] a) {
		int M = L + R >>> 1;
		int m = a[0].length;
		long ret = Long.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			ret = Math.min(ret, d[M][i][sr - L][sc] + d[M][i][tr - L][tc] - a[M][i]);
		}
		if (sr <= M && M <= tr) {
			return ret;
		}
		if (R - L <= 1)
			return ret;
		if (tr < M) {
			return Math.min(ret, go(L, M, sr, sc, tr, tc, a));
		} else {
			return Math.min(ret, go(M, R, sr, sc, tr, tc, a));
		}
	}

	static long[][][][] d;

	static void build(int L, int R, int[][] a) {
		int m = a[0].length;
		int M = L + R >>> 1;
		if (d[M][0] != null)
			return;
		for (int i = 0; i < m; i++) {
			d[M][i] = dijk(a, M, i, L, R);
		}
		if (R - L <= 1)
			return;
		build(L, M, a);
		build(M, R, a);
	}

	public static long[][] dijk(int[][] a, int sr, int sc, int L, int R) {
		int m = a[0].length;
		long[][] td = new long[R - L][m];
		for (int i = 0; i < R - L; i++) {
			Arrays.fill(td[i], Long.MAX_VALUE / 3);
		}
		td[sr - L][sc] = 0;
		MinHeapL q = new MinHeapL((R - L) * m);
		q.add((sr - L) * m + sc, 0L);
		td[sr - L][sc] = a[sr][sc];

		int[] dr = { 1, 0, -1, 0 };
		int[] dc = { 0, 1, 0, -1 };

		while (q.size() > 0) {
			int cur = q.argmin();
			q.remove(cur);

			int r = cur / m, c = cur % m;
			for (int k = 0; k < 4; k++) {
				int nr = r + dr[k], nc = c + dc[k];
				if (nr >= L - L && nr < R - L && nc >= 0 && nc < m) {
					long nd = td[r][c] + a[nr + L][nc];
					if (nd < td[nr][nc]) {
						td[nr][nc] = nd;
						q.update(nr * m + nc, nd);
					}
				}
			}
		}

		return td;
	}

	public static class MinHeapL {
		public long[] a;
		public int[] map;
		public int[] imap;
		public int n;
		public int pos;
		public static long INF = Long.MAX_VALUE;

		public MinHeapL(int m) {
			n = Integer.highestOneBit((m + 1) << 1);
			a = new long[n];
			map = new int[n];
			imap = new int[n];
			Arrays.fill(a, INF);
			Arrays.fill(map, -1);
			Arrays.fill(imap, -1);
			pos = 1;
		}

		public long add(int ind, long x) {
			int ret = imap[ind];
			if (imap[ind] < 0) {
				a[pos] = x;
				map[pos] = ind;
				imap[ind] = pos;
				pos++;
				up(pos - 1);
			}
			return ret != -1 ? a[ret] : x;
		}

		public long update(int ind, long x) {
			int ret = imap[ind];
			if (imap[ind] < 0) {
				a[pos] = x;
				map[pos] = ind;
				imap[ind] = pos;
				pos++;
				up(pos - 1);
			} else {
				a[ret] = x;
				up(ret);
				down(ret);
			}
			return x;
		}

		public long remove(int ind) {
			if (pos == 1)
				return INF;
			if (imap[ind] == -1)
				return INF;

			pos--;
			int rem = imap[ind];
			long ret = a[rem];
			map[rem] = map[pos];
			imap[map[pos]] = rem;
			imap[ind] = -1;
			a[rem] = a[pos];
			a[pos] = INF;
			map[pos] = -1;

			up(rem);
			down(rem);
			return ret;
		}

		public long min() {
			return a[1];
		}

		public int argmin() {
			return map[1];
		}

		public int size() {
			return pos - 1;
		}

		private void up(int cur) {
			for (int c = cur, p = c >>> 1; p >= 1 && a[p] > a[c]; c >>>= 1, p >>>= 1) {
				long d = a[p];
				a[p] = a[c];
				a[c] = d;
				int e = imap[map[p]];
				imap[map[p]] = imap[map[c]];
				imap[map[c]] = e;
				e = map[p];
				map[p] = map[c];
				map[c] = e;
			}
		}

		private void down(int cur) {
			for (int c = cur; 2 * c < pos;) {
				int b = a[2 * c] < a[2 * c + 1] ? 2 * c : 2 * c + 1;
				if (a[b] < a[c]) {
					long d = a[c];
					a[c] = a[b];
					a[b] = d;
					int e = imap[map[c]];
					imap[map[c]] = imap[map[b]];
					imap[map[b]] = e;
					e = map[c];
					map[c] = map[b];
					map[b] = e;
					c = b;
				} else {
					break;
				}
			}
		}
	}

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new FindThePath().run();
	}

	private byte[] inbuf = new byte[1024];
	private int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
